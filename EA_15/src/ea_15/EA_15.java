/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_15;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EA_15 {

    /**
     * @param args the command line arguments
     */
    /**Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.**/
    
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int [] vector=new int[100];
        for (int i = 0; i < vector.length; i++) {
            //vector[i]=(int) (Math.random()*100); //forma de ingresar a un vector numeros aleatorios
            vector[i]=i+1;
//            System.out.println(vector[i]);
            }
//        String aux="";
//        for (int elemento: vector) {//la forma de recorrer uno a uno los elementos de un vector
//            aux=aux+" "+elemento;
//        }
//        System.out.println(aux);


for (int i=vector.length-1; i>=0; i--) {//limite i >=0 para que recorra hasta la posicion 0, e inicia en i=vector.length-1
        System.out.print(vector[i]+" ");
        }

    }
    
}
