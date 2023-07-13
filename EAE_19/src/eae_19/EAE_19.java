/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_19;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_19 {

    /**
     * @param args the command line arguments
     */
    /**Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).**/
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    System.out.println("Ingrese el tamaño de los 2 vectores: ");
    int n1=leer.nextInt();
    int n2=leer.nextInt();
    //CREACION DEL VECTOR
    int [] vector1=new int[n1]; 
    int [] vector2=new int[n2]; 
    
    System.out.println("Ingrese los " + n1 + " numeros");
    //INGRESO MANUAL DE NUMEROS AL VECTOR
    int suma=0;
        for (int i = 0; i < n1; i++) {
            vector1[i]=leer.nextInt();            
        }  
    System.out.println("Ingrese los " + n2 + " numeros");      
        for (int i = 0; i < n2; i++) {
            vector2[i]=leer.nextInt();            
        }   
        
        for (int i = 0; i < n1; i++) {
            if (vector1[i]!=vector2[i]) {
                System.out.println("El elemento "+(i+1)+" no es igual");
                break;
        }
        }
        
 
    }
    
}
