package BuenasRecetas.dao;

import BuenasRecetas.domain.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaDao extends JpaRepository<Receta,Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM receta where nombre LIKE :n")public List<Receta> buscarPorNombre(@Param("n") String nombreBusqueda);

}
