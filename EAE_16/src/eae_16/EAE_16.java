/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_16;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_16 {

    /**
     * @param args the command line arguments
     */
    /**Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.**/
    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Cuantas personas ingresara?");
        int N=leer.nextInt();        
        String [] nombres=new String [N];        
        int [] edad=new int[N];
        
        System.out.println("Ingrese los nombres de las "+N+" personas");
        for (int i = 0; i < N; i++) {            
            nombres[i]=leer.next();
        }
        
        System.out.println("Ingrese la edad de las personas en el mismo orden que ingreso los nombres");
        for (int i = 0; i < N; i++) {            
            edad[i]=leer.nextInt();
            if (edad[i]>=18) {
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("No es mayor de edad");
            }
        }
        String respuesta="si";
        
            
            for (int i = 0; i < N; i++) {
                System.out.println("Quiere mostrar la info de las personas?si/no");
                respuesta=leer.next();
                while (respuesta.equals("si")) {  
                    System.out.println(nombres[i]);
                    System.out.println(edad[i]);                 
                    break;
                }             
            }      
    }
}
