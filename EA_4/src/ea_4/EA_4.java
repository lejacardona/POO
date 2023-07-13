/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_4;
import java.util.Scanner;
/**
 *
 * @author Alejandra
 */
public class EA_4 {

    /**
     * @param args the command line arguments
     */
    /**Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la temperatura actual en grados Centigrados");
        double gradosC=leer.nextDouble();
        double gradosF=32+(9*gradosC/5);
        System.out.println("La temperatura en Fahrenheit es: " + gradosF);
    }
    
}
