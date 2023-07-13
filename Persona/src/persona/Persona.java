/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import Entidades.PersonaEntidades;
import Servicio.PersonaServicio;

/**
 *
 * @author Alejandra
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPORTAR LA CLASE SERVICIO
    PersonaServicio ps=new PersonaServicio();
    //CREAR 4 OBJETOs tipo PERSONA
    
    //el tipo de dato que estara en el vector será tipo Persona
    PersonaEntidades [] vectorPersona=new PersonaEntidades[4]; 
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese la info de la persona "+ (i+1));
            vectorPersona[i]=ps.crearPersona();
        }
        
    //el tipo de dato que estara en el vector será tipo entero que es el que arroja el metodo calcular IMC (-1,0, o 1  
    int [] vectorIMC = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("¿PESO IDEAL O NO? para la persona "+ (i+1));
            vectorIMC[i]=ps.calcularIMC(vectorPersona[i]);
        }
        
        int imc20=0;
        int imcMedio=0;
        int imc25=0;
        for (int i = 0; i < 4; i++) {
            switch  (vectorIMC[i]){
                case -1:
                    imc20++;
                    break;
                case 0:
                    imcMedio++;
                    break;
                case 1:
                    imc25++;
                    break;                    
            }
        }    
        int imc20P=(imc20/4)*100;
        int imcMedioP=(imcMedio/4)*100;
        int imc25P=(imc25/4)*100;
                
        System.out.println("Hay "+ imc20P+"% de personas por debajo de su peso");
        System.out.println("Hay "+ imcMedioP+"% de personas en su peso ideal");
        System.out.println("Hay "+ imc25P+"% de personas por encima de su peso");
        
        
    
    //El tipo de dato que arrojara es Mayor de edad es tipo boolean
    boolean [] vectorMayor=new boolean[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("¿ES MAYOR DE EDAD? la persona "+ (i+1));
            vectorMayor[i]=ps.esMayorDeEdad(vectorPersona[i]);
        }
        int menor=0;
        int mayor=0;
        for (int i = 0; i < 4; i++) {
           if (vectorMayor[i]) {
            mayor++;            
        } else {
            menor++;
        } 
        }
        
        int mayorP=(mayor/4)*100;
        int menorP=(menor/4)*100;
        System.out.println("Hay "+mayorP+"% de personas mayores");
        System.out.println("Hay "+menorP+"% de personas menores");
        
    
    }
    
/*Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/
    
}
