/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_5;
import java.util.Scanner;
/**
 *
 * @author Alejandra
 */
public class EA_5 {

    /**
     * @param args the command line arguments
     */
    /**Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
    Math.sqrt().**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero=leer.nextInt();
        int doble=numero*2;
        int triple=numero*3;
        double raiz=Math.sqrt(numero);
        
        System.out.println("El doble del numero ingresado es: "+ doble);
        System.out.println("El triple del numero ingresado es: "+ triple);
        System.out.println("La raiz cuadrada del numero ingresado es: "+ raiz);
    }
    
}
