package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISalaRepositorio extends JpaRepository<Sala, Long> {
    @Query("SELECT s FROM Sala s WHERE s.capacidad > :capacidad")
    List<Sala> buscarSalasConCapacidadMayor(int capacidad);
}
