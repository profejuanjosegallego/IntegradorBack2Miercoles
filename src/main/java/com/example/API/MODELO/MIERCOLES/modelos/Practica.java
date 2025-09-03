package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "practica")
public class Practica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombrecompleto", nullable = false, unique = false)
    private String nombreCompleto;
    @Column(name = "nombrecompleto", nullable = false, unique = false)
    private String direccion;

    public Practica() {
    }

    public Practica(Integer id, String nombreCompleto, String direccion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
