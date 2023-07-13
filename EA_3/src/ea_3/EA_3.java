/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_3;
import java.util.Scanner;
/**
 *
 * @author Alejandra
 */
public class EA_3 {

    /**
     * @param args the command line arguments
     */
    /**Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
    Java.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase=leer.nextLine();
        String mayusFrase=frase.toUpperCase();
        String minusFrase=frase.toLowerCase();
        
        System.out.println("La frase en mayusculas se ve asi " + mayusFrase);
        System.out.println("La frase en minusculas se ve asi " + minusFrase);       
    }
    
}
