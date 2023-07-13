/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import Entidades.CuentaEntidades;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class Cuentabancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //SE IMPORTA LA CLASE SERVICIO
    CuentaServicio cs=new CuentaServicio();
    //SE LLAMA LA FUNCION DE ESA CLASE llamada crear cuenta
    //y se crea un objeto tipo cuenta (que se crea a partir de la clase entidades)
    CuentaEntidades cuenta= cs.crearCuenta();
        int opcion;
    
        do {
        System.out.println("MENU ()");
        System.out.println("1. Ingresar dinero\n"+"2.Retirar dinero");
        System.out.println("3.Extraccion rapida\n"+"4.Consultar saldo\n"+"5.Consultar datos\n"+"6.SALIR");
        System.out.println("Elija la opcion que desea ejecutar");
        Scanner leer=new Scanner(System.in);
        opcion=leer.nextInt();
                   
        switch  (opcion){
            case 1:
                cs.ingreso(cuenta);
                break;
            case 2:
                cs.retiro(cuenta);
                break;
            case 3:
                cs.extraccionRapida(cuenta);
                break;
            case 4:
                cs.consultarSaldo(cuenta);
                break;
            case 5:
                cs.consultarDatos(cuenta);
                break;
            case 6:
                break;
            
        } 
        } while (opcion!=6);
        
              
    
    }      
    
}
