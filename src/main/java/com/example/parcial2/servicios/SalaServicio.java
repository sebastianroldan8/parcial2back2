package com.example.parcial2.servicios;

import com.example.parcial2.modelos.Sala;
import com.example.parcial2.repositorios.ISalaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaServicio {
    @Autowired
    private ISalaRepositorio salaRepositorio;

    public Sala guardar(Sala sala) {
        return salaRepositorio.save(sala);
    }
}
