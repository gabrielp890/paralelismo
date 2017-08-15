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
    int numeroHilos;

    public ManejoHilos(int numeroHilos) {
        this.numeroHilos = numeroHilos;
    }

    @Override
    public void run() {
        for (int i = 0; i < numeroHilos; i++) {
            
        }
    }
    
}
