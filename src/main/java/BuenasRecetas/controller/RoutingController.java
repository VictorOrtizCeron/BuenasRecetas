package BuenasRecetas.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("")
public class RoutingController {

    @Autowired
    RecetaService recetaService;
    
    @GetMapping("/BuscadorRecetas/buscar")
    public String getRecetas(Model model) {
        var recetas = recetaService.getRecetas(true);
        model.addAttribute("recetas", recetas);
        model.addAttribute("totalRecetas", recetas.size());
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
