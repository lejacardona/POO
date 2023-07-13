/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.puntosEntidades;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class puntosServicio {
    //PRIMER METODO crearPuntos (creacion del objeto, importando la clase entidades donde se alojan los atributos)
    public puntosEntidades crearPuntos(){
        Scanner leer=new Scanner (System.in);
        puntosEntidades puntos=new puntosEntidades();
        System.out.println("Ingrese las coordenadas del 1er punto(x1,y1):");
        puntos.setX1(leer.nextInt());
        puntos.setY1(leer.nextInt());
        System.out.println("Ingrese las coordenadas del 2do punto(x2,y2):");
        puntos.setX2(leer.nextInt());
        puntos.setY2(leer.nextInt());
        return puntos;
    }
    
    public void calcularDistancia(puntosEntidades puntos){
        double distancia=Math.sqrt(Math.pow(puntos.getX2()-puntos.getX1(),2)+Math.pow(puntos.getY2()-puntos.getY1(),2));
        System.out.println("La distancia entre los dos puntos es: "+distancia);
    }
}
