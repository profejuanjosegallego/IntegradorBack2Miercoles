package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "AlejandroDiaz")
public class AlejandroDiaz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "direccion", nullable = false, unique = false, length = 40)
    private String direccion;

    @Column(name = "esHinchaVerdolaga", nullable = false, unique = false)
    private Boolean esHinchaVerdolaga;

    public AlejandroDiaz() {
    }

    public AlejandroDiaz(Integer id, String direccion, Boolean esHinchaVerdolaga) {
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
