package com.example.API.MODELO.MIERCOLES.repositorios;

import com.example.API.MODELO.MIERCOLES.modelos.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface INotaRepositorio extends JpaRepository<Nota, Long> {

    Optional<Nota>finByEstudianteId(Integer id);
    Optional<Nota>findByMateriaAndGrupoId(Materia materia);
}
