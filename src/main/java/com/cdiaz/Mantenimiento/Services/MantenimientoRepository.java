package com.cdiaz.Mantenimiento.Services;

import com.cdiaz.Mantenimiento.Models.Mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MantenimientoRepository extends JpaRepository<Mantenimiento, Integer> {

}
