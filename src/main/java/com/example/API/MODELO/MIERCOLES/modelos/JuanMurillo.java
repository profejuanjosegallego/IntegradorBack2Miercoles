package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="JuanMurillo")
public class JuanMurillo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "direccion", length = 80)
    private String direccion;

    @Column(name = "hincha")
    private Boolean EsHinchaVerdolaga;

    public JuanMurillo() {
    }

    public JuanMurillo(Integer id, String direccion, Boolean esHinchaVerdolaga) {
        this.id = id;
        this.direccion = direccion;
        EsHinchaVerdolaga = esHinchaVerdolaga;
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
        return EsHinchaVerdolaga;
    }

    public void setEsHinchaVerdolaga(Boolean esHinchaVerdolaga) {
        EsHinchaVerdolaga = esHinchaVerdolaga;
    }
}
