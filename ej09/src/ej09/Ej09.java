/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej09;
import java.util.Scanner;
/**
 *
 * @author Alejandra
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
    int numero1=leer.nextInt();
    int numero2=leer.nextInt();
    esMultiplo(numero1,numero2);
    }
    
    public static void esMultiplo (int numero1, int numero2){
    boolean m;
    m= numero1 % numero2 ==0;
        System.out.println("El numero es multiplo " + m);
}
}
