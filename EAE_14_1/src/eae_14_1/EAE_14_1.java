/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_14_1;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_14_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/* Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
*/
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese el numero de familias");
      int N=leer.nextInt();
      System.out.println("Ingrese el numero de hijos");
      int M=leer.nextInt();
      int [][] matriz=new int[N][M];
      int sumaEdad=0;
      int promedio=0;
        for (int i = 0; i < N; i++) {
            System.out.println("Esta es la familia "+(i+1));
            for (int j = 0; j < M; j++) {
                System.out.println("Ingrese la edad del hijo "+(j+1));
                matriz[i][j]=leer.nextInt();
                sumaEdad=sumaEdad+matriz[i][j];
            }
        }
        
        promedio=sumaEdad/(N*M);
        System.out.println("El promedio de dedad de los hijos de todas las familias es: "+promedio);
    }
    
}
