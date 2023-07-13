/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Alejandra
 */
public class fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    Date fecha = new Date();
        System.out.println("Ingrese el dia:");
        fecha.setDate(leer.nextInt());
        System.out.println("Ingrese el mes:");
        //SE DEBE RESTAR UN MES PORQUE SI INGRESO 0 el mes sera enero
        fecha.setMonth(leer.nextInt()-1);
        System.out.println("Ingrese el anio:");
        //SE DEBE RESTAR 1900 (porque por defecto el año inicia en 1900 y se le suma el año que uno ingrese
        fecha.setYear(leer.nextInt()-1900);
    System.out.println(fecha.toString());
    Date fechaActual=new Date();
    
    int anio=fechaActual.getYear()-fecha.getYear();
        System.out.println("Hay "+anio+" años entre la fecha ingresada y la fecha actual");       

    }
    
}
