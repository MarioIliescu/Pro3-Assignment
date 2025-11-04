package via.pro3.slaughterhouse.services;

import com.slaughterhouse.grpc.CreateAnimalPartRequest;
import com.slaughterhouse.grpc.CreateAnimalPartResponse;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.stereotype.Service;
import via.pro3.slaughterhouse.repositories.AnimalPartRepository;

import com.slaughterhouse.grpc.*;
import via.pro3.slaughterhouse.model.AnimalPart;
import java.util.List;
import java.util.stream.Collectors;
@GRpcService
@Service public class AnimalPartService extends AnimalPartServiceGrpc.AnimalPartServiceImplBase
{
  private final AnimalPartRepository partRepository;

  public AnimalPartService(AnimalPartRepository partRepository)
  {
    this.partRepository = partRepository;
  }

  public CreateAnimalPartResponse create(CreateAnimalPartRequest request)
  {

    AnimalPart animalPart = new via.pro3.slaughterhouse.model.AnimalPart();
    animalPart.setId(request.getPart().getAnimalId());
    animalPart.setAnimalId(request.getPart().getAnimalId());
    animalPart.setPartType(request.getPart().getPartType());
    animalPart.setWeight(request.getPart().getWeight());

    partRepository.save(animalPart);

    AnimalPartProto protoAnimalPart = AnimalPartProto.newBuilder()
        .setId(animalPart.getId()).setAnimalId(animalPart.getAnimalId())
        .setPartType(animalPart.getPartType()).setWeight(animalPart.getWeight())
        .build();
    return CreateAnimalPartResponse.newBuilder().setPart(protoAnimalPart).build();
  }

  public AnimalPartProto createAnimalPart(CreateAnimalPartRequest request)
  {
    AnimalPart animalPart = new AnimalPart();
    animalPart.setId(request.getPart().getId());
    animalPart.setAnimalId(request.getPart().getAnimalId());
    animalPart.setWeight(request.getPart().getWeight());
    animalPart.setPartType(request.getPart().getPartType());

    partRepository.save(animalPart);

    AnimalPartProto protoAnimalPart = com.slaughterhouse.grpc.AnimalPartProto.newBuilder()
        .setId(animalPart.getId())  // Long maps to proto int64
        .setPartType(animalPart.getPartType())
        .setAnimalId(animalPart.getAnimalId()).setWeight(animalPart.getWeight())
        .build();

    return protoAnimalPart;
  }

  public ListAnimalPartsResponse listAnimalParts()
  {
    List<AnimalPartProto> animalParts = partRepository.findAll().stream().map(
            animalPart -> AnimalPartProto.newBuilder().setId(animalPart.getId())
                .setAnimalId(animalPart.getAnimalId())
                .setWeight(animalPart.getWeight()).setPartType(animalPart.getPartType()).build())
        .collect(Collectors.toList());

    return ListAnimalPartsResponse.newBuilder().addAllParts(animalParts)
        .build();
  }

  public AnimalPartProto getAnimalPart(Integer id)
  {
    return partRepository.findById(id).map(animalPart -> AnimalPartProto.newBuilder().setId(animalPart.getId())
            .setPartType(animalPart.getPartType())
            .setWeight(animalPart.getWeight())
            .setAnimalId(animalPart.getAnimalId()).build()).orElse(null);
  }

  public DeleteResponse deleteAnimalPart(Integer id)
  {
    DeleteResponse.Builder response = DeleteResponse.newBuilder();
    if (partRepository.existsById(id))
    {
      partRepository.deleteById(id);
    }
    else
    {
      response.setError(com.slaughterhouse.grpc.Error.newBuilder().setCode(404)
          .setMessage("AnimalPart not found").build());
    }
    return response.build();
  }
}
