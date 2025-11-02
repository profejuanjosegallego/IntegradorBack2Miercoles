package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "JuanMurillo")
class JuanMurillo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column (name = "Resumen", length = 100)
    private String Resumen;

    @Column(name = "Intereses", length = 100)
    private String Interess;

    @Column(name = "Experiencia", length = 100)
    private String Experiencia;

    @Column(name = "Proyectos", length = 100)
    private String Proyectos;

    @Column(name = "Estudiante_id", length = 100)
    private String Estudiante_id;


    public JuanMurillo() {
    }

    public JuanMurillo(Integer id, String resumen, String interess, String experiencia, String proyectos, String estudiante_id) {
        Id = id;
        Resumen = resumen;
        Interess = interess;
        Experiencia = experiencia;
        Proyectos = proyectos;
        Estudiante_id = estudiante_id;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getResumen() {
        return Resumen;
    }

    public void setResumen(String resumen) {
        Resumen = resumen;
    }

    public String getInteress() {
        return Interess;
    }

    public void setInteress(String interess) {
        Interess = interess;
    }

    public String getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(String experiencia) {
        Experiencia = experiencia;
    }

    public String getProyectos() {
        return Proyectos;
    }

    public void setProyectos(String proyectos) {
        Proyectos = proyectos;
    }

    public String getEstudiante_id() {
        return Estudiante_id;
    }

    public void setEstudiante_id(String estudiante_id) {
        Estudiante_id = estudiante_id;
    }
}

