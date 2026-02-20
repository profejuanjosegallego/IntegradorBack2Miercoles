package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "GrupoNataliaCaldon")
public class GrupoNataliaCaldon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "materia",nullable = false)
    private String materia;

    @Column(name = "semestre",nullable = false)
    private Integer semestre;

    public GrupoNataliaCaldon(){

    }

    public GrupoNataliaCaldon(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
}


