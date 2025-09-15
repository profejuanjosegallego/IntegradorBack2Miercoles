package com.example.API.MODELO.MIERCOLES.repositorios;

import com.example.API.MODELO.MIERCOLES.modelos.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface INotaRepositorio extends JpaRepository<Nota, Integer> {

    //Consultas

    //Buscando la nota del estudiante
    Optional<Nota>findByValor(Double valor);

    //Buscando la fecha en que se realizo la evaluación
    Optional<Nota>findByFecha(LocalDate fecha);

    //Buscando las calificaciones de los estudiantes
    List<Nota>findByValorContaining(Integer valor);
}
