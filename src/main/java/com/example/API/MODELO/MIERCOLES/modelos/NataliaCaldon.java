package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Natalia Caldon")

public class NataliaCaldon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "direccion",length = 80)
    private  String direccion;

    @Column(name = "Hincha")
    private Boolean soyHinchaverdolaga;
    

    public NataliaCaldon(){

    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getSoyHinchaverdolaga() {
        return soyHinchaverdolaga;
    }

    public void setSoyHinchaverdolaga(Boolean soyHinchaverdolaga) {
        this.soyHinchaverdolaga = soyHinchaverdolaga;
    }
}
