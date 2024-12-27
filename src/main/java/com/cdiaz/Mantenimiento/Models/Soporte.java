package com.cdiaz.Mantenimiento.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;

/*Marca la clase como una
entidad de JPA, lo que indica que esta clase está
mapeada a una tabla en la base de datos.*/
@Entity

/*
Especifica el nombre de la tabla en la base de datos con la que se mapea esta entidad.
*/
@Table(name = "Soporte")

public class Soporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    @Column(name = "id_soporte") // Mapea al nombre de la columna
    private Integer id_soporte;

    @Column(name = "nombre_soporte", nullable = false, length = 100)
    private  String nombre_soporte;

    @Column(name = "ciudad", nullable = false, length = 100)
    private String ciudad;

    public Soporte() {
    }

    public Soporte(int id_soporte, String nombre_soporte, String ciudad) {
        this.id_soporte = id_soporte;
        this.nombre_soporte = nombre_soporte;
        this.ciudad = ciudad;
    }

    public int getId_soporte() {
        return id_soporte;
    }

    public void setId_soporte(int id_soporte) {
        this.id_soporte = id_soporte;
    }

    public String getNombre_soporte() {
        return nombre_soporte;
    }

    public void setNombre_soporte(String nombre_soporte) {
        this.nombre_soporte = nombre_soporte;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
