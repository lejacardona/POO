/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movil;

import Entidades.MovilEntidades;
import Servicio.MovilServicio;

/**
 *
 * @author Alejandra
 */
public class Movil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPORTAR CLASE SERVICIO
    MovilServicio ms=new MovilServicio();
    
    //creacion del objeto
    MovilEntidades movil=ms.cargarCelular();
    
    //ingresar codigo
    ms.ingresarCodigo(movil);
    }
    
}
