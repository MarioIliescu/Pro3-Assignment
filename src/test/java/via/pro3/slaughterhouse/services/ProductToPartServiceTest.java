package via.pro3.slaughterhouse.services;

import com.slaughterhouse.grpc.CreateProductToPartRequest;
import com.slaughterhouse.grpc.CreateProductToPartResponse;
import com.slaughterhouse.grpc.DeleteResponse;
import com.slaughterhouse.grpc.ListProductToPartResponse;
import com.slaughterhouse.grpc.ProductToPart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import via.pro3.slaughterhouse.repositories.ProductToPartRepository;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductToPartServiceTest {

    @Mock
    private ProductToPartRepository productToPartRepository;

    @InjectMocks
    private ProductToPartService productToPartService;

    @BeforeEach
    void setUp()
    {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createProductToPart()
    {
        // given
        via.pro3.slaughterhouse.model.ProductToPart entity = new via.pro3.slaughterhouse.model.ProductToPart();
        entity.setId(1);
        entity.setProductId(10);
        entity.setAnimalPartId(20);
        entity.setQuantity(3);

        CreateProductToPartRequest request = CreateProductToPartRequest.newBuilder()
                .setMapping(ProductToPart.newBuilder()
                        .setProductId(10)
                        .setPartId(20)
                        .setQuantity(3)
                        .build())
                .build();

        when(productToPartRepository.save(any(via.pro3.slaughterhouse.model.ProductToPart.class)))
                .thenAnswer(invocation -> {
                    via.pro3.slaughterhouse.model.ProductToPart saved = invocation.getArgument(0);
                    saved.setId(1);
                    return saved;
                });

        // when
        CreateProductToPartResponse response = productToPartService.createProductToPart(request);

        // then
        assertNotNull(response);
        assertTrue(response.hasMapping());
        assertEquals(1, response.getMapping().getId());
        assertEquals(10, response.getMapping().getProductId());
        assertEquals(20, response.getMapping().getPartId());
        assertEquals(3, response.getMapping().getQuantity());
        verify(productToPartRepository, times(1)).save(any(via.pro3.slaughterhouse.model.ProductToPart.class));
    }

    @Test
    void listProductToPart()
    {
        // given
        via.pro3.slaughterhouse.model.ProductToPart m1 = new via.pro3.slaughterhouse.model.ProductToPart();
        m1.setId(1);
        m1.setProductId(10);
        m1.setAnimalPartId(20);
        m1.setQuantity(2);

        via.pro3.slaughterhouse.model.ProductToPart m2 = new via.pro3.slaughterhouse.model.ProductToPart();
        m2.setId(2);
        m2.setProductId(11);
        m2.setAnimalPartId(21);
        m2.setQuantity(5);

        when(productToPartRepository.findAll()).thenReturn(Arrays.asList(m1, m2));

        // when
        ListProductToPartResponse response = productToPartService.listProductToPart();

        // then
        assertNotNull(response);
        assertEquals(2, response.getMappingsCount());
        assertEquals(1, response.getMappings(0).getId());
        assertEquals(2, response.getMappings(1).getId());
        verify(productToPartRepository, times(1)).findAll();
    }

    @Test
    void getProductToPart_found()
    {
        // given
        via.pro3.slaughterhouse.model.ProductToPart m = new via.pro3.slaughterhouse.model.ProductToPart();
        m.setId(7);
        m.setProductId(100);
        m.setAnimalPartId(200);
        m.setQuantity(4);

        when(productToPartRepository.findById(7)).thenReturn(Optional.of(m));

        // when
        com.slaughterhouse.grpc.ProductToPart result = productToPartService.getProductToPart(7);

        // then
        assertNotNull(result);
        assertEquals(7, result.getId());
        assertEquals(100, result.getProductId());
        assertEquals(200, result.getPartId());
        assertEquals(4, result.getQuantity());
        verify(productToPartRepository, times(1)).findById(7);
    }

    @Test
    void getProductToPart_notFound_returnsNull()
    {
        // given
        when(productToPartRepository.findById(999)).thenReturn(Optional.empty());

        // when
        com.slaughterhouse.grpc.ProductToPart result = productToPartService.getProductToPart(999);

        // then
        assertNull(result);
        verify(productToPartRepository, times(1)).findById(999);
    }

    @Test
    void deleteProductToPart_found_deletes()
    {
        // given
        when(productToPartRepository.existsById(3)).thenReturn(true);

        // when
        DeleteResponse response = productToPartService.deleteProductToPart(3);

        // then
        assertNotNull(response);
        assertFalse(response.hasError());
        verify(productToPartRepository, times(1)).existsById(3);
        verify(productToPartRepository, times(1)).deleteById(3);
    }

    @Test
    void deleteProductToPart_notFound_returnsError()
    {
        // given
        when(productToPartRepository.existsById(404)).thenReturn(false);

        // when
        DeleteResponse response = productToPartService.deleteProductToPart(404);

        // then
        assertNotNull(response);
        assertTrue(response.hasError());
        assertEquals(404, response.getError().getCode());
        assertEquals("ProductToPart mapping not found", response.getError().getMessage());
        verify(productToPartRepository, times(1)).existsById(404);
        verify(productToPartRepository, never()).deleteById(anyInt());
    }
}