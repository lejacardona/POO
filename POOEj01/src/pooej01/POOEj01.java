/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
import Persona.servicios.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in); //aqui creo una variable del tipo scanner que se llama leer a la cual le asigno el product de esto
        //CREACION DE UN OBJETO
        
        
        
        ServicioPersona sp=new ServicioPersona();
        Persona P1=sp.crearPersona();
        System.out.println(P1.toString);
        
//p1 va a ser de tipo PERSONA, A LA IZQUIERDA DEL IGUAL se declara y a la derecha se crea
//        Persona P2=new Persona(); //asi mismo se pueden crear otros objetos de tipo persona
//        P1.nombre="Alejandra";
//        P1.apellido="Cardona";
//        P1.edad=25;
//        P1.identificacion=1017259828;
//        System.out.println(P1.nombre+" "+P1.apellido+" "+P1.edad);

//Esta parte de P1 se reemplaza por la línea nueva de arriba, que es gracias al constructor
//INSTANCIAR UN OBJETO ES LLAMAR AL METODO CONSTRUCTOR
        
        
//linea 23 asigne un valor a la variable nombre, que corresponde 
//a un atributo de una persona, y en esta linea muetsro el valor de nombre
    }
    
}
