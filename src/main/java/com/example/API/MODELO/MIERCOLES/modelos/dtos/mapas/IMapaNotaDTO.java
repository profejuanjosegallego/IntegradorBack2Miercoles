package com.example.API.MODELO.MIERCOLES.modelos.dtos.mapas;

import com.example.API.MODELO.MIERCOLES.modelos.Nota;
import com.example.API.MODELO.MIERCOLES.modelos.dtos.NotaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaNotaDTO {

    IMapaNotaDTO INSTANCE= Mappers.getMapper(IMapaNotaDTO.class);

    //Convirtiendo modelodto en DTO

    @Mapping(source= "valor", target = "valor")
    @Mapping(source= "tipoEvaluacion", target = "tipoEvaluacion")
    @Mapping(source= "fecha", target = "fecha")
    @Mapping(source= "materia.materia", target = "materia")
    NotaDTO convertirADTO(Nota nota);

    //Mapeando una lista de datos de modelo a una lista de datos DTO
    List<NotaDTO>convertir_lista_a_DTO(List<Nota>lista);
}
