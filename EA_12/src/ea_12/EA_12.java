/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_12;

import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EA_12 {

    /**
     * @param args the command line arguments
     */
    /**Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().**/
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    String cadena;
    int correcto=0;
    int incorrectas=0;
    int longitud;
    
        do {
            System.out.println("Ingrese una cadena");
            cadena=leer.nextLine();
            longitud=cadena.length();
            correcto=0;
            incorrectas=0;
    if (cadena.length()==5 & cadena.startsWith("X", 0) &cadena.endsWith("O")){
        
        correcto=correcto+1;
    }else{
        incorrectas=incorrectas+1;
    }
    
        
            System.out.println("CORRECTOS "+correcto);
            System.out.println("INCORRECTAS "+incorrectas);
        } while (!cadena.equals("&&&&&"));
        
        
    
    
    
    }
    
}
