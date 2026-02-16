package com.example.API.MODELO.MIERCOLES.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "VinculoFamiliarEstudiante")
public class VinculoFamiliarEstudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "familiar_id")
    private Integer familiar_id;

    @Column(name = "estudiante_id")
    private Integer estudiante_id;

    @Column(name = "autorizado")
    private Boolean autorizado;

    public VinculoFamiliarEstudiante() {
    }

    public VinculoFamiliarEstudiante(Integer id, Integer familiar_id, Integer estudiante_id, Boolean autorizado) {
        this.id = id;
        this.familiar_id = familiar_id;
        this.estudiante_id = estudiante_id;
        this.autorizado = autorizado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFamiliar_id() {
        return familiar_id;
    }

    public void setFamiliar_id(Integer familiar_id) {
        this.familiar_id = familiar_id;
    }

    public Integer getEstudiante_id() {
        return estudiante_id;
    }

    public void setEstudiante_id(Integer estudiante_id) {
        this.estudiante_id = estudiante_id;
    }

    public Boolean getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Boolean autorizado) {
        this.autorizado = autorizado;
    }
}
