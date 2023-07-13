/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_10;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EA_10 {

    /**
     * @param args the command line arguments
     */
    /**Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
    solicite números al usuario hasta que la suma de los números introducidos supere el
    límite inicial.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner (System.in);
    System.out.println("Ingrese la cantidad de numeros que quiere ingresar");
            int numero=leer.nextInt();
        for (int i = 0; i < numero; i++) { //si quiero que ingreso la cantidad de numero que le ingreso asi, si quiero que supere ese numero le pongo +1
          System.out.println("Ingrese un numero");   
            int numeros=leer.nextInt();  
        }
            
            
        
        
    }
    
}
