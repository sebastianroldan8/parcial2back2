package com.example.parcial2.mapas;

import com.example.parcial2.dtos.CineDTO;
import com.example.parcial2.modelos.Cine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IMapaCineDTO {
    IMapaCineDTO INSTANCE= Mappers.getMapper(IMapaCineDTO.class);

    // De entidad a DTO
    CineDTO toDTO(Cine cine);

    // De DTO a entidad
    @Mapping(target = "detalle", ignore = true) // ignoramos relaciones complejas
    Cine toEntity(CineDTO cineDTO);
}
