package com.example.API.MODELO.MIERCOLES.modelos.dtos;

import com.example.API.MODELO.MIERCOLES.ayudas.TipoEvaluacion;

import java.time.LocalDate;

public class NotaDTO {

    private Integer id;
    private Double valor;
    private TipoEvaluacion tipoEvaluacion;
    private LocalDate fecha;

    public NotaDTO() {
    }

    public NotaDTO(Integer id, Double valor, TipoEvaluacion tipoEvaluacion, LocalDate fecha) {
        this.id = id;
        this.valor = valor;
        this.tipoEvaluacion = tipoEvaluacion;
        this.fecha = fecha;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
