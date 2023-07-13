/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_16;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EA_16 {

    /**
     * @param args the command line arguments
     */
    /**Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido**/
    public static void main(String[] args) {
    Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector: ");
    int n=leer.nextInt();
    int [] vector=new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) (Math.random()*10); //forma de ingresar a un vector numeros aleatorios
    }
    
        System.out.println("Ingrese el numero que quiere buscar");
        int buscar=leer.nextInt();
        int contador=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==buscar) {
                System.out.println("El numero fue encontrado en la posicion " + i);
                contador=contador+1;
            }
                
            }
        System.out.println("El numero de veces encontrado fue "+ contador);
    }
    
}
