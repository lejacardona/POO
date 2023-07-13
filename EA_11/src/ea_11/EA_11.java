/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_11;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EA_11 {

    /**
     * @param args the command line arguments
     */
    /**Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        float numero1;
        float numero2;
        do {
            System.out.println("Ingrese 2 numeros enteros positivos");
            numero1=leer.nextInt();
            numero2=leer.nextInt();
        } while (numero1<0 || numero2<0);
        
        int opcion;
        String answer="N";
        do {
        System.out.println("Elija una opción del MENU:");
        System.out.println("1. Sumar\n" + "2. Restar\n" + "3. Multiplicar\n" + "4. Dividir\n" + "5. Salir"); //"\n" este es para saltar de línea
        opcion=leer.nextInt();
             switch  (opcion){
            case 1:
                float suma=numero1+numero2;
                System.out.println("La suma de los numeros es " + suma);
                break;
            case 2:
                float resta=numero1-numero2;
                System.out.println("La resta de los numeros es " + resta);
                break;
            case 3:
                float producto=numero1*numero2;
                System.out.println("El producto de los numeros es " + producto);
                break;
            case 4:
                float division=numero1/numero2;
                System.out.println("El resultado de la division n1/n2 es " + division);
                break;
                           
                }
             
        } while (opcion!=5);        
    }
}

