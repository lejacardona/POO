/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.CuentaEntidades;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class CuentaServicio {
    //PRIMER METODO, CREAR OBJETO
    public CuentaEntidades crearCuenta(){
        //INSTANCIAR UN OBJETO DE TIPO LIBRO
        CuentaEntidades cuenta=new CuentaEntidades();
        Scanner leer=new Scanner (System.in).useDelimiter("\n"); //esto ultimo que se le agrega es para que si se pone un espacio no interfiera 
        //con la siguiente cadena que pregunta
        //INGRESO DE ATRIBUTOS DEL LIBRO POR EL USUARIO
        
        System.out.println("Ingrese el numero de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI");
        cuenta.setDni(leer.nextInt());
        System.out.println("Ingrese el saldo");
        cuenta.setSaldo(leer.nextDouble());
        
        return cuenta;
    }
    
    /*Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.*/
    public double ingreso(CuentaEntidades cuenta){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero que depositara");
        double ingreso=leer.nextDouble();
        cuenta.setSaldo(cuenta.getSaldo()+ingreso);
        return ingreso;        
    }
    
   /* Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.*/
    public double retiro (CuentaEntidades cuenta){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero que retirara");
        double retiro=leer.nextDouble();
        cuenta.setSaldo(cuenta.getSaldo()-retiro);
        if (cuenta.getSaldo()<0) {
            cuenta.setSaldo(0);
            System.out.println("Su saldo es: "+cuenta.getSaldo());
        }
        return retiro; 
    }
    
   /* Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.*/
    
    public double extraccionRapida (CuentaEntidades cuenta){
        double extraccion=0.2*cuenta.getSaldo();
        cuenta.setSaldo(cuenta.getSaldo()-extraccion);
        System.out.println("El valor de su extraccion es "+extraccion);
        return extraccion;        
    }
    
    /*Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
    public void consultarSaldo(CuentaEntidades cuenta){
        System.out.println("El saldo disponible es: "+ cuenta.getSaldo());
    }
    
    public void consultarDatos(CuentaEntidades cuenta){
        System.out.println("Sus datos de cuenta son: ");
        System.out.println(cuenta.toString());
    }
}
