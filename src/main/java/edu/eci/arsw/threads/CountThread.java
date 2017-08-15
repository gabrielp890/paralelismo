/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread{
    
    int inicio;
    int fin;
    String nombre;

    public CountThread(int inicio, int fin, String nombre) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
    }
    
    @Override
    public void run(){
        for (int i = inicio; i < fin; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(CountThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(nombre+" tiempo:"+i);
        }
        System.out.println("-------- "+nombre+" terminado -----------");
    }
    
}
