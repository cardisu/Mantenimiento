package com.cdiaz.Mantenimiento.Controllers;

import com.cdiaz.Mantenimiento.Models.Usuarios;
import com.cdiaz.Mantenimiento.Services.UsuariosRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/consultas/usuarios")
public class UsuariosController {
    private final UsuariosRepository usuariosRepository;

    public UsuariosController(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @GetMapping
    public String obtenerUsuarios(Model model){
        List<Usuarios> usuarios = usuariosRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "usuarios"; // Nombre del archivo en la carpeta de templates
    }
}
