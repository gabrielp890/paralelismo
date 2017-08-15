/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        CountThread hilo1,hilo2, hilo3;
        //Se crea los tres hilos
         hilo1=new CountThread(0, 99, "Hilo 1");        
         hilo2=new CountThread(99, 199, "Hilo 2");        
         hilo3=new CountThread(200, 299, "Hilo 3");  
         //Se inicializa los tres hilos
         hilo1.start();
         hilo2.start();
        hilo3.start();
    }
    
}
