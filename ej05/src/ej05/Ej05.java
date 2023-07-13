/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej05;
import java.util.Scanner;
/**
 *
 * @author Alejandra
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int j=0;
         
         do {           
        System.out.println(" ");   
        System.out.println("Ingrese 4 numeros");
        int n=leer.nextInt(); 
             System.out.print(n);
             for (int i = 0; i < n; i++) {
                 System.out.print("*");    
        }
         j=j+1;        
         }while (j<4); 
         
        }
    }
    
