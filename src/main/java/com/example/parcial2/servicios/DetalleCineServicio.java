package com.example.parcial2.servicios;

import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.repositorios.IDetalleCineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleCineServicio {
    @Autowired
    private IDetalleCineRepositorio detalleCineRepository;

    public DetalleCine guardar(DetalleCine detalleCine) {
        return detalleCineRepository.save(detalleCine);
    }
}
