package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

import javax.print.attribute.standard.MediaSize;

@Entity
@Table(name = "RuaMarcos")
public class RuaMarcos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "direccion", length = 80)
    private String direccion;
    @Column(name = "hincha")
    private Boolean eshincha;

    public RuaMarcos() {
    }

    public RuaMarcos(Integer id, String direccion, Boolean eshincha) {
        this.id = id;
        this.direccion = direccion;
        this.eshincha = eshincha;
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

    public Boolean getEshincha() {
        return eshincha;
    }

    public void setEshincha(Boolean eshincha) {
        this.eshincha = eshincha;
    }
}
