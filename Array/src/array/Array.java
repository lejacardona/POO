/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;


import java.util.Arrays;

/**
 *
 * @author Alejandra
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    double [] vectorA =new double [50];
    double [] vectorB =new double [20];
    
    //LLENAR VECTORES ALEATORIAMENTE
        for (int i = 0; i < 50; i++) {
            vectorA[i]=(int) (Math.random() * 10 + 1);                 
        }
    //MOSTRAR VECTOR POR PANTALLA   
        System.out.println("El vector llenado aleatoriamente se ve asi");
        System.out.println(Arrays.toString(vectorA));
        
    //ORGANIZAR VECTOR DE MENOR A MAYOR
        System.out.println(" ");
        Arrays.sort(vectorA);
        
    //MOSTRAR VECTOR POR PANTALLA 
        System.out.println(Arrays.toString(vectorA));
        System.out.println("El vector organizado se ve asi");
        
    //LLENAR VECTOR CON LOS PRIMEROS NUMEROS DEL OTRO VECTOR    
        for (int i = 0; i < 10; i++) {
            vectorB[i]=vectorA[i];
        }
    //LLENAR VECTOR CON 0.5         
        Arrays.fill(vectorB,10,20,0.5);
        
        //MOSTRAR VECTOR POR PANTALLA  
        System.out.println("Los numeros del vector B son: ");              
        System.out.println(Arrays.toString(vectorB));
       
    }
    
}
