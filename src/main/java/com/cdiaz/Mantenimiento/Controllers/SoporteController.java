package com.cdiaz.Mantenimiento.Controllers;


import com.cdiaz.Mantenimiento.Services.SoporteRepository;
import com.cdiaz.Mantenimiento.Models.Soporte;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consultas/soportes")
public class SoporteController {
    private final SoporteRepository soporteRepository;

    public SoporteController(SoporteRepository soporteRepository) {
        this.soporteRepository = soporteRepository;
    }

    @GetMapping
    public List<Soporte> obtenerSoportes() {
        return soporteRepository.findAll();
    }
}
