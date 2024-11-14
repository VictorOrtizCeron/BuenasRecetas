package BuenasRecetas.service;

import BuenasRecetas.domain.Cuenta;
import org.springframework.stereotype.Service;



public interface CuentaService {

    public Cuenta getCuenta(Cuenta cuenta);

    public void save(Cuenta cuenta);
}
