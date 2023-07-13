/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_24_2;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_24_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero natural:");
        int fiboSequence = sc.nextInt();
        System.out.println("La posicion " + fiboSequence + " en la sucesion Fibonacci es igual a: " + fibonacci(fiboSequence));
    }
    
    public static int fibonacci(int num) {
        int  startingNum= 1;
        int finalNum = 0;
        int resultado = 0;
        int i;
        switch (num) {
            case 0:
                resultado = 0;
                break;
            case 1:
                resultado = 1;
                break;
            default:
                for (i = 2; i <= num; i++) {
                    //va sumando hasta que complete x ciclos (el numero ingresado por el usuario
                    resultado = startingNum + finalNum;
                    finalNum = startingNum;
                    startingNum = resultado;
                }
                break;
        }
        return resultado;
    }
    
}
