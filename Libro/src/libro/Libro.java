/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;
import Entidades.LibroEntidades;
import Servicio.LibroServicio;

/**
 *
 * @author Alejandra
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRIMEO SE INSTANCIA UN OBJETO DE TIPO SERVICIO, donde vamos a alojar el retorno
    LibroServicio libroS= new LibroServicio();//llamamos al metodo libroservicio
    
    //Aqui creamos un dato/objeto tipo libroentidades para alojar los atributos del libro
    //este metodo requiere una variable para alojar el return, porque es tipo funcion
    LibroEntidades libro1=libroS.cargarLibro(); //y se llena con el metodo o funcion cargar libro (que esta alojado en libro servicio)
    //lo que hace ese metodo es preguntar la informacion al usuario
    //este METODO, no necesita una variable para alojarse porque es tipo subproceso
    libroS.mostrarLibro(libro1);
    }
    
}
