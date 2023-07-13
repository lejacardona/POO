/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_20;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EA_20 {

    /**
     * @param args the command line arguments
     */
    /**Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    
    
    int [][] matriz=new int [3][3];
    int verificar=0;
    
        for (int i = 0; i < 3; i++) {//ingresar numeros de la matriz
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Ingresa los 9 numeros de la matriz 3x3");
                matriz[i][j]=leer.nextInt();
                
                                          
            }                     
          }
        mostrarMatriz(matriz);
        magica(matriz);
        }
    private static void mostrarMatriz(int [][] matriz){
        
   
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
}

   
    private static void magica(int[][]matriz){
    int contador=0;
    int sumacolumna=0;
    int sumafila=0;
    int sumadiagprinc=0;
    int sumadiagsecun=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumacolumna=sumacolumna+matriz[j][i]; //suma los valores de cada columna
		sumafila=sumafila+matriz[i][j]; //suma los valores de cada fila
                }
                if (sumacolumna==sumafila) {//si la suma de la fila 0 es igual a la suma de la columna 0
                    contador++;
                }
		sumadiagprinc=sumadiagprinc+matriz[i][i]; //suma la diagonal principal
		sumadiagsecun=sumadiagsecun+matriz[3-1-i][i]; //suma la diagonal secundaria          
            }
        
        if (sumadiagprinc==sumadiagsecun & contador==3) {
            System.out.println("corrrrecto!");
            System.out.println("y la suma es "+sumadiagprinc);
        }else   {
            System.out.println("Incorrrrecto!");}
        }
}
