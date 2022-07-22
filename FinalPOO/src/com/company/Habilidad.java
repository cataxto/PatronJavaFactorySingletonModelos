package com.company;

public abstract class Habilidad
{
    private String nombre;
    private String descripcion;

    public abstract double calcularPuntaje();
    public abstract String mostrarInfo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
