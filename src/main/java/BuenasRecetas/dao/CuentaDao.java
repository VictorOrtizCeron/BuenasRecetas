package BuenasRecetas.dao;

import BuenasRecetas.domain.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CuentaDao extends JpaRepository<Cuenta, Long> {
    Optional<Cuenta> findByEmail(String email);
}
