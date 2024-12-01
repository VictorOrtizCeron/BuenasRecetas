package BuenasRecetas.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("")
public class RoutingController {

    @GetMapping("/BuscadorRecetas/buscar")
    public String getBuscador() {
        return "/BuscadorRecetas/buscar";
    }

    @GetMapping("/index")
    public String getIndex() {
        return "/index";
    }

    @GetMapping("/login/inicio_sesion")
    public String mostrarLogin() {
        return "/auth/login/inicio_sesion"; // view name for login page
    }

    @GetMapping("/AgregarReceta/crearReceta")
    public String getRecetaForm(){
        return "/AgregarReceta/crearReceta";
    }
}
