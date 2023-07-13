/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;
import java.util.Scanner;
/**
 *
 * @author Alejandra
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los nombres de las personas de su equipo");
    String[] equipo =new String[8];
    
        for (int i = 0; i < 8; i++) {
            equipo[i]=leer.nextLine();
            
        }
    
    }
    
}
