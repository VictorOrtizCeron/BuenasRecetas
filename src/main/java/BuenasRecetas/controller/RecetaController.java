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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/AgregarReceta/crearReceta")
public class RecetaController {

    @Autowired
    RecetaService recetaService;

    @PostMapping("/guardar")
    public String mostrarReceta(Receta receta) {

        //System.out.println(receta.toString());
        recetaService.save(receta);
        return "redirect:/BuscadorRecetas/buscar";
    }

    @PostMapping("/BuscadorRecetas/buscar/eliminar/{idReceta}")
    public String eliminarReceta(Receta receta) {
        System.out.println(receta.toString());
        recetaService.delete(receta);
        return "redirect:/BuscadorRecetas/buscar";
    }

    @GetMapping("/BuscadorRecetas/buscar/query")
    public String buscarReceta(@RequestParam(value = "nombreBusqueda") String nombreBusqueda, Model model) {
        System.out.println(nombreBusqueda);
        var recetas = recetaService.buscarPorNombre(nombreBusqueda);
        model.addAttribute("recetas", recetas);
        return "/BuscadorRecetas/buscar";
    }

}
