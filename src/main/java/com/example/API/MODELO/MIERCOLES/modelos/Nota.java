package com.example.API.MODELO.MIERCOLES.modelos;

import com.example.API.MODELO.MIERCOLES.ayudas.TipoEvaluacion;

import java.time.LocalDate;

public class Nota {

    private Integer id;
    private Double valor;
    private TipoEvaluacion tipoEvaluacion;
    private LocalDate;
    private Materia materia;

    public Nota() {
    }

    public Nota(Integer id, Double valor, TipoEvaluacion tipoEvaluacion, Materia materia) {
        this.id = id;
        this.valor = valor;
        this.tipoEvaluacion = tipoEvaluacion;
        this.materia = materia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoEvaluacion getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    public void setTipoEvaluacion(TipoEvaluacion tipoEvaluacion) {
        this.tipoEvaluacion = tipoEvaluacion;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
