package BuenasRecetas.controller;


import BuenasRecetas.service.CuentaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequestMapping("/auth")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;



//    @PostMapping("/login/ingresar")
//    public String login(@RequestParam("email") String email,@RequestParam("password") String password){
//
//        ModelAndView modelAndView = new ModelAndView();
//        if ("admin@ufide.ac.cr".equals(email) && "password".equals(password)) {
//            modelAndView.setViewName("home");  // Redirect to home page on successful login
//            return "/AgregarReceta/agregar_receta";
//        } else {
//            modelAndView.setViewName("login/inicio_sesion");  // Redirect back to login on failure
//            modelAndView.addObject("error", "Invalid username or password.");
//        }
//        return "redirect:/auth/login/inicio_sesion";
//    }
}
