package com.cdiaz.Mantenimiento.Services;

import com.cdiaz.Mantenimiento.Models.Soporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SoporteRepository extends JpaRepository<Soporte, Integer> {

}
