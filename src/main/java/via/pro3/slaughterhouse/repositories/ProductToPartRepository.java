package via.pro3.slaughterhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import via.pro3.slaughterhouse.model.ProductToPart;
import via.pro3.slaughterhouse.model.Tray;

public interface ProductToPartRepository extends JpaRepository<ProductToPart, Integer>
{
}
