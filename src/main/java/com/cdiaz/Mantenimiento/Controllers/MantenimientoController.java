package com.cdiaz.Mantenimiento.Controllers;

import com.cdiaz.Mantenimiento.Models.Mantenimiento;
import com.cdiaz.Mantenimiento.Services.MantenimientoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/mantenimientos")
public class MantenimientoController {
    private final MantenimientoRepository mantenimientoRepository;

    public MantenimientoController(MantenimientoRepository mantenimientoRepository) {
        this.mantenimientoRepository = mantenimientoRepository;
    }

    @GetMapping
    public String obtenerMantenimientos(Model model){
        List<Mantenimiento> manteniento = mantenimientoRepository.findAll();
        model.addAttribute("mantenimientos", manteniento);
        return "mantenimientos";
    }
}
