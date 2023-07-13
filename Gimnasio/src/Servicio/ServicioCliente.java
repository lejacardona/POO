/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cliente;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class ServicioCliente {
    
    public Cliente registrarCliente(){
        Scanner leer=new Scanner(System.in);
        Cliente cliente =new Cliente();
        System.out.println("Ingresa el ID del cliente");
        cliente.setID(leer.nextInt());
        System.out.println("Ingresa el nombre del cliente");
        cliente.setNombre(leer.next());
        System.out.println("Ingresa la edad del cliente");
        cliente.setEdad(leer.nextInt());
        System.out.println("Ingresa la altura del cliente");
        cliente.setAltura(leer.nextDouble());
        System.out.println("Ingresa el peso del cliente");
        cliente.setPeso(leer.nextDouble());
        System.out.println("Ingresa el objetivo del cliente");
        cliente.setObjetivo(leer.next());   
        
        
        return cliente;
    }
    
    public void obtenerClientes(List <Cliente> ListaClientes){
        //PARA UTILIZAR EL FOREACH DEBEMOS PONER LA LISTA COMO PARAMETRO Y LLAMARLA COMO CUANDO SE DECLARA
        for (Cliente cliente:ListaClientes) {
            System.out.println(cliente.toString());
        }
              
    }
    
    /**actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo):
     * recibe el identificador de un cliente existente y los nuevos datos del cliente, y actualiza la
     * información correspondiente en el sistema.**/
    public void actualizarCliente(List <Cliente> ListaClientes){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el ID del cliente que quiere actualizar");
        int ID=leer.nextInt();
        boolean existeID=false;
        for (Cliente cliente:ListaClientes) {
            if (cliente.getID()==ID) {
                System.out.println("INGRESE LOS NUEVOS DATOS");
                System.out.println("Ingresa el nombre del cliente");
                cliente.setNombre(leer.next());
                System.out.println("Ingresa la edad del cliente");
                cliente.setEdad(leer.nextInt());
                System.out.println("Ingresa la altura del cliente");
                cliente.setAltura(leer.nextDouble());
                System.out.println("Ingresa el peso del cliente");
                cliente.setPeso(leer.nextDouble());
                System.out.println("Ingresa el objetivo del cliente");
                cliente.setObjetivo(leer.next());
                existeID=true;
                break;
        }
    } 
        if (!existeID) {
            System.out.println("El ID ingresado NO EXISTE");
        }
}
    
    public void eliminarCliente(List <Cliente> ListaClientes){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el ID del cliente que quiere eliminar");
        int ID=leer.nextInt();
        boolean existeID=false;
        String respuesta="";
        //"cliente" es la variable de iteracion (como si fuera la i)
        for (Cliente cliente:ListaClientes){
            if (cliente.getID()==ID){
                System.out.println("¿Estas seguro que deseas eliminar el cliente?");
                respuesta=leer.next();
                if (respuesta.equals("si")) {
                    ListaClientes.remove(cliente);                                     
                }else{
                    System.out.println("El cliente permanece en la lista");
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
