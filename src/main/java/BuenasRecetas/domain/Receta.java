package BuenasRecetas.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "receta")
public class Receta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_receta")
    private Long idReceta;
    private String nombre;
    private String descripcion;
    private String pasos;
    private String categoria;
    private String rutaImagen;
    private boolean activo;

    public Receta(){

    }

}
