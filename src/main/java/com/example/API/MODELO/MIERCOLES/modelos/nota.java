package com.example.API.MODELO.MIERCOLES.modelos;


import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "notas")
public class nota {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "valor", nullable = false, unique = false)
        private Integer valor;

        @Column(name = "tipo_evaluacion", nullable = false, unique = false, length = 100)
        private String tipoEvaluacion;

        @Temporal(TemporalType.DATE)
        @Column(name = "fecha", nullable = false, unique = false)
        private Date fecha;

        @Column(name = "estudiante_id", nullable = false, unique = false)
        private Integer estudiante_id;

        @Column(name = "materia_id", nullable = false, unique = false)
        private Integer materia_id;


        public nota() {

        }


        public nota(Integer id, Integer valor, String tipoEvaluacion, Date fecha, Integer estudiante_id, Integer materia_id) {
            this.id = id;
            this.valor = valor;
            this.tipoEvaluacion = tipoEvaluacion;
            this.fecha = fecha;
            this.estudiante_id = estudiante_id;
            this.materia_id = materia_id;
        }
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getValor() {
            return valor;
        }

        public void setValor(Integer valor) {
            this.valor = valor;
        }

        public String getTipoEvaluacion() {
            return tipoEvaluacion;
        }

        public void setTipoEvaluacion(String tipoEvaluacion) {
            this.tipoEvaluacion = tipoEvaluacion;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public Integer getEstudiante_id() {
            return estudiante_id;
        }

        public void setEstudiante_id(Integer estudiante_id) {
            this.estudiante_id = estudiante_id;
        }

        public Integer getMateria_id() {
            return materia_id;
        }

        public void setMateria_id(Integer materia_id) {
            this.materia_id = materia_id;
        }
    }


