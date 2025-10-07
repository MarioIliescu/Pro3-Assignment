package via.pro3.slaughterhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import via.pro3.slaughterhouse.model.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
  Optional<Product> findByRegistrationNumber(String registrationNumber);
}
