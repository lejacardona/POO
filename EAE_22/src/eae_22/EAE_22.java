/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_22;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese las filas N de la matriz");
        int N=leer.nextInt();
        System.out.println("Ingrese las columnas M de la matriz");
        int M=leer.nextInt();
        int [][]matriz=new int[N][M];
        int suma=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j]=(int) (Math.random()*10);
                suma=suma+matriz[i][j];
            }
        }
        
        System.out.println("La suma de los elementos es: "+suma);
    }
    
}
