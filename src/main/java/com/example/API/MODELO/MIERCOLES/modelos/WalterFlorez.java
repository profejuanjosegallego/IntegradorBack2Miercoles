package com.example.API.MODELO.MIERCOLES.modelos;


import jakarta.persistence.*;

@Entity
@Table(name = "WalterFlorez")
public class WalterFlorez {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "direccion", length = 80)
    private String direccion;
    @Column(name = "hincha")
    private Boolean esHinchaDelVerde;

    public WalterFlorez() {
    }

    public WalterFlorez(Integer id, String direccion, Boolean esHinchaDelVerde) {
        this.id = id;
        this.direccion = direccion;
        this.esHinchaDelVerde = esHinchaDelVerde;
    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEsHinchaDelVerde() {
        return esHinchaDelVerde;
    }

    public void setEsHinchaDelVerde(Boolean esHinchaDelVerde) {
        this.esHinchaDelVerde = esHinchaDelVerde;
    }
}
