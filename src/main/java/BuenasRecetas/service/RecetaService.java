package BuenasRecetas.service;

import BuenasRecetas.domain.Receta;

public interface RecetaService {

    //Esto se utiliza para salvar recetas y modificarlas en la base de datos
    public void save(Receta receta);
}
