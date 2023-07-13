/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_14;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EA_14 {

    /**
     * @param args the command line arguments
     */
    /**Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingrese la cantidad de euros: ");
    float euros=leer.nextFloat();
        System.out.println("¿A qué moneda desea convertirla?");
        System.out.println("1. Dolares\n"+"2.Yenes\n"+"3.Libras");
    int moneda=leer.nextInt();
    
    float retorno=cambioDivisas(euros,moneda);
        System.out.println("El cambio de divisas es " + retorno);
    }
    
    
    public static float cambioDivisas(float euros, int moneda){
        float cambio = 0;
        
        switch(moneda){
            case 1:            
            cambio = (float) (euros*1.28611);                
            break;
            case 2:
            cambio= (float) (euros*129.852);
            break;
            case 3:
            cambio= (float) (euros*0.86);                    
                        
        }
        return cambio;
    }
    
}
