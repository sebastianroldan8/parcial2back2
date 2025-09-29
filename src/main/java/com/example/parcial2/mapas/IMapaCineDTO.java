package com.example.parcial2.mapas;

import com.example.parcial2.dtos.CineDTO;
import com.example.parcial2.modelos.Cine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IMapaCineDTO {

    // De DTO a entidad
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "nit", target = "nit")
    @Mapping(source = "detalle.direccion", target = "direccion")

    CineDTO convertir_a_cineDTO (Cine cine);
}
