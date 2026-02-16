package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "practica1JuanDavid")
public class practica1JuanDavid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 35)
    private String nombre;

    @Column(name = "apellido", length = 30)
    private String apellido;

    @Column(name = "nombreAnimal", length = 20)
    private String nombreAnimal;

    public practica1JuanDavid() {
    }

    public practica1JuanDavid(Integer id, String nombre, String apellido, String nombreAnimal) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreAnimal = nombreAnimal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }
}
