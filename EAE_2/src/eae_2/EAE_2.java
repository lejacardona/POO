/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_2;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_2 {

    /**
     * @param args the command line arguments
     */
    /**Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
//    aux=num1
//    num1=num2
//    num2=aux
    int A=1;
    int B=2;
    int C=3;
    int D=4;
    int aux;
    
    aux=B;
    B=C;
    C=A;
    A=D;
    D=aux;
    
        System.out.println("El valor de A es " + A);
        System.out.println("El valor de B es " + B);
        System.out.println("El valor de C es " + C);
        System.out.println("El valor de D es " + D);

    }
    
}
