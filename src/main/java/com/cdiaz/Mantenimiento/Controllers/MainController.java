package com.cdiaz.Mantenimiento.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "redirect:/consultas/usuarios"; // Se asume que "index.html" está en "src/main/resources/templates"
    }
}
