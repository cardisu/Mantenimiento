package com.cdiaz.Mantenimiento.Controllers;

import com.cdiaz.Mantenimiento.Models.Mantenimiento;
import com.cdiaz.Mantenimiento.Services.MantenimientoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consultas/mantenimientos")
public class MantenimientoController {
    private final MantenimientoRepository mantenimientoRepository;

    public MantenimientoController(MantenimientoRepository mantenimientoRepository) {
        this.mantenimientoRepository = mantenimientoRepository;
    }

    @GetMapping
    public List<Mantenimiento> obtenerMantenimientos(){
        return mantenimientoRepository.findAll();
    }
}
