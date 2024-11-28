package org.example;

public class Intro {
    //Cree ésta clase porque vi que era buena idea tener una clase que se encargue de imprimir la introducción del programa.
    //Pienso que lo hace mas amigable y ademas muestro quien es el autor del programa.
    public static void printIntro() {
        System.out.println("---------------------------------------------------");
        System.out.println("Descripcion del Programa:");
        System.out.println("Este programa, desarrollado en lenguaje Java, resuelve el clasico problema de sincronizacion conocido como Productor-Consumidor.");
        System.out.println();
        System.out.println("Contexto del problema:");
        System.out.println("Un restaurante exclusivo cuenta con un espacio reservado de 3 mesas para atender a sus clientes más selectos.");
        System.out.println("El programa simula la gestion de este espacio, donde un empleado realiza dos tareas principales:");
        System.out.println("1. Sentar a los clientes en las mesas y atenderlos.");
        System.out.println("2. Cobrar las cuentas y despedir a los clientes con amabilidad.");
        System.out.println();
        System.out.println("Caracteristicas:");
        System.out.println("- Se asegura que no se ocupen más mesas de las disponibles.");
        System.out.println("- Los clientes son atendidos y despedidos de forma sincronizada, evitando conflictos entre las acciones del empleado.");
        System.out.println();
        System.out.println("Autor: Anthony Martinez");
        System.out.println("---------------------------------------------------");
    }
}
