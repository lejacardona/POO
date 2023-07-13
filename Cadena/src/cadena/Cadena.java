/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import Entidades.CadenaEntidades;
import Servicio.CadenaServicio;

/**
 *
 * @author Alejandra
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPORTAR LA CLASE SERVICIO PARA USAR LOS METODOS
    CadenaServicio cs=new CadenaServicio();
    
    //CREACION DEL OBJETO
    CadenaEntidades cadena= cs.crearFrase();
    
    //PRIMER METODO contar vocales
    int vocales=cs.mostrarVocales(cadena);
    System.out.println("La frase tiene "+vocales+" vocales");
    
    //SEGUNDO METODO invertir frase
    cs.invertirFrase(cadena);
    
    //TERCER METODO contar una letra en la frase (ingresada por el usuario
    int vecesLetra=cs.vecesRepetido(cadena);
    System.out.println("La letra ingresada se repite "+vecesLetra+" veces");
    
    //CUARTO METODO comparar la longitud de las dos frases
    cs.compararLongitud(cadena);
    
    //QUINTO METODO concatenar 2 frases
    cs.unirFrases(cadena);
    
    //SEXTO METODO reemplazar
    cs.reemplazar(cadena);
    
    //SEPTIMO METODO contiene
    cs.contiene(cadena);
    }
    
}
