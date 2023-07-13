/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_1;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_1 {

    /**
     * @param args the command line arguments
     */
    /**Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa los minutos");
        int min=leer.nextInt();
        int horas;
        int dias;
        int diasH;
        
        //60segundos, es 1 min, 60min, es 1 hora, 24 horas, 1 día
        dias=min/1440; //60min*24h=1dia
        diasH=dias*24;
        horas=(min/60)-diasH;//min/60, numero de horas, -24
       
        System.out.println("Los minutos ingresados son equivalentes a "+dias+" dia(s) y " + horas+"hora(s) ");
    }
    
}
