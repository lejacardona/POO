/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntos;

import Entidades.puntosEntidades;
import Servicio.puntosServicio;

/**
 *
 * @author Alejandra
 */
public class Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPORTAMOS LA CLASE SERVICIO
    puntosServicio ps=new puntosServicio();
    //CREAMOS el tipo de dato (objeto) y llamamos el metodo para crearlo
    puntosEntidades puntos=ps.crearPuntos();
    
    //LLamada de la funcion calcularDistancia
    ps.calcularDistancia(puntos);
    }
    
}
