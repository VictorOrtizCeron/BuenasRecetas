package BuenasRecetas.service.impl;

import BuenasRecetas.dao.RecetaDao;
import BuenasRecetas.domain.Receta;
import BuenasRecetas.service.RecetaService;
import java.util.List;
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

    @Override
    @Transactional(readOnly = true)
    public List<Receta> getRecetas(boolean activo){

        var lista=recetaDao.findAll();
        if (activo) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Receta getReceta(Receta receta){

        return recetaDao.findById(receta.getIdReceta()).orElse(null);

    }
    @Override
    @Transactional(readOnly = true)
    public List<Receta> buscarPorNombre(String nombreBusqueda){

        String nombre = "%" + nombreBusqueda + "%";

        System.out.println(nombre);
        return recetaDao.buscarPorNombre(nombre);
    }
    @Override
    @Transactional
    public void delete(Receta receta){
        recetaDao.delete(receta);
    }

}
