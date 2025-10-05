package via.pro3.slaughterhouse.services;

import com.slaughterhouse.grpc.*;
import com.google.protobuf.Timestamp;
import org.springframework.stereotype.Service;
import via.pro3.slaughterhouse.model.Animal;
import via.pro3.slaughterhouse.repositories.AnimalRepository;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public CreateAnimalResponse createAnimal(CreateAnimalRequest request) {
        Animal entity = new Animal();
        entity.setRegistrationNumber(request.getAnimal().getRegistrationNumber());
        entity.setWeight(request.getAnimal().getWeight());
        entity.setArrivalTime(LocalDateTime.now());

        animalRepository.save(entity);

        com.slaughterhouse.grpc.Animal protoAnimal = com.slaughterhouse.grpc.Animal.newBuilder()
                .setId(entity.getId())  // Long maps to proto int64
                .setRegistrationNumber(entity.getRegistrationNumber())
                .setWeight(entity.getWeight())
                .setArrivalTime(Timestamp.newBuilder()
                        .setSeconds(entity.getArrivalTime().atZone(ZoneId.systemDefault()).toEpochSecond())
                        .build())
                .build();

        return CreateAnimalResponse.newBuilder()
                .setAnimal(protoAnimal)
                .build();
    }
   public Animal createAnimal(Animal request) {
        Animal entity = new Animal();
        entity.setRegistrationNumber(request.getRegistrationNumber());
        entity.setWeight(request.getWeight());
        entity.setArrivalTime(LocalDateTime.now());

        animalRepository.save(entity);

        com.slaughterhouse.grpc.Animal protoAnimal = com.slaughterhouse.grpc.Animal.newBuilder()
                .setId(entity.getId())  // Long maps to proto int64
                .setRegistrationNumber(entity.getRegistrationNumber())
                .setWeight(entity.getWeight())
                .setArrivalTime(Timestamp.newBuilder()
                        .setSeconds(entity.getArrivalTime().atZone(ZoneId.systemDefault()).toEpochSecond())
                        .build())
                .build();

        return entity;
    }

    public ListAnimalsResponse listAnimals() {
        List<com.slaughterhouse.grpc.Animal> animals = animalRepository.findAll().stream()
                .map(entity -> com.slaughterhouse.grpc.Animal.newBuilder()
                        .setId(entity.getId())
                        .setRegistrationNumber(entity.getRegistrationNumber())
                        .setWeight(entity.getWeight())
                        .setArrivalTime(Timestamp.newBuilder()
                                .setSeconds(entity.getArrivalTime().atZone(ZoneId.systemDefault()).toEpochSecond())
                                .build())
                        .build())
                .collect(Collectors.toList());

        return ListAnimalsResponse.newBuilder()
                .addAllAnimals(animals)
                .build();
    }

    public com.slaughterhouse.grpc.Animal getAnimal(Long id) {
        return animalRepository.findById(id)
                .map(entity -> com.slaughterhouse.grpc.Animal.newBuilder()
                        .setId(entity.getId())
                        .setRegistrationNumber(entity.getRegistrationNumber())
                        .setWeight(entity.getWeight())
                        .setArrivalTime(Timestamp.newBuilder()
                                .setSeconds(entity.getArrivalTime().atZone(ZoneId.systemDefault()).toEpochSecond())
                                .build())
                        .build())
                .orElse(null);
    }

    public DeleteResponse deleteAnimal(Long id) {
        DeleteResponse.Builder response = DeleteResponse.newBuilder();
        if (animalRepository.existsById(id)) {
            animalRepository.deleteById(id);
        } else {
            response.setError(com.slaughterhouse.grpc.Error.newBuilder()
                    .setCode(404)
                    .setMessage("Animal not found")
                    .build());
        }
        return response.build();
    }
}
