/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_6;
import java.util.Scanner;
/**
 *
 * @author Alejandra
 */
public class EA_6 {

    /**
     * @param args the command line arguments
     */
    /**Crear un programa que dado un numero determine si es par o impar.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero=leer.nextInt();
                
        if (numero % 2 == 0) {
        System.out.println("El numero es PAR");
        
        }else {
        System.out.println("El numero es IMPAR");
        
    }
    }
    
}
