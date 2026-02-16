package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "vanessaMosquera")
public class VanessaMosquera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dirrecion",length = 100)
    private String dirrecion;

    @Column(name = "Hincha")
    private Boolean esHinchadelverdolaga;


    public VanessaMosquera(){

    }

    public VanessaMosquera(Integer id, String dirrecion, Boolean esHinchadelverdolaga) {
        this.id = id;
        this.dirrecion = dirrecion;
        this.esHinchadelverdolaga = esHinchadelverdolaga;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public Boolean getEsHinchadelverdolaga() {
        return esHinchadelverdolaga;
    }

    public void setEsHinchadelverdolaga(Boolean esHinchadelverdolaga) {
        this.esHinchadelverdolaga = esHinchadelverdolaga;
    }
}
