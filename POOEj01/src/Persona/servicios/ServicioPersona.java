/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona.servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class ServicioPersona {
    private Scanner leer=new Scanner(System.in);
    public Persona crearPersona(){
//crearemos una funcion en esta clase servicio, y se importa entidad persona
        System.out.println("Introducir nombre");
        String nombre=leer.next();
        System.out.println("Introducir apellido");
        String apellido=leer.next();
        System.out.println("Introducir edad");
        int edad=leer.nextInt();
//        Persona P=new Persona(nombre, apellido, 0); //NO NECESITAMOS QUE EXISTA UNA VARIABLE P
        
        return new Persona(nombre, apellido, 0); //DEVUELVO EL NACIMIENTO DE UNA PERSONA QUE VA A TENER TALES CARACTERISTICAS
    }
}
