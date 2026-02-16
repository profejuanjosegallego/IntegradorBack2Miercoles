package com.example.API.MODELO.MIERCOLES.modelos;

@entity
@table(name="JuanEcheverria")
public class JuanEcheverria {

    @id
    @generated
    @generatedValue
    private  Integer id;

    private  String direccion;

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

    public Boolean getEsHinchaVerdolaga() {
        return esHinchaVerdolaga;
    }

    public void setEsHinchaVerdolaga(Boolean esHinchaVerdolaga) {
        this.esHinchaVerdolaga = esHinchaVerdolaga;
    }

    private  Boolean esHinchaVerdolaga;

}
