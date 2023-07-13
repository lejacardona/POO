/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_14;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_14 {

    /**
     * @param args the command line arguments
     */
    /**Crea una aplicación que le pida dos números al usuario y este pueda 
     * elegir entre sumar, restar, multiplicar y dividir. La aplicación 
     * debe tener una función para cada operación matemática y deben devolver
     * sus resultados para imprimirlos en el main
     * @param args.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
              
        System.out.println("MENU");
        System.out.println("A. Sumar ");
        System.out.println("B. Restar ");
        System.out.println("C. Multiplicar ");
        System.out.println("D. Dividir ");
        System.out.println("Elija la operacion que desea realizar (A, B, C o D):");
        String  opcion;
        opcion = leer.nextLine();
        System.out.println("Ingrese 2 numeros");
        int n1=leer.nextInt();
        int n2=leer.nextInt();             
    
        switch  (opcion){
            case "A":
                int suma=sumar(n1,n2);
                System.out.println("La suma es "+suma);
                break;
            case "B":
                int resta=restar(n1,n2);
                System.out.println("La resta es "+resta);
                break;
            case "C":
                float division=dividir(n1,n2);
                System.out.println("La division es "+division);
                break;
            case "D":
                int multiplicar=multiplicar(n1,n2);
                System.out.println("El producto es "+multiplicar);
                break;
        }
        
        
    }
    
    
    public static int sumar(int n1, int n2){ //mencionar los argumentos en el subproceso
    int suma=n1+n2;
    return suma;
}
    public static int restar(int n1, int n2){ //mencionar los argumentos en el subproceso
    int resta=n1-n2;
    return resta;
}
    public static float dividir(int n1, int n2){ //mencionar los argumentos en el subproceso
    int division=n1/n2;
    return division;
}
    public static int multiplicar(int n1, int n2){ //mencionar los argumentos en el subproceso
    int producto=n1*n2;
    return producto;
}
}
