package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "OtraTablaDeAlejandro")
public class OtraTablaAlejandro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Edad", nullable = false, unique = false)
    private Integer edad;

    @Column(name = "EstaReforzando", nullable = false, unique = false)
    private Boolean estaReforzando;

    public OtraTablaAlejandro() {
    }

    public OtraTablaAlejandro(Integer id, Integer edad, Boolean estaReforzando) {
        this.id = id;
        this.edad = edad;
        this.estaReforzando = estaReforzando;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getEstaReforzando() {
        return estaReforzando;
    }

    public void setEstaReforzando(Boolean estaReforzando) {
        this.estaReforzando = estaReforzando;
    }
}
