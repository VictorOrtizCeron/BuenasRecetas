package BuenasRecetas.service.impl;

import BuenasRecetas.dao.RecetaDao;
import BuenasRecetas.domain.Receta;
import BuenasRecetas.service.RecetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class RecetaServiceImpl implements RecetaService {
    @Autowired
    private RecetaDao recetaDao;

    @Override
    @Transactional
    public void save(Receta receta){
        recetaDao.save(receta);
    }
}
