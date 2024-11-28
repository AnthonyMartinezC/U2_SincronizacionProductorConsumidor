package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread {
    private static final Logger LOGGER = Logger.getLogger(Productor.class.getName()); // Logger para la clase
    private Reservado reservado;

    //Constructor
    public Productor(Reservado reservado) {
        this.reservado = reservado;
    }

    //Colocar a 5 grupos de clientes en las mesas

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) { // Simula acomodar a 5 grupos de clientes
            try {
                Thread.sleep(1000); // Simula el tiempo necesario para sentar a los clientes
                reservado.produce(); // Ocupar una mesa
                System.out.println("Atendiendo al grupo de clientes " + i);
            } catch (InterruptedException e) {
                // Manejo de excepciones con el logger que complementa el manejo de excepciones.
                LOGGER.log(Level.SEVERE, "Error en el productor al atender clientes.", e);
            }
        }
    }
}
