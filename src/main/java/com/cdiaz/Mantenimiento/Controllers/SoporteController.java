package com.cdiaz.Mantenimiento.Controllers;


import org.springframework.ui.Model;
import com.cdiaz.Mantenimiento.Services.SoporteRepository;
import com.cdiaz.Mantenimiento.Models.Soporte;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/soportes")
public class SoporteController {
    private final SoporteRepository soporteRepository;

    public SoporteController(SoporteRepository soporteRepository) {
        this.soporteRepository = soporteRepository;
    }

    @GetMapping
    public String obtenerSoportes(Model model) {
        List<Soporte> soporte = soporteRepository.findAll();
        model.addAttribute("soportes", soporte);
        return "soportes";
    }
}
