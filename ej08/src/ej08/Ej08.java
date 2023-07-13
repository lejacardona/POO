/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej08;
import java.util.Scanner;
/**
 *
 * @author Alejandra
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una frase");
    String frase = leer.nextLine();
    String nuevaCadena=frase.replace('a','@');
    nuevaCadena=nuevaCadena.replace('e','#');
    nuevaCadena=nuevaCadena.replace('i','$');
    nuevaCadena=nuevaCadena.replace('o','%');
    nuevaCadena=nuevaCadena.replace('u','*');
    
        System.out.println(nuevaCadena);
     }
    } 
