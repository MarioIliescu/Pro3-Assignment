package via.pro3.slaughterhouse.controllers;

import com.google.protobuf.Timestamp;
import com.slaughterhouse.grpc.AnimalProto;
import com.slaughterhouse.grpc.CreateAnimalRequest;
import com.slaughterhouse.grpc.CreateAnimalResponse;
import com.slaughterhouse.grpc.ListAnimalsResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import via.pro3.slaughterhouse.model.Animal;
import via.pro3.slaughterhouse.services.AnimalService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AnimalControllerTest {

  @Mock
  private AnimalService animalService;

  @InjectMocks
  private AnimalController controller;

  private static Timestamp ts(LocalDateTime ldt) {
    var instant = ldt.atZone(ZoneId.systemDefault()).toInstant();
    return Timestamp.newBuilder()
        .setSeconds(instant.getEpochSecond())
        .setNanos(instant.getNano())
        .build();
  }
  
  @Test
  void newAnimal_returnsMappedAnimalFromService() {
    var reqAnimal = AnimalProto.newBuilder()
        .setRegistrationNumber("REG-123")
        .setOrigin("FarmA")
        .setWeight(42.0)
        .build();
    var request = CreateAnimalRequest.newBuilder()
        .setAnimal(reqAnimal)
        .build();

    var now = LocalDateTime.now();
    var svcProto = AnimalProto.newBuilder()
        .setId(7)
        .setRegistrationNumber("REG-123")
        .setOrigin("FarmA")
        .setWeight(42.0)
        .setArrivalTime(ts(now))
        .build();
    var svcResp = CreateAnimalResponse.newBuilder()
        .setAnimal(svcProto)
        .build();
    when(animalService.createAnimal(any(CreateAnimalRequest.class))).thenReturn(svcResp);

    Animal out = controller.newAnimal(request);

    assertNotNull(out);
    assertEquals(7, out.getId());
    assertEquals("REG-123", out.getRegistrationNumber());
    assertEquals("FarmA", out.getOrigin());
    assertEquals(42.0, out.getWeight(), 1e-9);
    assertEquals(now.getYear(), out.getArrivalTime().getYear()); // compare a few key fields
    assertEquals(now.getMonth(), out.getArrivalTime().getMonth());
    assertEquals(now.getDayOfMonth(), out.getArrivalTime().getDayOfMonth());

    verify(animalService).createAnimal(any(CreateAnimalRequest.class));
  }

  @Test
  void getById_returnsMappedAnimal() {
    var whenTime = LocalDateTime.now().minusHours(3);
    var proto = AnimalProto.newBuilder()
        .setId(99)
        .setRegistrationNumber("R-99")
        .setOrigin("FarmZ")
        .setWeight(88.5)
        .setArrivalTime(ts(whenTime))
        .build();

    when(animalService.getAnimal(99)).thenReturn(proto);

    Animal out = controller.getById(99);

    assertNotNull(out);
    assertEquals(99, out.getId());
    assertEquals("R-99", out.getRegistrationNumber());
    assertEquals("FarmZ", out.getOrigin());
    assertEquals(88.5, out.getWeight(), 1e-9);
    assertEquals(whenTime.toLocalDate(), out.getArrivalTime().toLocalDate());

    verify(animalService).getAnimal(99);
  }

  @Test
  void getByOrigin_filtersCaseInsensitive() {
    var t1 = LocalDateTime.now().minusDays(1);
    var t2 = LocalDateTime.now();

    var p1 = AnimalProto.newBuilder()
        .setId(1).setRegistrationNumber("A1").setOrigin("farmX").setWeight(10).setArrivalTime(ts(t1)).build();
    var p2 = AnimalProto.newBuilder()
        .setId(2).setRegistrationNumber("A2").setOrigin("FarmY").setWeight(20).setArrivalTime(ts(t2)).build();
    var p3 = AnimalProto.newBuilder()
        .setId(3).setRegistrationNumber("A3").setOrigin("FARmX").setWeight(30).setArrivalTime(ts(t2)).build();

    var list = ListAnimalsResponse.newBuilder()
        .addAnimals(p1).addAnimals(p2).addAnimals(p3)
        .build();

    when(animalService.listAnimals()).thenReturn(list);

    var out = controller.getByOrigin("FaRmX");

    assertEquals(2, out.size());
    assertTrue(out.stream().allMatch(a -> a.getOrigin().equalsIgnoreCase("farmX")));
    assertEquals(List.of(1, 3), out.stream().map(Animal::getId).sorted().toList());

    verify(animalService).listAnimals();
  }
  
  @Test
  void getAllAnimalsByDate_filtersByIsoDateString() {
    LocalDate d1 = LocalDate.now().minusDays(1);
    LocalDate d2 = LocalDate.now();

    var p1 = AnimalProto.newBuilder()
        .setId(10).setRegistrationNumber("B1").setOrigin("Farm1")
        .setWeight(11).setArrivalTime(ts(d1.atStartOfDay().plusHours(8))).build();
    var p2 = AnimalProto.newBuilder()
        .setId(11).setRegistrationNumber("B2").setOrigin("Farm2")
        .setWeight(22).setArrivalTime(ts(d2.atStartOfDay().plusHours(9))).build();
    var p3 = AnimalProto.newBuilder()
        .setId(12).setRegistrationNumber("B3").setOrigin("Farm3")
        .setWeight(33).setArrivalTime(ts(d2.atStartOfDay().plusHours(10))).build();

    var list = ListAnimalsResponse.newBuilder()
        .addAnimals(p1).addAnimals(p2).addAnimals(p3)
        .build();

    when(animalService.listAnimals()).thenReturn(list);

    var out = controller.getAllAnimalsByDate(d2.toString());

    assertEquals(2, out.size());
    assertTrue(out.stream().allMatch(a -> a.getArrivalTime().toLocalDate().equals(d2)));
    assertEquals(List.of(11, 12), out.stream().map(Animal::getId).sorted().toList());

    verify(animalService).listAnimals();
  }
}
