/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona1Entidades;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Alejandra
 */
public class Persona1Servicio {
//LO IDEAL ES QUE EL PRIMER METODO QUE ES EL DE LA CREACION DE OBJETO
    //Se cree como tipo funcion que retorne el objeto (o la variable donde esta creado el objeto/tipo de dato persona)
public Persona1Entidades crearPersona(){
    Scanner leer=new Scanner(System.in);
    Persona1Entidades persona=new Persona1Entidades();
    System.out.println("Ingrese el nombre de la persona");
    persona.setNombre(leer.next());
    System.out.println("Ingrese la fecha de nacimiento de la persona");
    System.out.println("Dia:");
    int dia=leer.nextInt();
    System.out.println("Mes");
    int mes=leer.nextInt();
    System.out.println("Año");
    int anio=leer.nextInt();
    
    //FORMA DE SETEAR LA FECHA
    Date fecha=new Date(anio-1900,mes-1,dia);
    persona.setFecha(fecha);
    return persona;
}

/**Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.**/

public int calcularEdad(Persona1Entidades persona){
    //FORMA DE OBTENER EL AÑO DE LA FECHA (TIPO DATE)
    int edad=2023-persona.getFecha().getYear()-1900;    
    return edad;
}

/**Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.**/

public void menorQue(int edad){
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingrese una edad: ");
    int edad1=leer.nextInt();
    boolean menorQue=edad<edad1;
    if (menorQue) {
        System.out.println("¿La persona ingresada es menor a la ultima edad de la persona ingresada? "+menorQue);
    }else{
        System.out.println("¿La persona ingresada es menor a la ultima edad de la persona ingresada? "+menorQue);
    }
  }

/**Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.**/
    public void mostrarPersona(Persona1Entidades persona){
        System.out.println(persona.toString());
    }
}
