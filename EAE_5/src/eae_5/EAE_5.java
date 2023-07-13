/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_5;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_5 {

    /**
     * @param args the command line arguments
     */
    /**Una obra social tiene tres clases de socios:
-Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
-Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
-Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
-Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra=leer.nextLine();
        System.out.println("Ingrese el costo del tratamiento");
        int costo=leer.nextInt();
        float pago;
        switch (letra){
            case "A":
                pago=(float)(costo*0.5); //si voy a multiplicar por un decimal debo ponerle un (float) previo
                System.out.println("Debe pagar " + pago);                
                break;
            case "B":
                pago=(float)(costo-(costo*0.35)); //si voy a multiplicar por un decimal debo ponerle un (float) previo
                System.out.println("Debe pagar " + pago);                
                break;
            case "C":
                pago=costo; //si voy a multiplicar por un decimal debo ponerle un (float) previo
                System.out.println("Debe pagar " + pago);                
                break;
                
        }
                }
    
}
