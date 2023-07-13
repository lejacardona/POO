/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_20;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_20 {

    /**
     * @param args the command line arguments
     */
    /**Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.**/
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    System.out.println("Ingrese el tamaño del vector: ");
    int n=leer.nextInt();
    int [] vector=new int[n]; 
    for (int i = 0; i < n; i++) {
            vector[i]=(int)(Math.random()*10);
        } 
    for (int i = 0; i < n; i++) {
            System.out.println("["+vector[i]+"]");
        } 
        
    }
    
    
}
