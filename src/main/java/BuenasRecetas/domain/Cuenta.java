package BuenasRecetas.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "cuentas")
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cuenta")
    private Long idCuenta;
    private String email;
    private String nombreDeUsuario;
    private String nombre;
    private String apellidos;
    private String password;

    public Cuenta(){

    }

    public Cuenta(Long idCuenta, String email, String nombreDeUsuario, String nombre, String apellidos, String password) {
        this.idCuenta = idCuenta;
        this.email = email;
        this.nombreDeUsuario = nombreDeUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.password = password;
    }
}
