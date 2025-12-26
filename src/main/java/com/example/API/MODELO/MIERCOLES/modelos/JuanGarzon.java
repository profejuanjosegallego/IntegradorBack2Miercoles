package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;
 
    @Entity
    @Table(name="JuanGarzon")
    public class JuanGarzon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "direccion", length = 80)
    private String direccion;

    @Column(name = "hincha")
    private Boolean esHinchaVerdolaga;

    public JuanGarzon(Integer id, String direccion, Boolean esHinchaVerdolaga) {
        this.id = id;
        this.direccion = direccion;
        this.esHinchaVerdolaga = esHinchaVerdolaga;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEsHinchaVerdolaga() {
        return esHinchaVerdolaga;
    }

    public void setEsHinchaVerdolaga(Boolean esHinchaVerdolaga) {
        this.esHinchaVerdolaga = esHinchaVerdolaga;
    }
}
