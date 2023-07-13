/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cliente;
import Entidades.Rutina;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class ServicioRutina {
     public Rutina crearRutina(){
        Scanner leer=new Scanner(System.in);
        Rutina rutina =new Rutina();
        System.out.println("Ingresa el ID de la rutina");
        rutina.setID(leer.nextInt());
        System.out.println("Ingresa el nombre de la rutina");
        rutina.setNombre(leer.next());
        System.out.println("Ingresa la duracion de la rutina");
        rutina.setDuracion(leer.nextInt());
        System.out.println("Ingresa el nivel de dificultad");
        rutina.setNivelDificultad(leer.nextInt());
        System.out.println("Ingresa la descripcion");
        rutina.setDescripcion(leer.next());       
        
        return rutina;
    }
    
    public void obtenerRutinas(List <Rutina> ListaRutinas){
        //PARA UTILIZAR EL FOREACH DEBEMOS PONER LA LISTA COMO PARAMETRO Y LLAMARLA COMO CUANDO SE DECLARA
        for (Rutina rutina:ListaRutinas) {
            System.out.println(rutina.toString());
        }
              
    }
    
    /**actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo):
     * recibe el identificador de un cliente existente y los nuevos datos del cliente, y actualiza la
     * información correspondiente en el sistema.**/
    public void actualizarRutina(List <Rutina> ListaRutinas){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el ID de la rutina que quiere actualizar");
        int ID=leer.nextInt();
        boolean existeID=false;
        for (Rutina rutina:ListaRutinas) {
            if (rutina.getID()==ID) {
                System.out.println("INGRESE LOS NUEVOS DATOS");
                System.out.println("Ingresa el nombre de la rutina");
                rutina.setNombre(leer.next());
                System.out.println("Ingresa la duracion de la rutina");
                rutina.setDuracion(leer.nextInt());
                System.out.println("Ingresa el nivel de dificultad");
                rutina.setNivelDificultad(leer.nextInt());
                System.out.println("Ingresa la descripcion");
                rutina.setDescripcion(leer.next());  
                existeID=true;
                break;
        }
    } 
        if (!existeID) {
            System.out.println("El ID ingresado NO EXISTE");
        }
}
    
    public void eliminarRutina(List <Rutina> ListaRutinas){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el ID de la rutina que quiere eliminar");
        int ID=leer.nextInt();
        boolean existeID=false;
        String respuesta="";
        //"cliente" es la variable de iteracion (como si fuera la i)
        for (Rutina rutina:ListaRutinas){
            if (rutina.getID()==ID){
                System.out.println("¿Estas seguro que deseas eliminar la rutina?");
                respuesta=leer.next();
                if (respuesta.equals("si")) {
                    ListaRutinas.remove(rutina);
                                     
                }else{
                    System.out.println("La rutina permanece en la lista");
                } 
                existeID=true;   
                break;
            }
        }
        if (!existeID) {
            System.out.println("El ID ingresado no existe");
        }
    }
}
