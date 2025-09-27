package com.example.parcial2.dtos;


public class CineDTO {
    private Long id;
    private String nombre;
    protected String nit;

    public CineDTO() {
    }

    public CineDTO(String nit, String nombre, Long id) {
        this.nit = nit;
        this.nombre = nombre;
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
