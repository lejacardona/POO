/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio;

import Entidades.Cliente;
import Entidades.Rutina;
import Servicio.ServicioCliente;
import Servicio.ServicioRutina;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class Gimnasio {

    /**
     * @param args the command line arguments
     */
    /**
     *
     * Realiza una actualización en uno de los clientes existentes y muestra la
     * lista de clientes actualizada. Realiza una actualización en una de las
     * rutinas existentes y muestra la lista de rutinas actualizada. Elimina uno
     * de los clientes existentes y muestra la lista de clientes final. Elimina
     * una de las rutinas existentes y muestra la lista de rutinas final.*
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Creacion e inicializacion de la lista de clientes
        List<Cliente> ListaClientes = new ArrayList<Cliente>();
        List<Rutina> ListaRutinas = new ArrayList<Rutina>();

        //IMPORTAR CLASE SERVICIO
        ServicioCliente sc = new ServicioCliente();

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el cliente " + (i + 1));
            ListaClientes.add(sc.registrarCliente());
        }

        //IMPORTAR CLASE SERVICIO
        ServicioRutina sr = new ServicioRutina();
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese la rutina " + (i + 1));
            ListaRutinas.add(sr.crearRutina());
        }
        int opcion;
        do {
            System.out.println("Elija la opcion del MENU que desee ejecutar:");
            System.out.println("1. Mostrar clientes");
            System.out.println("2. Mostrar rutinas");
            System.out.println("3. Actualizar clientes");
            System.out.println("4. Actualizar rutinas");
            System.out.println("5. Eliminar clientes");
            System.out.println("6. Eliminar rutinas");
            System.out.println("7. SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    //MUESTRA CADA CLIENTE
                    System.out.println("CLIENTES");
                    sc.obtenerClientes(ListaClientes);
                    break;
                case 2:
                    //MUESTRA CADA RUTINA
                    System.out.println("RUTINAS");
                    sr.obtenerRutinas(ListaRutinas);
                    break;
                case 3:
                    System.out.println("ACTUALIZACION DE CLIENTES");
                    sc.actualizarCliente(ListaClientes);
                    sc.obtenerClientes(ListaClientes);
                    break;
                case 4:
                    System.out.println("ACTUALIZACION DE RUTINAS");
                    sr.actualizarRutina(ListaRutinas);
                    sr.obtenerRutinas(ListaRutinas);
                    break;
                case 5:
                    System.out.println("ELIMINACION DE CLIENTES");
                    sc.eliminarCliente(ListaClientes);
                    sc.obtenerClientes(ListaClientes);
                    break;
                case 6:
                    System.out.println("ELIMINACION DE RUTINAS");
                    sr.eliminarRutina(ListaRutinas);
                    sr.obtenerRutinas(ListaRutinas);
                    break;
                case 7:
                    System.out.println("Bye.¡Vuelve pronto!");
                    break;
                default:
                    System.out.println("El numero ingresado NO esta en las opciones");
            }
        } while (opcion != 7);

    }

}
