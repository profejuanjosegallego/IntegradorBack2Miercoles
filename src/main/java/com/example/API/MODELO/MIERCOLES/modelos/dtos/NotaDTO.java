package com.example.API.MODELO.MIERCOLES.modelos.dtos;

import com.example.API.MODELO.MIERCOLES.ayudas.TipoEvaluacion;

import java.time.LocalDate;

public class NotaDTO {

    private Double valor;
    private TipoEvaluacion tipoEvaluacion;
    private LocalDate fecha;
    private Materia materia;

    public NotaDTO() {
    }

    public NotaDTO(Integer id, Double valor, TipoEvaluacion tipoEvaluacion, LocalDate fecha, Materia materia) {
        this.valor = valor;
        this.tipoEvaluacion = tipoEvaluacion;
        this.fecha = fecha;
        this.materia = materia;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
