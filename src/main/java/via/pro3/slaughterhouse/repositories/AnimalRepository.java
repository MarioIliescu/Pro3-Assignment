package via.pro3.slaughterhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import via.pro3.slaughterhouse.model.Animal;

import java.util.Optional;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Optional<Animal> findByRegistrationNumber(String registrationNumber);
    
}
