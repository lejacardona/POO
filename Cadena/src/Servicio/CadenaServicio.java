/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.CadenaEntidades;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class CadenaServicio {
    
    //PRIMER METODO DE CREACION DE OBJETO
    public CadenaEntidades crearFrase(){      
      
    Scanner leer=new Scanner (System.in).useDelimiter("\n");
    //CREAR OBJETO DE TIPO PERSONA DESDE LA CLASE ENTIDADES (donde a su vez se importan los atributos)
    CadenaEntidades cadena=new CadenaEntidades(); 
        System.out.println("Ingrese una frase");
        cadena.setFrase(leer.next());
        cadena.setLongitud(cadena.getFrase().length());
//        System.out.println(cadena.getLongitud());
        return cadena;
        }
    
    public int mostrarVocales(CadenaEntidades cadena){
        int contadorVocales=0;
        String vocales="aeiou";
        for (int i = 0; i < cadena.getLongitud(); i++) {
          //los subindices del substring (i,i+1), es como si evaluara la posicion de una letra dentro de una casillita
          String letra=cadena.getFrase().substring(i,i+1);
          //System.out.println(letra);
          
          //Evalua si esta letra esta dentro de vocales (aeiou/cadena)
            if (vocales.contains(letra)) {
                contadorVocales++;
            } 
        }        
        return contadorVocales;
    }
    
    public void invertirFrase(CadenaEntidades cadena){
        String nuevaFrase="";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            nuevaFrase=cadena.getFrase().substring(i,i+1).concat(nuevaFrase);            
        }
        System.out.println("La frase invertida se ve asi: "+nuevaFrase);
    }
    
    public int vecesRepetido(CadenaEntidades cadena){
        Scanner leer=new Scanner (System.in).useDelimiter("\n");
        int contadorLetra=0;
        System.out.println("Ingrese una letra:");
        String letra=leer.next();
        for (int i = 0; i < cadena.getLongitud(); i++) {
          //los subindices del substring (i,i+1), es como si evaluara la posicion de una letra dentro de una casillita
          String letraFrase=cadena.getFrase().substring(i,i+1);
          //System.out.println(letra);
          
          //Evalua si la letra de la frase esta dentro de la letra ingresada por el usuario
            if (letra.contains(letraFrase)) {
                contadorLetra++;
            } 
        }        
        return contadorLetra;
    }
    
    public void compararLongitud(CadenaEntidades cadena){
        Scanner leer=new Scanner (System.in).useDelimiter("\n");
        cadena.getLongitud();
        System.out.println("Ingrese otra frase");
        String frase2=leer.next();
        int longitud2=frase2.length();
        
        if (cadena.getLongitud()==longitud2) {
            System.out.println("Las longitudes de las 2 frases son iguales");
        }else   {
            System.out.println("Las frases no tienen la misma longitud");
        }
    }
    
    public void unirFrases (CadenaEntidades cadena){
        Scanner leer=new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese otra frase");
        String frase2=leer.next();
        String frase3=cadena.getFrase().concat(frase2);
        System.out.println("Las frases unidas se ven asi: "+frase3);
    }
    
    public void reemplazar (CadenaEntidades cadena){
        System.out.println("Ingrese el caracter por el que va a reemplazar la a");
        Scanner leer=new Scanner (System.in).useDelimiter("\n");
        String caracter=leer.next();
        //USAMOS REPLACE
        String frase=cadena.getFrase().replace("a", caracter);
        System.out.println(frase);
    }
    
    public void contiene (CadenaEntidades cadena){
        Scanner leer=new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese la letra que desea buscar en la frase");
        String letra=leer.next();
        boolean contiene=cadena.getFrase().contains(letra);
        System.out.println("¿encontro la letra en la frase? "+contiene);
    }
}
