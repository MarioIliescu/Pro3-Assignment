package via.pro3.slaughterhouse.services;

import com.slaughterhouse.grpc.CreateAnimalPartRequest;
import com.slaughterhouse.grpc.CreateAnimalPartResponse;
import via.pro3.slaughterhouse.repositories.AnimalPartRepository;

import com.slaughterhouse.grpc.*;
import com.slaughterhouse.grpc.AnimalPart;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalPartService
{
  private final AnimalPartRepository partRepository;

  public AnimalPartService(AnimalPartRepository partRepository)
  {
    this.partRepository = partRepository;
  }

  public CreateAnimalPartResponse create(CreateAnimalPartRequest request)
  {

    via.pro3.slaughterhouse.model.AnimalPart animalPart =
        new via.pro3.slaughterhouse.model.AnimalPart();
    animalPart.setId(request.getPart().getAnimalId());
    animalPart.setPartType(request.getPart().getPartType());
    animalPart.setWeight(request.getPart().getWeight());

    partRepository.save(animalPart);

    AnimalPart protoAnimalPart = AnimalPart.newBuilder()
        .setId(animalPart.getId())
        .setAnimalId(animalPart.getAnimalId())
        .setPartType(animalPart.getPartType())
        .setWeight(animalPart.getWeight())
        .build();
    return CreateAnimalPartResponse.newBuilder().setPart(protoAnimalPart).build();
  }

  public via.pro3.slaughterhouse.model.AnimalPart createAnimalPart(
      AnimalPart request) {
    via.pro3.slaughterhouse.model.AnimalPart animalPart = new via.pro3.slaughterhouse.model.AnimalPart();
    animalPart.setId(request.getId());
    animalPart.setAnimalId(request.getAnimalId());
    animalPart.setWeight(request.getWeight());
    animalPart.setPartType(request.getPartType());

    partRepository.save(animalPart);

    com.slaughterhouse.grpc.AnimalPart protoAnimalPart = com.slaughterhouse.grpc.AnimalPart.newBuilder()
        .setId(animalPart.getId())  // Long maps to proto int64
        .setPartType(animalPart.getPartType())
        .setAnimalId(animalPart.getAnimalId())
        .setWeight(animalPart.getWeight())
        .build();

    return animalPart;
  }

  public ListAnimalPartsResponse listAnimalParts() {
    List<AnimalPart> animalParts = partRepository.findAll().stream()
        .map(animalPart ->AnimalPart.newBuilder()
            .setId(animalPart.getId())
            .setAnimalId(animalPart.getAnimalId())
            .setWeight(animalPart.getWeight())
            .setPartType(animalPart.getPartType())
            .build())
        .collect(Collectors.toList());

    return ListAnimalPartsResponse.newBuilder()
        .addAllParts(animalParts)
        .build();
  }

  public AnimalPart getAnimalPart(Integer id) {
    return partRepository.findById(id)
        .map(animalPart -> AnimalPart.newBuilder()
            .setId(animalPart.getId())
            .setPartType(animalPart.getPartType())
            .setWeight(animalPart.getWeight())
            .setAnimalId(animalPart.getAnimalId())
            .build())
        .orElse(null);
  }

  public DeleteResponse deleteAnimalPart(Integer id) {
    DeleteResponse.Builder response = DeleteResponse.newBuilder();
    if (partRepository.existsById(id)) {
      partRepository.deleteById(id);
    } else {
      response.setError(com.slaughterhouse.grpc.Error.newBuilder()
          .setCode(404)
          .setMessage("AnimalPart not found")
          .build());
    }
    return response.build();
  }
}
