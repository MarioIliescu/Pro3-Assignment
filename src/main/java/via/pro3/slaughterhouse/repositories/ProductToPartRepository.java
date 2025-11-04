package via.pro3.slaughterhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.pro3.slaughterhouse.model.ProductToPart;
import via.pro3.slaughterhouse.model.Tray;

@Repository public interface ProductToPartRepository extends JpaRepository<ProductToPart, Integer>
{
}
