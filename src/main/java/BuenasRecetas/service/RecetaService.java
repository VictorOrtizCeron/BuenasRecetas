package BuenasRecetas.service;

import BuenasRecetas.domain.Receta;

import java.util.List;

public interface RecetaService {

    //Esto se utiliza para salvar recetas y modificarlas en la base de datos
    public void save(Receta receta);

    public List<Receta> getRecetas(boolean activos);


    public List<Receta>buscarPorNombre(String nombreBusqueda);

    public Receta getReceta(Receta receta);

    public void delete(Receta receta);
}
