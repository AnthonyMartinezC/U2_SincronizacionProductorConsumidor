package org.example;

public class Main {
    public static void main(String[] args) {

        //llamada a la clase Intro para imprimir la introducción del programa
        Intro.printIntro();


        //llamada o instanciación de las clases Productor y Consumidor
        Reservado reservado = new Reservado();
        Productor productor = new Productor(reservado);
        Consumidor consumidor = new Consumidor(reservado);

        productor.start();
        consumidor.start();
    }
}