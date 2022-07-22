package com.company;

public class HabilidadFactory
{
    //Definir atributos
    private static HabilidadFactory instancia;
    private static final String SIMPLE="Simple";
    private static final String COMBINADA="Combinada";

    //Constructor de la clase privado
    private HabilidadFactory(){}

    //Definir el getInstance()
    public static HabilidadFactory getInstancia()
    {
        if(instancia==null)
            instancia=new HabilidadFactory();
        return instancia;
    }

    //Metodo para creacion de objetos
    public Habilidad crearHabilidad(String codigo)
    {
        switch (codigo)
        {
            case SIMPLE:
                return new HabilidadSimple();
            case COMBINADA:
                return new HabilidadCombinada();
        }
        return null;
    }
}
