package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="AtleNacional")
public class AtleNacional {
    private Integer Id;
    private String Nombre;
    private Boolean SoyHincha;


    public AtleNacional() {
    }

    public AtleNacional(Integer id, String nombre, Boolean soyHincha) {
        Id = id;
        Nombre = nombre;
        SoyHincha = soyHincha;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column (name = "EquipoFavorito")
    private String nombre;

    @Column (name = "Nacional")
    private Boolean soyHincha;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Boolean getSoyHincha() {
        return SoyHincha;
    }

    public void setSoyHincha(Boolean soyHincha) {
        SoyHincha = soyHincha;
    }
}
