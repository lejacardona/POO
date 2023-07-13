/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_7;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_7 {

    /**
     * @param args the command line arguments
     */
    /**Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int n=leer.nextInt();
        int numero;
        int contador=0;
        int suma=0;        
        int max=0;
        int min=1;
        do {
            contador++;              
            System.out.println("Ingrese el numero");
            numero=leer.nextInt();
            suma=suma+numero;  
            if (numero>max) {
                max=numero;
            }
            if (numero<min) {
                min=numero;
            }
        } while (contador<n);
        
        float promedio=suma/n; 
	       System.out.println("El promedio de los numeros ingresados es "+promedio);
	       System.out.println("El valor maximo de los numeros ingresados es "+max);
	       System.out.println("El valor minimo de los numeros ingresados es "+min);	
    }
    
}
