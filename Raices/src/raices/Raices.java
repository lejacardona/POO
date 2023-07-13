/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raices;

import Entidades.raicesEntidades;
import Servicio.raicesServicio;

/**
 *
 * @author Alejandra
 */
public class Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPORTAR LA CLASE SERVICIO
    raicesServicio rs=new raicesServicio();
    //CREAR OBJETO LLAMANDO AL METODO DE CREARLO A LA CLASE SERVICIO
    raicesEntidades raiz=rs.crearRaiz();
    
    //OBTENER DISCRIMINANTE
    double discriminante=rs.getDiscriminante(raiz);
        System.out.println("El discriminante es: "+discriminante);
   
    rs.calcular(raiz);
    
    
    }
    
}
