package via.pro3.slaughterhouse.controllers;

import com.google.protobuf.Timestamp;
import com.slaughterhouse.grpc.AnimalProto;
import com.slaughterhouse.grpc.CreateAnimalRequest;
import com.slaughterhouse.grpc.ListAnimalsResponse;
import org.springframework.web.bind.annotation.*;
import via.pro3.slaughterhouse.model.Animal;
import via.pro3.slaughterhouse.services.AnimalService;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/animal")
public class AnimalController {

  private final AnimalService animalService;

  public AnimalController(AnimalService animalService) {
    this.animalService = animalService;
  }

  //  Create new animal
  @PostMapping
  public Animal newAnimal(@RequestBody CreateAnimalRequest request) {
    var response = animalService.createAnimal(request);
    var animalProto = response.getAnimal();

    Animal animal = new Animal();
    animal.setId(animalProto.getId());
    animal.setRegistrationNumber(animalProto.getRegistrationNumber());
    animal.setOrigin(animalProto.getOrigin());
    animal.setArrivalTime(toLocalDateTime(animalProto.getArrivalTime()));
    animal.setWeight(animalProto.getWeight());
    return animal;
  }

  //  Get by ID (numbers only)
  @GetMapping("/id/{id}")
  public Animal getById(@PathVariable int id) {
    AnimalProto animalProto = animalService.getAnimal(id);

    Animal animal = new Animal();
    animal.setId(animalProto.getId());
    animal.setRegistrationNumber(animalProto.getRegistrationNumber());
    animal.setOrigin(animalProto.getOrigin());
    animal.setArrivalTime(toLocalDateTime(animalProto.getArrivalTime()));
    animal.setWeight(animalProto.getWeight());
    return animal;
  }

  //  Get all by origin (letters only)
  @GetMapping("/origin/{origin}")
  public List<Animal> getByOrigin(@PathVariable String origin) {
    ListAnimalsResponse all = animalService.listAnimals();
    return all.getAnimalsList().stream()
        .filter(a -> a.getOrigin().equalsIgnoreCase(origin))
        .map(this::mapToModel)
        .collect(Collectors.toList());
  }


  //  Get all by date (query param)
  @GetMapping(params = "date")
  public List<Animal> getAllAnimalsByDate(@RequestParam("date") String date) {
    ListAnimalsResponse all = animalService.listAnimals();
    return all.getAnimalsList().stream()
        .map(this::mapToModel)
        .filter(a -> a.getArrivalTime().toLocalDate().toString().equals(date))
        .collect(Collectors.toList());
  }
  @GetMapping
  public List<Animal> getAll()
  {
    ListAnimalsResponse all = animalService.listAnimals();
    return all.getAnimalsList().stream().map(this::mapToModel).toList();
  }
    // Helper: convert proto timestamp → LocalDateTime
  private LocalDateTime toLocalDateTime(Timestamp timestamp) {
    return Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos())
        .atZone(ZoneId.systemDefault())
        .toLocalDateTime();
  }

  // Helper: convert proto → model
  private Animal mapToModel(AnimalProto proto) {
    Animal animal = new Animal();
    animal.setId(proto.getId());
    animal.setRegistrationNumber(proto.getRegistrationNumber());
    animal.setOrigin(proto.getOrigin());
    animal.setArrivalTime(toLocalDateTime(proto.getArrivalTime()));
    animal.setWeight(proto.getWeight());
    return animal;
  }
}
