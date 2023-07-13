/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nif;

import Entidades.NIFEntidades;
import Servicio.NIFServicio;

/**
 *
 * @author Alejandra
 */
public class NIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPORTAR CLASE SERVICIO
    NIFServicio ns=new NIFServicio();
    
    //creacion del objeto (tipo de dato nif entidades), llamando al metodo crear nif
    NIFEntidades NIF=ns.crearNIF();
    
    //MOSTRAR NIF
    ns.mostrar(NIF);
    }
    
}
