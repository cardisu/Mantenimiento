package com.cdiaz.Mantenimiento.Services;

import com.cdiaz.Mantenimiento.Models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository <Usuarios, Integer> {

}
