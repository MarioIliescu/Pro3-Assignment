package via.pro3.slaughterhouse.services;


import com.slaughterhouse.grpc.*;
import com.slaughterhouse.grpc.Error;
import org.springframework.stereotype.Service;
import via.pro3.slaughterhouse.model.Tray;
import via.pro3.slaughterhouse.repositories.TrayRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrayService {

  private final TrayRepository trayRepository;

  public TrayService(TrayRepository trayRepository) {
    this.trayRepository = trayRepository;
  }


  public CreateTrayResponse createTray(CreateTrayRequest request) {
    Tray entity = new Tray();
    entity.setMaxWeight(request.getTray().getMaxWeight());
    entity.setPart_type(request.getTray().getPartType());

    trayRepository.save(entity);

   com.slaughterhouse.grpc.Tray protoTray = entityToProto(entity);

    return CreateTrayResponse.newBuilder()
        .setTray(protoTray)
        .build();
  }

  // ---------- List ----------
  public ListTraysResponse listTrays() {
    List<Tray> entities = trayRepository.findAll();

    List<com.slaughterhouse.grpc.Tray> protoList = entities.stream()
        .map(this::entityToProto)
        .collect(Collectors.toList());

    return ListTraysResponse.newBuilder()
        .addAllTrays(protoList)
        .build();
  }

  // ---------- Get single ----------
  public com.slaughterhouse.grpc.Tray getTray(int id) {
    return trayRepository.findById(id)
        .map(this::entityToProto)
        .orElse(null);
  }

  // ---------- Delete ----------
  public DeleteResponse deleteTray(int id) {
    DeleteResponse.Builder response = DeleteResponse.newBuilder();
    if (trayRepository.existsById(id)) {
      trayRepository.deleteById(id);
    } else {
      response.setError(Error.newBuilder()
          .setCode(404)
          .setMessage("Tray not found")
          .build());
    }
    return response.build();
  }


  private com.slaughterhouse.grpc.Tray entityToProto(Tray entity) {
    return com.slaughterhouse.grpc.Tray.newBuilder()
        .setId(entity.getId())
        .setPartType(entity.getPart_type())
        .setMaxWeight(entity.getMaxWeight())
        .build();
  }
}

