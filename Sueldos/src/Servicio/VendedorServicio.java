/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
//EN ESTA CLASE SE CREAN LOS MÉTODOS
public class VendedorServicio {
    public Vendedor altaVendedor(){//va a retornar un objeto
        //instanciar un objeto de tipo vendedor
        Vendedor v1=new Vendedor();
        //lenado de atributos;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        
        System.out.println("Ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        
        System.out.println("Ingrese el dia que comenzo a trabajar");
        int dia=leer.nextInt();
        System.out.println("Ingrese el mes que comenzo a trabajar");
        int mes=leer.nextInt();
        System.out.println("Ingrese el año que comenzo a trabajar");
        int anio=leer.nextInt();
        Date fecha=new Date(anio-1900,mes-1,dia);
        v1.setFechaInicio(fecha);
        return v1;
    }
    
    public void SueldoMensual(Vendedor v1){
        //PRIMER METODO CREADO PARA CONOCER EL SUELDO MENSUAL EN UNA CLASE SERVICIO
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese las ventas totales del vendedor");
        Double ventas=leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor es "+v1.getSueldoMensual());
        
    }
    
    public void vacaciones(Vendedor v1){
        //SEGUNDO METODO PARA CALCULAR VACACIONES
        //se pasa un objeto de tipo vendedor, para realizar calculos que provengan del mismo objeto
        //primero vamos a calcular la antiguedad del vendedor
        Date hoy=new Date();
        int antiguedad=hoy.getYear()-v1.getFechaInicio().getYear();
        
        if (antiguedad<5) {
            System.out.println("Le corresponden 14 días de vacaciones");
         }else if (antiguedad<10) {
             System.out.println("Le corresponden 21 días de vacaciones");
         }else if (antiguedad<20) {
             System.out.println("Le corresponden 28 días de vacaciones");
         }else if (antiguedad>20) {
             System.out.println("Le corresponden 35 días de vacaciones");                       
        }else   {
             System.out.println("El empleado tiene vacaciones proporcionales");
         }
    }
}
