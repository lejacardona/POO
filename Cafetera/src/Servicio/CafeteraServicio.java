/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.CafeteraEntidades;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */


public class CafeteraServicio {
    //PRIMER METODO
    public CafeteraEntidades llenarCafetera(){
        Scanner leer=new Scanner (System.in);
        CafeteraEntidades cafetera=new CafeteraEntidades();
        System.out.println("Ingrese la capacidad de la cafetera");
        cafetera.setCapacidadMaxima(leer.nextInt());
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        return cafetera;
    }
    
    //SEGUNDO METODO
    public void servirTaza(CafeteraEntidades cafetera){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el tamaño de su taza (en ml):");
        int taza=leer.nextInt();
        //creare esta variable para guardar la cantidad de cafe que hay en la cafetera antes de servir
        int cantidad=cafetera.getCantidadActual();
                //Aqui sirvo el cafe de la cafetera en la taza
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima()-taza);
        
        if (cafetera.getCantidadActual()<0) {
            System.out.println("No se alcanzo a llenar la taza. Se lleno "+cantidad);
            
        } else{
            System.out.println("Se lleno la taza. Y queda "+cafetera.getCantidadActual()+" ml de cafe");
            
        }
    }
    
    public void vaciarCafetera(CafeteraEntidades cafetera){
        cafetera.setCantidadActual(0);
        System.out.println("La cantidad de cafe que queda "+cafetera.getCantidadActual());
    }
    
    public void agregarCafe(CafeteraEntidades cafetera){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese la cantidad de cafe que desea agregar");
        cafetera.setCantidadActual(cafetera.getCantidadActual()+leer.nextInt());
        System.out.println("La cantidad de cafe que hay es "+cafetera.getCantidadActual());
        
    }
    
}
