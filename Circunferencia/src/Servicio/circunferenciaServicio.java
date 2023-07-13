/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import circunferenciaEntidades.entidades;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class circunferenciaServicio {
    
    //METODO DONDE SE CREA EL OBJETO CIRCUNFERENCIA Y EL RETURN ES CIRCUNFERENCIA PORQUE EL ATRIBUTO QUE TIENE ES RADIO Y ESE ES EL QUE ESTAMOS INGRESANDO
    //el tipo de dato es entidades (atributo, radio)
    public entidades crearCircunferencia(){
    Scanner leer=new Scanner(System.in);
   
    //CREA EL OBJETO CIRCUNFERENCIA A PARTIR DE ENTIDADES (donde estan los atributos)
    entidades circunferencia=new entidades();
        System.out.println("Ingrese el radio");
        circunferencia.setRadio(leer.nextDouble());   
        
        return circunferencia;
    }
    
    //En este metodo el tipo de dato es double, no tengo necesidad de ponerlo como entidades porque no lo estableci como un atributo del objeto 
    public double area(entidades circunferencia){
        double area=Math.PI*Math.pow(circunferencia.getRadio(), 2);
        System.out.println("El area de la circunferencia es: "+area);
        return area;
    }
    
    public double perimetro(entidades circunferencia){
        double perimetro=2*Math.PI*circunferencia.getRadio();
        System.out.println("El perimetro de la circunferencia es: "+perimetro);
        return perimetro;
    }
}
