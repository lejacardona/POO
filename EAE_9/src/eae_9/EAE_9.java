/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_9;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_9 {

    /**
     * @param args the command line arguments
     */
    /**Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas

50

24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.**/
    
    public static void main(String[] args) {//aqui debo poner los paramteros que quiero llevar del subproceso
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int n1=leer.nextInt();
        int n2=leer.nextInt();
        restas(n1,n2);
        
    }
    
    public static void restas(int n1, int n2){ //para poner los parametros debo definir el tipo de dato
        int residuo=n1;
        int i=0;
        do {
            residuo = residuo - n2; //lo resta y lo resta por num2, hasta que ya no se pueda restar mas
            i = i + 1;
        } while (residuo>n2);
        System.out.println("dado que " +residuo+ " es menor que " +n2+", entonces: el residuo es " +residuo+" y el cociente es " +i);
    }
    
}
