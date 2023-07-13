/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_10;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_10 {

    /**
     * @param args the command line arguments
     */
    /**Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int n1=(int)(Math.random()*10);
    int n2=(int)(Math.random()*10);
    int producto=n1*n2;
    int usuario;
    
    System.out.println("Adivine el resultado de la multiplicacion de dos numeros");
    usuario=leer.nextInt();
    while   (producto!=usuario){
        
        System.out.println("Incorrecto");
        System.out.println("Adivine el resultado de la multiplicacion de dos numeros");
        usuario=leer.nextInt();
    }
        
        System.out.println("Has adivinado");
        System.out.println("Los numeros fueron "+n1+" y "+n2);
        
        
    
    
    }
    
}
