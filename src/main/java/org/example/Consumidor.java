package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread{
    private static final Logger LOGGER = Logger.getLogger(Consumidor.class.getName()); // Logger para la clase
    private Reservado reservado;

    //Constructor
    public Consumidor(Reservado reservado){
        this.reservado = reservado;
    }

    @Override
    public void run(){
        for(int i = 1;i<=5 ; i++){//Simulamos liberar 5 mesas
            try {
               Thread.sleep((1500)); //Tiempo para que los clientes paguen y se vayan
                reservado.consume();
                System.out.println("Grupo de clientes despedido con amabilidad :).");
            } catch (InterruptedException e) {
                LOGGER.log(Level.SEVERE, "Error en el consumidor al despedir clientes.", e);
            }
        }
    }
}
