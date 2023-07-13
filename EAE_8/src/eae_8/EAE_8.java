/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_8;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_8 {

    /**
     * @param args the command line arguments
     */
    /**Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.**/
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
     int numero;
     int contador=0;
     int sumaPar=0;
     int sumaImpar=0;
        do {
            contador++;
            System.out.println("Ingrese los numeros");
            numero=leer.nextInt();
            
            if (numero%2==0) {
                sumaPar++;
            }else   {
                sumaImpar++;
            }
        } while (numero % 5 != 0);
        
        System.out.println("Se leyeron "+ contador + " numeros");
        System.out.println("Se hallaron "+ sumaPar + " numeros pares");
        System.out.println("Se hallaron "+ sumaImpar + " numeros impares");
        
    }
    
}
