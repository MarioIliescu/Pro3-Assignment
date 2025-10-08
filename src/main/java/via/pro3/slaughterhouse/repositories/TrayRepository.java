package via.pro3.slaughterhouse.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import via.pro3.slaughterhouse.model.Tray;

import java.util.Optional;

public interface TrayRepository extends JpaRepository<Tray, Integer>
{
}
