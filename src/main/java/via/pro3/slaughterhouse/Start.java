package via.pro3.slaughterhouse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import via.pro3.slaughterhouse.model.Animal;
import via.pro3.slaughterhouse.services.AnimalService;

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
        animalService.deleteAnimal(new Long(2));
    }
}
