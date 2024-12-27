package com.cdiaz.Mantenimiento.Controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    private  UsuariosController usuariosController;

    @GetMapping("/")
    public String redirectHome() {
        return "redirect:index";
    }

    @GetMapping("/index")
    public String home() {
        return "index";
    }

   /*@GetMapping("index")
    public String consultaUsuarios() {

        return "redirect:/usuarios";
    }*/
}
