package via.pro3.slaughterhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import via.pro3.slaughterhouse.model.Animal;
import via.pro3.slaughterhouse.services.AnimalService;

@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        // Start Spring Boot and get the application context
        ApplicationContext context = SpringApplication.run(Start.class, args);
        // Get the AnimalService bean from Spring
        AnimalService animalService = context.getBean(AnimalService.class);
        // Now you can save an animal
        Animal animal = new Animal();
        animal.setRegistrationNumber("Tesst");
        animal.setWeight(100.0);
        Animal saved = animalService.createAnimal(animal);
        System.out.println("Saved animal ID: " + saved.getId());
    }
}
