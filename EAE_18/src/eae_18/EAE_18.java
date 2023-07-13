/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_18;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_18 {

    /**
     * @param args the command line arguments
     */
    /**Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.**/
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    System.out.println("Ingrese el tamaño del vector: ");
    int n=leer.nextInt();
    //CREACION DEL VECTOR
    int [] vector=new int[n]; 
    System.out.println("Ingrese los " + n + " numeros");
    //INGRESO MANUAL DE NUMEROS AL VECTOR
    int suma=0;
        for (int i = 0; i < n; i++) {
            vector[i]=leer.nextInt();
            suma=suma+vector[i];
        }  
        System.out.println("La suma de los numeros ingresados al vector es: "+suma);
    }
    
}
