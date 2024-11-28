package org.example;

import java.net.StandardSocketOptions;
import java.util.LinkedList;

public class Reservado {
    private LinkedList<Object> list = new LinkedList<>(); // Lista de mesas ocupadas
    private final int MAX_SIZE = 3; // Número máximo de mesas(exclusivas)

    //Método para ocupar una mesa, aqui nos evitamos las condiciones de carrera usando synchronized

    public synchronized void produce() throws InterruptedException {
        //Esperar mientras la lista esté llena
        while (list.size() == MAX_SIZE) {
            System.out.println("No hay mesas disponibles.Esperando a que se libere una...");
            wait();
        }

        //Añade una nueva mesa ocupada
        list.add(new Object());
        System.out.println("Mesa ocupada.Total de mesas ocupadas: " + list.size());
        notifyAll();//Avisa a los consumidores de que hay mesas disponibles
    }

    //Método para liberar una mesa
    public synchronized void consume() throws InterruptedException {
        // Espera si no hay mesas ocupadas
        while (list.isEmpty()) {
            System.out.println("No hay mesas ocupadas. Esperando a que lleguen clientes...");
            wait();
        }
        // Libera una mesa ocupada
        list.remove();
        System.out.println("Mesa liberada. Total de mesas ocupadas: " + list.size());
        notifyAll(); // Notifica que hay espacio para más clientes
    }
}

