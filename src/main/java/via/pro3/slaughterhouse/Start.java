package via.pro3.slaughterhouse;

import com.slaughterhouse.grpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import via.pro3.slaughterhouse.model.Animal;
import via.pro3.slaughterhouse.repositories.AnimalPartRepository;
import via.pro3.slaughterhouse.repositories.ProductRepository;
import via.pro3.slaughterhouse.repositories.ProductToPartRepository;
import via.pro3.slaughterhouse.repositories.TrayRepository;
import via.pro3.slaughterhouse.services.*;

@SpringBootApplication
public class Start {

  private static final Logger log = LoggerFactory.getLogger(Start.class);

  public static void main(String[] args) {
        // Start Spring Boot and get the application context
        ApplicationContext context = SpringApplication.run(Start.class, args);
        // Get the AnimalService bean from Spring
        AnimalService animalService = context.getBean(AnimalService.class);
        // Now you can save an animal
        Animal animal = new Animal();
//      AnimalPartRepository animalPartRepository = context.getBean(AnimalPartRepository.class);
//      AnimalPartService animalPartService = new AnimalPartService(animalPartRepository);
//      AnimalPart part = AnimalPart.newBuilder().setId(1).setPartType("leg").setWeight(10).setAnimalId(2).build();
//      CreateAnimalPartRequest request =CreateAnimalPartRequest.newBuilder().setPart(part).build();
//      animalPartService.create(request);
//      ProductRepository productRepository = context.getBean(ProductRepository.class);
//      ProductService productService = new ProductService(productRepository);
//      CreateProductRequest productRequest = CreateProductRequest.newBuilder().setProduct(Product.newBuilder().
//              setName("test").setDescription("test").build()).build();
//      productService.createProduct(productRequest);
//      TrayRepository trayRepository = context.getBean(TrayRepository.class);
//      TrayService trayService = new TrayService(trayRepository);
//      trayService.createTray(CreateTrayRequest.newBuilder().setTray(Tray.newBuilder().setMaxWeight(25.5).setPartType("Leg").build()).build());
      ProductToPartRepository productRepository = context.getBean(ProductToPartRepository.class);
      ProductToPartService productToPartService = new ProductToPartService(productRepository);
      ProductToPart productToPart = ProductToPart.newBuilder().setProductId(1).setPartId(1).setQuantity(1).build();
      productToPartService.createProductToPart(CreateProductToPartRequest.newBuilder().setMapping(productToPart).build());
      log.info("Application started");
    }
}
