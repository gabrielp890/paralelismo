/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

/**
 *
 * @author Gabriel
 */
public class ManejoHilos extends Thread{
    int numeroHilos, inicio, tamaño;

    public ManejoHilos(int inicio, int tamaño) {
        this.inicio = inicio;
        this.tamaño = tamaño;
    }

    @Override
    public void run() {
        System.out.println("inicio: "+inicio+" tamaño: "+tamaño+ " "+PiDigits.getDigits(inicio, tamaño));
//        for (int i = inicio; i < tamaño; i++) {
//            System.out.println("inicio: "+inicio+" tamaño: "+tamaño+" contador: "+i); 
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ManejoHilos.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
       
    }
    
}
