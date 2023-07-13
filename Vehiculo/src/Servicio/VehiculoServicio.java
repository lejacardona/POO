/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.VehiculoEntidades;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
/**Un automóvil avanza 3 metros por segundo.
Una motocicleta avanza 2 metros por segundo.
Una bicicleta avanza 1 metro por segundo.]**/
public class VehiculoServicio {
    
    public VehiculoEntidades crearVehiculo(){
        Scanner leer=new Scanner (System.in);
        VehiculoEntidades vehiculo=new VehiculoEntidades();
        System.out.println("Seleccione el tipo de vehiculo");
        System.out.println("1. Automovil\n"+"2.Motocicleta\n"+"3.Bicicleta");
        switch  (leer.nextInt()){
            case 1:
                vehiculo.setTipo("Automovil");
                break;
            case 2:
                vehiculo.setTipo("Motocicleta");
                break;
            case 3:
                vehiculo.setTipo("Bicicleta");
                break;
                
            default:
                System.out.println("Opcion no valida");
        }
        
        System.out.println("Ingrese la marca del vehiculo");
        vehiculo.setMarca(leer.next());
        System.out.println("Ingrese el modelo del vehiculo");
        vehiculo.setModelo(leer.next());
        System.out.println("Ingrese el anio del vehiculo");
        vehiculo.setAnio(leer.nextInt());
        return vehiculo;
    }
    
    public VehiculoEntidades mover(VehiculoEntidades vehiculo, int tiempo){            
        
        switch (vehiculo.getTipo()){
            case "Automovil":
                vehiculo.setDistancia(3*tiempo);
                break;
            case "Motocicleta":
                vehiculo.setDistancia(2*tiempo);
                break;
            case "Bicicleta":
                vehiculo.setDistancia(1*tiempo);
                break;                
        }
        return vehiculo;
    }
    
    public VehiculoEntidades frenar(VehiculoEntidades vehiculo){
        int distancia1=vehiculo.getDistancia();
        switch (vehiculo.getTipo()){
            case "Automovil":
                
            case "Motocicleta":
                vehiculo.setDistancia(distancia1+2);
                break;             
        
    }

//OTRA FORMA DE HACERLO        
//        if (vehiculo.getTipo()!="Bicicleta"){
//            vehiculo.setDistancia(distancia1+2);
//        }
        return vehiculo;
}
    //OTRA FORMA DE HACERLO
//    public void mostrar(VehiculoEntidades vehiculo1, VehiculoEntidades vehiculo2, VehiculoEntidades vehiculo3){
//        System.out.println("La distancia recorrida por el vehiculo 1 es: "+vehiculo1.getDistancia());
//        System.out.println("La distancia recorrida por el vehiculo 2 es: "+vehiculo2.getDistancia());
//        System.out.println("La distancia recorrida por el vehiculo 2 es: "+vehiculo3.getDistancia());
//    }
    //UNA FORMA DE HACER EL MOSTRAR, PERO CON UN FOR, Y UN TIPO DE DATO TIPO ARRAY/VECTOR, PARA ELEGIR EL NUMERO DE VEHICULOS QUE QUEREMOS MOSTRAR
    public void mostrar(VehiculoEntidades... vehiculos){
        for (VehiculoEntidades vehiculo : vehiculos)
        {
            System.out.println("La distancia recorrida por el vehiculo 1 es: "+vehiculo.getDistancia());
        }
    }
}
