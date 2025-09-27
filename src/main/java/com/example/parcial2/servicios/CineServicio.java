package com.example.parcial2.servicios;

import com.example.parcial2.mapas.IMapaCineDTO;
import com.example.parcial2.modelos.Cine;
import com.example.parcial2.repositorios.ICineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CineServicio {
    @Autowired
    private ICineRepositorio cineRepository;
    @Autowired
    IMapaCineDTO mapa;

    public Cine guardar(Cine cine) {
        return cineRepository.save(cine);
    }
}
