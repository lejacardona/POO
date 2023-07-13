/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_17;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EA_17 {

    /**
     * @param args the command line arguments
     */
    /**Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).**/
    
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    System.out.println("Ingrese el tamaño del vector: ");
    int n=leer.nextInt();
    int [] vector=new int[n]; 
    System.out.println("Ingrese los " + n + " numeros");
        for (int i = 0; i < n; i++) {
            vector[i]=leer.nextInt();
        }     
        int digito1=0;
        int digito2=0;
        int digito3=0;
        int digito4=0;
        int digito5=0;
        int [] aux=new int[n];
        aux=vector;
        for (int i = 0; i < n; i++) {
            int contador=0;
            
            while (aux[i]>0){ //auxiliar mayor que 0, (aux esta igualado al vector)
                contador=contador+1; //cada vez que se sume es porque suma 1 digito
                aux[i]=aux[i]/10;    //divido por 10, y deja de entrar al ciclo cuando es menor que 0 o igual                             
                }
            switch (contador){
                case 1:
                    digito1++;
                break;
                case 2:
                    digito2++;
                    break;
                case 3:
                    digito3++;
                    break;
                case 4:
                    digito4++;
                    break;
                case 5:
                    digito5++;
                    break;
            }
                
            }
        System.out.println("hay " + digito1 + "numeros de 1 digitos");
        System.out.println("hay " + digito2 + "numeros de 2 digitos");
        System.out.println("hay " + digito3 + "numeros de 3 digitos");
        System.out.println("hay " + digito4 + "numeros de 4 digitos");
        System.out.println("hay " + digito5 + "numeros de 5 digitos");
}
}
            
 


