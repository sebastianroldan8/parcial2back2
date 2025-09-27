package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICineRepositorio extends JpaRepository<Cine,Integer> {
    @Query("SELECT c FROM Cine c WHERE c.nombre LIKE %:nombre%")
    Cine buscarPorNombre(String nombre);
}
