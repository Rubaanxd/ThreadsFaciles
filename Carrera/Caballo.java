/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrera;

import java.util.Observable;

/**
 *
 * @author Ruben Angeles
 */
public class Caballo extends Observable implements Runnable{

    private String nombre;

    public Caballo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    @Override
    public void run() {
        int porcentaje = 0;
        int random;
        try {
            while(porcentaje<=100){
                random = es.discoduroderoer.numeros.Aleatorios.generaNumeroAleatorio(1, 15);
                System.out.println("Caballo "+nombre+ " tiene ha aumentado en "+random);
                porcentaje += random;
                this.setChanged();
                this.notifyObservers(porcentaje);
                this.clearChanged();
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("Caballo "+nombre +" interrumpido");
        }
    }
    
}
