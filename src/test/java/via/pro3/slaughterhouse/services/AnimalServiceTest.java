package via.pro3.slaughterhouse.services;

import com.slaughterhouse.grpc.CreateAnimalRequest;
import com.slaughterhouse.grpc.CreateAnimalResponse;
import com.slaughterhouse.grpc.DeleteResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import via.pro3.slaughterhouse.model.Animal;
import via.pro3.slaughterhouse.repositories.AnimalRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AnimalServiceTest {

    @Mock
    private AnimalRepository animalRepository;

    @InjectMocks
    private AnimalService animalService;

    // ---------- createAnimal(CreateAnimalRequest) ----------
    @Test
    void createAnimal_withProtoRequest_returnsSavedAnimalInfo()
    {
        // 1) Build a simple request
        var reqAnimal = com.slaughterhouse.grpc.Animal.newBuilder()
                .setRegistrationNumber("REG-1")
                .setWeight(55.5)
                .build();
        CreateAnimalRequest request = CreateAnimalRequest.newBuilder()
                .setAnimal(reqAnimal)
                .build();

        // 2) When saving, simulate DB assigning an ID
        when(animalRepository.save(any(Animal.class))).thenAnswer(inv -> {
            Animal a = inv.getArgument(0);
            a.setId(1L);
            return a;
        });

        // 3) Call service
        CreateAnimalResponse response = animalService.createAnimal(request);

        // 4) Check basics
        assertNotNull(response);
        var out = response.getAnimal();
        assertEquals(1L, out.getId());
        assertEquals("REG-1", out.getRegistrationNumber());
        assertEquals(55.5, out.getWeight(), 0.0001);
        assertTrue(out.hasArrivalTime());

        verify(animalRepository).save(any(Animal.class));
    }

    // ---------- createAnimal(Animal) ----------
    @Test
    void createAnimal_withEntity_returnsEntityWithIdAndArrivalTime()
    {
        Animal input = new Animal();
        input.setRegistrationNumber("REG-2");
        input.setWeight(70.0);

        when(animalRepository.save(any(Animal.class))).thenAnswer(inv -> {
            Animal a = inv.getArgument(0);
            a.setId(2L);
            return a;
        });

        Animal saved = animalService.createAnimal(input);

        assertNotNull(saved);
        assertEquals(2L, saved.getId());
        assertEquals("REG-2", saved.getRegistrationNumber());
        assertEquals(70.0, saved.getWeight(), 0.0001);
        assertNotNull(saved.getArrivalTime());

        verify(animalRepository).save(any(Animal.class));
    }

    // ---------- listAnimals() ----------
    @Test
    void listAnimals_mapsAllEntitiesToProto()
    {
        // Prepare two simple entities from the DB
        Animal a1 = new Animal(); a1.setId(1L); a1.setRegistrationNumber("R1"); a1.setWeight(10); a1.setArrivalTime(LocalDateTime.now().minusHours(1));
        Animal a2 = new Animal(); a2.setId(2L); a2.setRegistrationNumber("R2"); a2.setWeight(20); a2.setArrivalTime(LocalDateTime.now().minusMinutes(30));
        when(animalRepository.findAll()).thenReturn(List.of(a1, a2));

        var resp = animalService.listAnimals();

        assertEquals(2, resp.getAnimalsCount());
        assertEquals(1L, resp.getAnimals(0).getId());
        assertEquals("R1", resp.getAnimals(0).getRegistrationNumber());
        assertEquals(2L, resp.getAnimals(1).getId());
        assertEquals("R2", resp.getAnimals(1).getRegistrationNumber());

        verify(animalRepository).findAll();
    }

    // ---------- getAnimal(id) ----------
    @Test
    void getAnimal_whenExists_returnsProto()
    {
        Animal entity = new Animal();
        entity.setId(9L);
        entity.setRegistrationNumber("R9");
        entity.setWeight(90.0);
        entity.setArrivalTime(LocalDateTime.now());

        when(animalRepository.findById(9L)).thenReturn(Optional.of(entity));

        var proto = animalService.getAnimal(9L);

        assertNotNull(proto);
        assertEquals(9L, proto.getId());
        assertEquals("R9", proto.getRegistrationNumber());

        verify(animalRepository).findById(9L);
    }

    // ---------- deleteAnimal(id) ----------
    @Test
    void deleteAnimal_whenExists_deletesAndReturnsNoError()
    {
        when(animalRepository.existsById(5L)).thenReturn(true);

        DeleteResponse resp = animalService.deleteAnimal(5L);

        verify(animalRepository).existsById(5L);
        verify(animalRepository).deleteById(5L);

        // No error set -> defaults to code 0 and empty message
        assertEquals(0, resp.getError().getCode());
        assertEquals("", resp.getError().getMessage());
    }
}