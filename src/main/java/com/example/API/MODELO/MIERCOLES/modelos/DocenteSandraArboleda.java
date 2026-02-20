package com.example.API.MODELO.MIERCOLES.modelos;

import com.example.API.MODELO.MIERCOLES.ayudas.DepartamentoDocente;
import com.example.API.MODELO.MIERCOLES.ayudas.EspecialidadDocente;
import com.example.API.MODELO.MIERCOLES.ayudas.NivelAcademico;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "docentesandraarboleda")
public class DocenteSandraArboleda {

        @Column(name = "especialidades", nullable = false, unique = false)
        @Enumerated(EnumType.STRING)
        private EspecialidadDocente especialidades;

        @Column(name = "nivelAcademico", nullable = false, unique = false)
        @Enumerated(EnumType.STRING)
        private NivelAcademico nivelAcademico;

        @Column(name = "departamento", nullable = false, unique = false)
        @Enumerated(EnumType.STRING)
        private DepartamentoDocente departamento;

        @OneToOne
        @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
        @JsonManagedReference(value = "relacionentreusuarioydocente")
        private Usuario usuario;

        public DocenteSandraArboleda() {
        }

        public DocenteSandraArboleda(EspecialidadDocente especialidades, NivelAcademico nivelAcademico, DepartamentoDocente departamento) {
            this.especialidades = especialidades;
            this.nivelAcademico = nivelAcademico;
            this.departamento = departamento;
        }

        public EspecialidadDocente getEspecialidades() {
            return especialidades;
        }

        public void setEspecialidades(EspecialidadDocente especialidades) {
            this.especialidades = especialidades;
        }

        public NivelAcademico getNivelAcademico() {
            return nivelAcademico;
        }

        public void setNivelAcademico(NivelAcademico nivelAcademico) {
            this.nivelAcademico = nivelAcademico;
        }

        public DepartamentoDocente getDepartamento() {
            return departamento;
        }

        public void setDepartamento(DepartamentoDocente departamento) {
            this.departamento = departamento;
        }
    }

}
