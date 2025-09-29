package com.example.parcial2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "salas")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Este campo es obligatorio")
    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;
    @NotNull(message = "Este campo es obligatorio")
    @Column(name = "capacidad", nullable = false, unique = true)
    private Integer capacidad;
    @NotNull(message = "Este campo es obligatorio")
    @Column(name = "tipo", nullable = false, unique = true)
    private String tipo; // 2D, 3D, IMAX...

   @ManyToOne(fetch = FetchType.LAZY, optional = false)
   @JsonBackReference(value = "relacioncinesala")
   @JoinColumn(name = "fk_cine", referencedColumnName = "id")
    private Cine cine;

    public Sala() {
    }

    public Sala(Long id, String nombre, Integer capacidad, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }
}
