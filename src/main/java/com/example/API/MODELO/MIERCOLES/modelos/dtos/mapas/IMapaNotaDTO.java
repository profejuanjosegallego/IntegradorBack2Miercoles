package com.example.API.MODELO.MIERCOLES.modelos.dtos.mapas;

import com.example.API.MODELO.MIERCOLES.modelos.Nota;
import com.example.API.MODELO.MIERCOLES.modelos.dtos.NotaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IMapaNotaDTO {

    IMapaNotaDTO INSTANCE= Mappers.getMapper(IMapaNotaDTO.class);

    //Convirtiendo modelodto en DTO

    NotaDTO convertirADTO(Nota nota);
}
