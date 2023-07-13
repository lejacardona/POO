/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import Entidades.VehiculoEntidades;
import Servicio.VehiculoServicio;

/**
 *
 * @author Alejandra
 */
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    VehiculoServicio vs=new VehiculoServicio();
    VehiculoEntidades vehiculo1=vs.crearVehiculo();
    VehiculoEntidades vehiculo2=vs.crearVehiculo();
    VehiculoEntidades vehiculo3=vs.crearVehiculo();
    
    
    vs.mover(vehiculo1,5);
    vs.mover(vehiculo2,5);
    vs.mover(vehiculo3,5);
        System.out.println("Tiempo 5 segundos");
    vs.mostrar(vehiculo1, vehiculo2, vehiculo3);
    
    vs.mover(vehiculo1,10);
    vs.mover(vehiculo2,10);
    vs.mover(vehiculo3,10);
    System.out.println("Tiempo 10 segundos");
    vs.mostrar(vehiculo1, vehiculo2, vehiculo3);
    
    vs.mover(vehiculo1,60);
    vs.mover(vehiculo2,60);
    vs.mover(vehiculo3,60);
    System.out.println("Tiempo 1 minuto");
    vs.mostrar(vehiculo1, vehiculo2, vehiculo3);
    
    vs.mover(vehiculo1,300);
    vs.mover(vehiculo2,300);
    vs.mover(vehiculo3,300);
   
    vs.frenar(vehiculo1);
    vs.frenar(vehiculo2);
    vs.frenar(vehiculo3);
    System.out.println("Tiempo 5 minutos");
    vs.mostrar(vehiculo1, vehiculo2, vehiculo3);
    
    
    }
    
}
