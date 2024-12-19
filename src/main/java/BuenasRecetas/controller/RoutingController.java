package BuenasRecetas.controller;


import BuenasRecetas.domain.Receta;
import BuenasRecetas.service.RecetaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("")
public class RoutingController {

    @Autowired
    RecetaService recetaService;

    @GetMapping("/BuscadorRecetas/buscar")
    public String getRecetas(Model model){
        var recetas = recetaService.getRecetas(true);
        model.addAttribute("recetas", recetas);
        model.addAttribute("totalRecetas", recetas.size());
        return "/BuscadorRecetas/buscar";
    }
    @PostMapping("/BuscadorRecetas/buscar")
    public String getRecetasPost(Model model){
        var recetas = recetaService.getRecetas(true);
        model.addAttribute("recetas", recetas);
        model.addAttribute("totalRecetas", recetas.size());
        return "/BuscadorRecetas/buscar";
    }

    @GetMapping("/index")
    public String getIndex() {
        return "/index";
    }
    @GetMapping("/About/about")
    public String getAbout() {
        return "/About/about";
    }

    @GetMapping("/login/inicio_sesion")
    public String mostrarLogin() {
        return "/auth/login/inicio_sesion";
    }

    @GetMapping("/AgregarReceta/crearReceta")
    public String getRecetaForm(){
        return "/AgregarReceta/crearReceta";
    }
    @GetMapping("/modificarReceta/modificar/{idReceta}")
    public String recetaModificar(Receta receta , Model model) {
        receta = recetaService.getReceta(receta);
        System.out.println(receta.getIdReceta());
        model.addAttribute("receta", receta);
        return "/modificarReceta/modificar";
    }
}
