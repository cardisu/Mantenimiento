package com.cdiaz.Mantenimiento.Models;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.Date;

@Entity
@Table(name="Mantenimiento")
public class Mantenimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mantenimiento")
    private Integer id_mantenimiento;

    @ManyToOne
    @JoinColumn(name = "id_soporte", referencedColumnName = "id_soporte")
    private Soporte id_soporte; //Llave foranea

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuarios id_usuario; //Llave foranea

    @Column(name = "tipo_activo", nullable = false, length = 100)
    private String tipo_activo;
    @Column(name = "razon_mantenimiento", nullable = false, length = 255)
    private String razon_mantenimiento;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_mantenimiento")
    private Date fecha_mantenimiento;
    @Column(name = "observaciones", nullable = false, length = 1000)
    private String observaciones;

    public Mantenimiento() {
    }

    public Mantenimiento(Integer id_mantenimiento, Soporte id_soporte, Usuarios id_usuario, String tipo_activo, String razon_mantenimiento, Date fecha_mantenimiento, String observaciones) {
        this.id_mantenimiento = id_mantenimiento;
        this.id_soporte = id_soporte;
        this.id_usuario = id_usuario;
        this.tipo_activo = tipo_activo;
        this.razon_mantenimiento = razon_mantenimiento;
        this.fecha_mantenimiento = fecha_mantenimiento;
        this.observaciones = observaciones;
    }

    public Integer getId_mantenimiento() {
        return id_mantenimiento;
    }

    public void setId_mantenimiento(Integer id_mantenimiento) {
        this.id_mantenimiento = id_mantenimiento;
    }

    public Soporte getId_soporte() {
        return id_soporte;
    }

    public void setId_soporte(Soporte id_soporte) {
        this.id_soporte = id_soporte;
    }

    public Usuarios getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuarios id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTipo_activo() {
        return tipo_activo;
    }

    public void setTipo_activo(String tipo_activo) {
        this.tipo_activo = tipo_activo;
    }

    public String getRazon_mantenimiento() {
        return razon_mantenimiento;
    }

    public void setRazon_mantenimiento(String razon_mantenimiento) {
        this.razon_mantenimiento = razon_mantenimiento;
    }

    public Date getFecha_mantenimiento() {
        return fecha_mantenimiento;
    }

    public void setFecha_mantenimiento(Date fecha_mantenimiento) {
        this.fecha_mantenimiento = fecha_mantenimiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
