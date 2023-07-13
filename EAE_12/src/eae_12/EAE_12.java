/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_12;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra;
       
        for (int i = 0; i < 1000; i++) {
            //Agregar al string valor de i
            palabra=String.valueOf(i);
            //si la palabra contiene 3
            if(palabra.contains("3")){
                //entonces cambiela por una e
            palabra=palabra.replace("3","E");
            }
            //si la longitud de la palabra es igual a 1,2 o 3
            switch (palabra.length()) {
                case 1:
                    //escriba 0-0-numero
                    System.out.println("0-0-"+palabra);
                    break;
                case 2:
                    //escriba 0-caracter en la posicion 0-caracter en la posicion 1
                    //esta posicion no tiene que cambiar porque en la palbra estara el numero completo, si es 300 o 123
                    System.out.println("0-"+palabra.charAt(0)+ "-"+palabra.charAt(1));
                    break;
                case 3:
                    System.out.println(palabra.charAt(0)+"-"+palabra.charAt(1)+"-"+palabra.charAt(2));
                    break;
               
            }
           
            
        }
       
    }
    
}
    
