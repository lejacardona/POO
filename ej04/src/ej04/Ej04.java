/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04;
import java.util.Scanner;
/**
 *
 * @author Alejandra
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int n;
    int i=0;
    do {
        System.out.println("Ingrese un numero");
        n=leer.nextInt();
        if (n==0) {
            System.out.println("Se capturó el numero cero");
            i=20;
            } 
        i=i+1;
       } while (i<20);
       }
    } 
