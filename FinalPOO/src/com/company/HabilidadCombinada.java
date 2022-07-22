package com.company;

import java.util.ArrayList;
import java.util.List;

public class HabilidadCombinada extends Habilidad
{
    private int factorMultiplicador;
    private List<Habilidad> habilidades;

    public HabilidadCombinada()
    {
        super();
        habilidades=new ArrayList<>();
    }

    @Override
    public double calcularPuntaje() {
        double sumaPuntos=0;
        for(Habilidad h:habilidades)
            sumaPuntos+=h.calcularPuntaje();
        return sumaPuntos*factorMultiplicador;
    }

    @Override
    public String mostrarInfo() {
        return "\nNombre: "+getNombre()+" Puntaje: "+calcularPuntaje();
    }

    public void agregarHabilidad(Habilidad h)
    {
        habilidades.add(h);
    }

    public void setFactorMultiplicador(int factorMultiplicador) {
        this.factorMultiplicador = factorMultiplicador;
    }
}
