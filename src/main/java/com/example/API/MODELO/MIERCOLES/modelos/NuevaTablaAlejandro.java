package com.example.API.MODELO.MIERCOLES.modelos;

import com.example.API.MODELO.MIERCOLES.ayudas.NuevoEnumAlejandro;
import jakarta.persistence.*;

@Entity
@Table(name = "TablaNueva")
public class NuevaTablaAlejandro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Nombres", nullable = false, unique = true, length = 60)
    private String nombres;

    @Column(name = "Apellidos", nullable = false, unique = true, length = 60)
    private String apellidos;

    @Column(name = "EstaMatriculado", nullable = false, unique = false)
    private Boolean estaMatriculado;

    @Column(name = "EstadoMatricula", nullable = false, unique = false)
    @Enumerated(value = EnumType.STRING)
    private NuevoEnumAlejandro estadoMatricula;

    public NuevaTablaAlejandro() {
    }

    public NuevaTablaAlejandro(Integer id, String nombres, String apellidos, Boolean estaMatriculado, NuevoEnumAlejandro estadoMatricula) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estaMatriculado = estaMatriculado;
        this.estadoMatricula = estadoMatricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Boolean getEstaMatriculado() {
        return estaMatriculado;
    }

    public void setEstaMatriculado(Boolean estaMatriculado) {
        this.estaMatriculado = estaMatriculado;
    }

    public NuevoEnumAlejandro getEstadoMatricula() {
        return estadoMatricula;
    }

    public void setEstadoMatricula(NuevoEnumAlejandro estadoMatricula) {
        this.estadoMatricula = estadoMatricula;
    }
}
