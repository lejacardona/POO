/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_13;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_13 {

    /**
     * @param args the command line arguments
     */
    /**Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. 
     * Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar la altura de la escalera de numeros");
        int n=leer.nextInt();
        String fila="";
        for (int i = 1; i <= n; i++) {
            fila=fila.concat(String.valueOf(i));
            System.out.println(fila);
        }
    }
    
}
