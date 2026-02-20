package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;


    @Entity
    @Table(name = "AndresLondono")
    public class AndresLondono {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer Id;

        @Column(name = "direccion", length = 80)
        private String direccion;

        @Column(name = "Hincha")
        private boolean EsHinchaVerdolaga;


        public AndresLondono() {
        }

        public AndresLondono(Integer id, String direccion, boolean esHinchaVerdolaga) {
            Id = id;
            this.direccion = direccion;
            EsHinchaVerdolaga = esHinchaVerdolaga;
        }

        public Integer getId() {
            return Id;
        }

        public void setId(Integer id) {
            Id = id;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public boolean isEsHinchaVerdolaga() {
            return EsHinchaVerdolaga;
        }

        public void setEsHinchaVerdolaga(boolean esHinchaVerdolaga) {
            EsHinchaVerdolaga = esHinchaVerdolaga;
        }
    }
