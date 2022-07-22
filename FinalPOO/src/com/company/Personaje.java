package com.company;

import java.util.ArrayList;
import java.util.List;

public class Personaje
{
    private String nombre;
    private List<Habilidad> habilidades;

    public Personaje(String nombre)
    {
        this.nombre=nombre;
        habilidades=new ArrayList<>();
    }

    public void agregarHabilidad(Habilidad h)
    {
        habilidades.add(h);
    }

    public String generarInforme()
    {
        String cadenaHabilidades="";
        for(Habilidad h: habilidades)
            cadenaHabilidades+=h.mostrarInfo();
        return cadenaHabilidades;
    }


}
