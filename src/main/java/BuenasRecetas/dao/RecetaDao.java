package BuenasRecetas.dao;

import BuenasRecetas.domain.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaDao extends JpaRepository<Receta,Long> {

}
