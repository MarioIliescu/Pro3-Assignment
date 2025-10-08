package via.pro3.slaughterhouse.services;


import com.slaughterhouse.grpc.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import via.pro3.slaughterhouse.model.AnimalPart;
import via.pro3.slaughterhouse.repositories.AnimalPartRepository;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AnimalPartServiceTest {

    @Mock
    private AnimalPartRepository partRepository;

    @InjectMocks
    private AnimalPartService animalPartService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void create() {
        CreateAnimalPartRequest request = CreateAnimalPartRequest.newBuilder()
                .setPart(com.slaughterhouse.grpc.AnimalPart.newBuilder()
                        .setId(1)
                        .setAnimalId(101)
                        .setWeight(22.5)
                        .setPartType("Leg")
                        .build())
                .build();

        AnimalPart savedEntity = new AnimalPart();
        savedEntity.setId(1);
        savedEntity.setAnimalId(101);
        savedEntity.setWeight(22.5);
        savedEntity.setPartType("Leg");

        when(partRepository.save(any(AnimalPart.class))).thenReturn(savedEntity);

        // when
        CreateAnimalPartResponse response = animalPartService.create(request);

        // then
        assertNotNull(response);
        assertEquals("Leg", response.getPart().getPartType());
        assertEquals(101, response.getPart().getAnimalId());
        verify(partRepository).save(any(AnimalPart.class));
    }

    @Test
    void listAnimalParts() {
        AnimalPart p1 = new AnimalPart();
        p1.setId(1);
        p1.setAnimalId(100);
        p1.setPartType("Leg");
        p1.setWeight(25.0);

        AnimalPart p2 = new AnimalPart();
        p2.setId(2);
        p2.setAnimalId(200);
        p2.setPartType("Tail");
        p2.setWeight(5.0);

        when(partRepository.findAll()).thenReturn(Arrays.asList(p1, p2));

        ListAnimalPartsResponse response = animalPartService.listAnimalParts();

        assertEquals(2, response.getPartsCount());
        assertEquals("Leg", response.getParts(0).getPartType());
        assertEquals("Tail", response.getParts(1).getPartType());
        verify(partRepository).findAll();
    }

    @Test
    void getAnimalPart() {
        AnimalPart part = new AnimalPart();
        part.setId(10);
        part.setAnimalId(999);
        part.setPartType("Wing");
        part.setWeight(12.0);

        when(partRepository.findById(10)).thenReturn(Optional.of(part));

        com.slaughterhouse.grpc.AnimalPart result = animalPartService.getAnimalPart(10);

        assertNotNull(result);
        assertEquals(10, result.getId());
        assertEquals("Wing", result.getPartType());
        assertEquals(12.0, result.getWeight());
    }

    //  not found
    @Test
    void getAnimalPart_ReturnsNullIfNotFound() {
        when(partRepository.findById(55)).thenReturn(Optional.empty());

        com.slaughterhouse.grpc.AnimalPart result = animalPartService.getAnimalPart(55);

        assertNull(result);
    }


    @Test
    void deleteAnimalPart_ShouldDeleteIfExists() {
        when(partRepository.existsById(5)).thenReturn(true);

        DeleteResponse response = animalPartService.deleteAnimalPart(5);

        assertFalse(response.hasError());
        verify(partRepository).deleteById(5);
    }

    // not found
    @Test
    void deleteAnimalPart_ShouldReturnErrorIfNotFound() {
        when(partRepository.existsById(77)).thenReturn(false);

        DeleteResponse response = animalPartService.deleteAnimalPart(77);

        assertTrue(response.hasError());
        assertEquals(404, response.getError().getCode());
        assertEquals("AnimalPart not found", response.getError().getMessage());
        verify(partRepository, never()).deleteById(anyInt());
    }
}