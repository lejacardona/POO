/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_11;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_11 {

    /**
     * @param args the command line arguments
     */
    /**Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int n=leer.nextInt();
        int aux=n;
        int contador=0;
        while (aux>0){ //auxiliar mayor que 0, (aux esta igualado al vector)
                contador=contador+1; //cada vez que se sume es porque suma 1 digito
                aux=aux/10;    //divido por 10, y deja de entrar al ciclo cuando es menor que 0 o igual                             
                }
        System.out.println("El numero tiene "+contador+" digitos");
    }
    
}
