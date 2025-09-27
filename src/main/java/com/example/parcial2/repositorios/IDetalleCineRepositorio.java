package com.example.parcial2.repositorios;


import com.example.parcial2.modelos.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleCineRepositorio extends JpaRepository<DetalleCine, Integer> {
    @Query("SELECT d FROM DetalleCine d WHERE d.telefono = :telefono")
    DetalleCine buscarPorTelefono(String telefono);

}
