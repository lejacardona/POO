/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

import Entidades.CafeteraEntidades;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class Cafetera {

    /**
     * @param args the command line arguments
     */
    /*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
    public static void main(String[] args) {
    //PRIMERO IMPORTAMOS LA CLASE SERVICIO
    CafeteraServicio cs=new CafeteraServicio();
    //se CREA EL OBJETO cafetera a partir de clase entidades y se llama una funcion/metodo de la clase servicio
    CafeteraEntidades cafetera=cs.llenarCafetera();
    
    //CREAR MENU PARA LLAMAR METODOS
    int opcion;
        do {
        System.out.println("MENU ()");
        System.out.println("1.Llenar cafetera\n"+ "2.Servir Taza");
        System.out.println("3.Vaciar Cafetera\n"+"4.Agregar Cafe\n"+"5.SALIR");
        System.out.println("Elija la opcion que desea ejecutar");
        Scanner leer=new Scanner(System.in);
        opcion=leer.nextInt();
                   
        switch  (opcion){
            case 1:
                cs.llenarCafetera();
                break;
            case 2:
                cs.servirTaza(cafetera);
                break;
            case 3:
                cs.vaciarCafetera(cafetera);
                break;
            case 4:
                cs.agregarCafe(cafetera);
                break;
            case 5:            
                break;
            
        }  
        } while (opcion!=5);
        
   
    }
    
}
