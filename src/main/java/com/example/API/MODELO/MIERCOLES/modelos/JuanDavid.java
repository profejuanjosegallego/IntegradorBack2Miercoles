package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

    @Entity
    @Table(name = "JuanDavid")
    public class JuanDavid {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "direccion", length = 30)
        private String direccion;

        @Column(name = "hincha")
        private boolean esHinchaVerdolaga;

        public JuanDavid() {
        }

        public JuanDavid(Integer id, String direccion, boolean esHinchaVerdolaga) {
            this.id = id;
            this.direccion = direccion;
            this.esHinchaVerdolaga = esHinchaVerdolaga;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public boolean isEsHinchaVerdolaga() {
            return esHinchaVerdolaga;
        }

        public void setEsHinchaVerdolaga(boolean esHinchaVerdolaga) {
            this.esHinchaVerdolaga = esHinchaVerdolaga;
        }

    }
