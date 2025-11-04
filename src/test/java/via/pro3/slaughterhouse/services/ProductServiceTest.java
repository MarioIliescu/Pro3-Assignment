package via.pro3.slaughterhouse.services;


import com.slaughterhouse.grpc.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import via.pro3.slaughterhouse.model.Product;
import via.pro3.slaughterhouse.repositories.ProductRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void createProduct() {
        Product entity = new Product();
        entity.setId(1);
        entity.setName("Beef Pack");
        entity.setDescription("Premium beef cut");

        CreateProductRequest request = CreateProductRequest.newBuilder()
                .setProduct(com.slaughterhouse.grpc.ProductProto.newBuilder()
                        .setId(1)
                        .setName("Beef Pack")
                        .setDescription("Premium beef cut")
                        .build())
                .build();

        when(productRepository.save(any(Product.class))).thenReturn(entity);

        // when
        CreateProductResponse response = productService.createProduct(request);

        // then
        assertNotNull(response);
        assertEquals("Beef Pack", response.getProduct().getName());
        assertEquals("Premium beef cut", response.getProduct().getDescription());
        verify(productRepository, times(1)).save(any(Product.class));
    }

    @Test
    void getProduct() {
        Product entity = new Product();
        entity.setId(2);
        entity.setName("Pork Pack");
        entity.setDescription("Pork ribs");

        when(productRepository.findById(2)).thenReturn(Optional.of(entity));

        com.slaughterhouse.grpc.ProductProto result = productService.getProduct(2);

        assertNotNull(result);
        assertEquals(2, result.getId());
        assertEquals("Pork Pack", result.getName());
        assertEquals("Pork ribs", result.getDescription());
    }
    // - not found
    @Test
    void getProduct_ReturnsNullIfNotFound() {
        when(productRepository.findById(100)).thenReturn(Optional.empty());

        com.slaughterhouse.grpc.ProductProto result = productService.getProduct(100);

        assertNull(result);
    }
    @Test
    void deleteProduct() {
        when(productRepository.existsById(5)).thenReturn(true);

        DeleteResponse response = productService.deleteProduct(5);

        assertFalse(response.hasError());
        verify(productRepository).deleteById(5);
    }
    //  not found
    @Test
    void deleteProduct_ShouldReturnErrorIfNotFound() {
        when(productRepository.existsById(42)).thenReturn(false);

        DeleteResponse response = productService.deleteProduct(42);

        assertTrue(response.hasError());
        assertEquals(404, response.getError().getCode());
        assertEquals("Product not found", response.getError().getMessage());
        verify(productRepository, never()).deleteById(anyInt());
    }

    @Test
    void listProducts() {
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Bacon");
        p1.setDescription("Smoked bacon");

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Ham");
        p2.setDescription("Sliced ham");

        List<Product> entities = Arrays.asList(p1, p2);

        when(productRepository.findAll()).thenReturn(entities);

        ListProductsResponse response = productService.listProducts();

        assertEquals(2, response.getProductsCount());
        assertEquals("Bacon", response.getProducts(0).getName());
        verify(productRepository).findAll();
    }
}