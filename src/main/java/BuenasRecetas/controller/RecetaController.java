package BuenasRecetas.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/AgregarReceta")
public class RecetaController {

    @GetMapping("/AgregarReceta/agregar_receta")
    public String mostrarReceta() {

        return "/AgregarReceta/agregar_receta";
    }
}
