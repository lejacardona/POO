/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.PersonaEntidades;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class PersonaServicio {

    public PersonaEntidades crearPersona(){        
        Scanner leer=new Scanner (System.in);
        //CREAR OBJETO DE TIPO PERSONA DESDE LA CLASE ENTIDADES
        PersonaEntidades persona=new PersonaEntidades();
        
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona");
        persona.setEdad(leer.nextInt());             
        System.out.println("Ingrese el sexo de la persona:'H' hombre, 'M' mujer, 'O' otro");
        persona.setSexo(leer.next());  
        System.out.println("Ingrese el peso de la persona");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona");
        persona.setAltura(leer.nextDouble());
    return persona;
    }
    
    public int calcularIMC(PersonaEntidades persona){
        double IMC=persona.getPeso()/(Math.pow(persona.getAltura(), 2));
        int answer=0;
        
        if (IMC<20) {
            System.out.println("La persona esta por debajo de su peso ideal");
            answer=-1;
            
        }else if (answer>=20 & answer<=25) {
            System.out.println("La persona está en su peso ideal");
            answer=0;
            
        }else if (answer>25) {
            System.out.println("La persona tiene sobrepeso");
            answer=1;
            
            
        }   
        return answer;        
    }   
    
   /* Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
    public boolean esMayorDeEdad(PersonaEntidades persona){
        boolean mayor;
        
        if (persona.getEdad()<18) {
            mayor=false;
            System.out.println(mayor);
                       
        }else   {
            mayor=true;
            System.out.println(mayor);
            
        }
        
        
        return mayor;
    }
    
    
}
