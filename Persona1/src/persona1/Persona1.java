/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona1;

import Entidades.Persona1Entidades;
import Servicio.Persona1Servicio;

/**
 *
 * @author Alejandra
 */
public class Persona1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPORTAMOS LA CLASE SERVICIO
    Persona1Servicio ps=new Persona1Servicio();
    //CREACION DE OBJETO
    Persona1Entidades persona=ps.crearPersona();
    
    //Calcular edad
    int edad=ps.calcularEdad(persona);
        System.out.println("La edad de la persona es "+edad+" años");
    
    //Comparar con otra edad
    ps.menorQue(edad);
    
    //Mostrar persona
    ps.mostrarPersona(persona);
    }
    
}
