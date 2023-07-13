/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_6;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_6 {

    /**
     * @param args the command line arguments
     */
    /**Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner (System.in);
        System.out.println("¿Cuantas personas son?");
        int personas=leer.nextInt();
        double alturas [] = new double[personas];
        double suma=0;
        int contador=0;
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese una estatura");
            alturas[i]=leer.nextDouble();
            double estatura=alturas[i];
            if (estatura<1.60) {
                suma=suma+estatura;
                contador++;         //no se divide por el numero de personas, sino por el numero de personas con estatura <1.6       
            }
            
        }
        double promedio=suma/contador;
        System.out.println("El promedio de las estaturas es "+promedio);
    }
    
}
