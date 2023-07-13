/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_3;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_3 {

    /**
     * @param args the command line arguments
     */
    /**Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
    String.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una vocal");
        String vocal=leer.nextLine();
        if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")) {
            System.out.println("Es una vocal");
        } else  {System.out.println("No es una vocal");}
    }
    
}
