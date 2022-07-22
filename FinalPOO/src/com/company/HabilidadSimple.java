package com.company;

public class HabilidadSimple extends Habilidad
{
    private double puntaje;

    @Override
    public double calcularPuntaje() {
        if(getNombre().equals("Disparar"))
            puntaje=puntaje*1.1;
        return puntaje;
    }

    @Override
    public String mostrarInfo() {
        return "\nNombre: "+getNombre()+" Puntaje: "+calcularPuntaje();
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
}
