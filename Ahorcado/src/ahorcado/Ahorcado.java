/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import Entidades.ahorcadoEntidades;
import Servicio.ahorcadoServicio;

/**
 *
 * @author Alejandra
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPORTAR LA CLASE SERVICIO
    ahorcadoServicio as=new ahorcadoServicio();
    
    //creacion del objeto con entidades y llamando el metodo de crear juego de la clase servicio
    ahorcadoEntidades juego= new ahorcadoEntidades();
    as.juego(juego,0);
    
    }
    
}
