package via.pro3.slaughterhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import via.pro3.slaughterhouse.model.AnimalPart;

import java.util.Optional;

public interface AnimalPartRepository  extends JpaRepository<AnimalPart, Integer>
{
  Optional<AnimalPart> findByRegistrationNumber(String registrationNumber);
}
