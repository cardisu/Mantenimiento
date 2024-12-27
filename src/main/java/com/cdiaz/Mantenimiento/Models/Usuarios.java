package com.cdiaz.Mantenimiento.Models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    @Column(name = "id_usuario")
    private Integer id_usuario;

    @Column(name = "nombre_usuario", nullable = false, length = 100)
    private String nombre_usuario;
    @Column(name = "departamento", nullable = false, length = 100)
    private  String departamento_usuario;
    @Column(name = "ciudad_usuario", nullable = false, length = 100)
    private String ciudad_usuario;


    public Usuarios() {
    }

    public Usuarios(Integer id_usuario, String nombre_usuario, String departamento_usuario, String ciudad_usuario) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.departamento_usuario = departamento_usuario;
        this.ciudad_usuario = ciudad_usuario;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getDepartamento_usuario() {
        return departamento_usuario;
    }

    public void setDepartamento_usuario(String departamento_usuario) {
        this.departamento_usuario = departamento_usuario;
    }

    public String getCiudad_usuario() {
        return ciudad_usuario;
    }

    public void setCiudad_usuario(String ciudad_usuario) {
        this.ciudad_usuario = ciudad_usuario;
    }
}
