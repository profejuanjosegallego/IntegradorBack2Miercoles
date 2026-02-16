package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "BrayanMayo")
public class BrayanMayo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "direccion", length = 80)
    private String direccion;

    @Column(name = "hincha")
    private Boolean esHinchaVerdolaga;

    public BrayanMayo() {
    }

    public BrayanMayo(Integer id, String direccion, Boolean esHinchaVerdolaga) {
        Id = id;
        this.direccion = direccion;
        this.esHinchaVerdolaga = esHinchaVerdolaga;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
