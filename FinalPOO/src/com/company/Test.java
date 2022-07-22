package com.company;

import java.util.Scanner;

public class Test {

    public static void main(String[] args)
    {
	    //Crear el personaje
        Personaje personaje = new Personaje("Chad");

        //Crear habilidades
        Habilidad hab1 = new HabilidadSimple();
        ((HabilidadSimple)hab1).setNombre("Saltar");
        ((HabilidadSimple)hab1).setPuntaje(0);
        Habilidad hab2 = new HabilidadSimple();
        ((HabilidadSimple)hab2).setNombre("Disparar");
        ((HabilidadSimple)hab2).setPuntaje(10);
        Habilidad hab3 = new HabilidadCombinada();
        ((HabilidadCombinada)hab3).setNombre("Disparo-al-saltar");
        ((HabilidadCombinada)hab3).setFactorMultiplicador(3);
        /*OPCIONAL
        //Cargar informacion en habilidades
        cargarDatos(hab1);
        cargarDatos(hab2);
        cargarDatos(hab3);
        */
        //Agregar habilidades a habilidades complejas
        try {
            cargarHabilidades(hab3,hab1);
        } catch (Exception e) {
            System.out.println("Error al cargar la habilidad");
        }
        try {
            cargarHabilidades(hab3,hab2);
        } catch (Exception e) {
            System.out.println("Error al cargar la habilidad");
        }

        //Agregar habilidades al personaje
        personaje.agregarHabilidad(hab1);
        personaje.agregarHabilidad(hab2);
        personaje.agregarHabilidad(hab3);

        //Mostrar información de las habilidades del personaje
        System.out.println(personaje.generarInforme());


    }

    private static void cargarHabilidades(Habilidad combinada, Habilidad habilidad) throws Exception
    {
        if(combinada instanceof HabilidadCombinada)
            ((HabilidadCombinada)combinada).agregarHabilidad(habilidad);
        else
            throw new Exception("No se pueden cargar habilidades en una habilidad simple");
    }

    private static void cargarDatos(Habilidad hab)
    {
        Scanner scanner = new Scanner(System.in);
        if(hab instanceof HabilidadSimple)
        {
            System.out.print("Ingrese puntaje de la habilidad simple: " );
            ((HabilidadSimple)hab).setPuntaje(scanner.nextDouble());
            System.out.print("Ingrese nombre de la habilidad simple: " );
            ((HabilidadSimple)hab).setNombre(scanner.nextLine());
            scanner.nextLine();
        }
        if(hab instanceof HabilidadCombinada)
        {
            System.out.print("Ingrese factor multiplicador de la habilidad combinada: " );
            ((HabilidadCombinada)hab).setFactorMultiplicador(scanner.nextInt());
            System.out.print("Ingrese nombre de la habilidad combinada: " );
            ((HabilidadCombinada)hab).setNombre(scanner.nextLine());
            scanner.nextLine();
        }
    }
}
