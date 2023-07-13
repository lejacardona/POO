/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_13;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EA_13 {

    /**
     * @param args the command line arguments
     */
    /**Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del lado del cuadrado");
        int lado=leer.nextInt();
        for (int i = 0; i < lado; i++) { //el fin en el for es lado (no lado-1 como en pseint), no se si funciona si le pongo <= lado
            System.out.println(" ");
            for (int j = 0; j < lado; j++) {
                if (i==0 || i==lado-1 || j==0 || j==lado-1) {
                System.out.print("* ");                             
            }else   {
                    System.out.print("  ");
                }
            }
            
        }
    }
    
}
