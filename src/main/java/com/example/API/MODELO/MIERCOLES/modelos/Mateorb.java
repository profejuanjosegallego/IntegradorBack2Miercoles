package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Mateorb")
public class Mateorb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "direccion", length = 80)
    private String direccion;

    @Column(name = "hincha")
    private Boolean esHinchaVerdolaga;

    public Mateorb(){

    }

    public Mateorb(Integer id, String direccion, Boolean esHinchaVerdolaga) {
        this.id = id;
        this.direccion = direccion;
        this.esHinchaVerdolaga = esHinchaVerdolaga;
    }
}
