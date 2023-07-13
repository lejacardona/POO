/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**
 *
 * @author Alejandra
 */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numEntero = leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        int numEntero2 = leer.nextInt();
        
        if  (numEntero>25  || numEntero2>25 ){
        System.out.println("Uno o ambos numeros son mayores a 25");
           
        }
        }  
}  

    
        
