package com.example.parcial2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "cines")
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, unique = false)
    @NotNull(message = "Este campo es obligatorio")
    private String nombre;
    @Column(name = "nit", nullable = false, unique = true)
    private String nit;

   @OneToOne(mappedBy = "cine")
   @JsonBackReference(value = "relacioncinedetalle")
    private DetalleCine detalle;

  @OneToMany(mappedBy = "cine")
  @JsonBackReference(value = "relacioncinesala")
   private List<Sala> salas;

    public Cine() {
    }

    public Cine(String nombre, String nit, Long id) {
        this.nombre = nombre;
        this.nit = nit;
        this.id = id;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}