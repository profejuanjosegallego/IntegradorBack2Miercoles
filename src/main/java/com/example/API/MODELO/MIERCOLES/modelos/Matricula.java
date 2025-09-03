package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Matricula")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "estudiante_id", nullable = false,unique = true,length = 10)
    private String estudiante_id;
    @Column(name = "materia_id", nullable = false, length = 10)
    private String materia_id;
    @Column(name = "grupo_id", nullable = false, length = 10)
    private String grupo_id;
    @Column(name = "periodo", nullable = false, length = 20)
    private String periodo;

    public Matricula(){

    }

    public Matricula(Integer id, String estudiante_id, String materia_id, String grupo_id, String periodo) {
        this.id = id;
        this.estudiante_id = estudiante_id;
        this.materia_id = materia_id;
        this.grupo_id = grupo_id;
        this.periodo = periodo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstudiante_id() {
        return estudiante_id;
    }

    public void setEstudiante_id(String estudiante_id) {
        this.estudiante_id = estudiante_id;
    }

    public String getMateria_id() {
        return materia_id;
    }

    public void setMateria_id(String materia_id) {
        this.materia_id = materia_id;
    }

    public String getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(String grupo_id) {
        this.grupo_id = grupo_id;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
