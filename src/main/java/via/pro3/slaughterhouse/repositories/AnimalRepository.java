package via.pro3.slaughterhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.pro3.slaughterhouse.model.Animal;

import java.util.Optional;

@Repository public interface AnimalRepository extends JpaRepository<Animal, Integer>
{
  Optional<Animal> findByRegistrationNumber(String registrationNumber);

}
