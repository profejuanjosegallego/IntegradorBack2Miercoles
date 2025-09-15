package com.example.API.MODELO.MIERCOLES.dtos;

import com.example.API.MODELO.MIERCOLES.ayudas.TipoEvaluacion;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;


public interface INotaDTO {

    private Double valor;
    private TipoEvaluacion tipoEvaluacion;
    private LocalDate fecha;
    private  Integer materia_id;
    private Materia materia;
}
