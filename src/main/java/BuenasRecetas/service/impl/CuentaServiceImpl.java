package BuenasRecetas.service.impl;

import BuenasRecetas.dao.CuentaDao;
import BuenasRecetas.domain.Cuenta;
import BuenasRecetas.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaDao cuentaDao;

    @Override
    @Transactional(readOnly=true)
    public Cuenta getCuenta(Cuenta cuenta) {
        return cuentaDao.findByEmail(cuenta.getEmail()).orElse(null);
    }
    @Override

    public void save(Cuenta cuenta) {
        cuentaDao.save(cuenta);
    }

}
