package via.pro3.slaughterhouse.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.pro3.slaughterhouse.model.Tray;

import java.util.Optional;

@Repository public interface TrayRepository extends JpaRepository<Tray, Integer>
{
}
