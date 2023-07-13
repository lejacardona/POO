/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesesdelanio;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class MesesdelAnio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
    String [] meses=new String [12];
    meses[0]="enero";
    meses[1]="febrero";
    meses[2]="marzo";
    meses[3]="abril";
    meses[4]="mayo";
    meses[5]="junio";
    meses[6]="julio";
    meses[7]="agosto";
    meses[8]="septiembre";
    meses[9]="octubre";
    meses[10]="noviembre";
    meses[11]="diciembre";
    
    String mesSecreto=meses[4];
    
    /**El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!**/
    System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
    String mesUsuario=leer.next();
    boolean adivino=mesUsuario.equals(mesSecreto);    
    
        do {
        if (mesUsuario.equals(mesSecreto)) {
        System.out.println("¡Ha acertado!");
        break; //NO ENTIENDO PORQUE AQUI SE HACE UN BUCLE INFINITO ¿?
        } else {
        System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
        mesUsuario=leer.next();
        }
        } while (!adivino);
        
    
    
    }
    
}
