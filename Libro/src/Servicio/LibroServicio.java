/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.LibroEntidades;
import java.util.Scanner;


/**
 *
 * @author Alejandra
 */
public class LibroServicio {
    
    //PRIMER METODO CREADO TIPO FUNCION, QUE RETORNA "UN VALOR" LOS DATOS INGRESADOS
    public LibroEntidades cargarLibro(){
        //INSTANCIAR UN OBJETO DE TIPO LIBRO
        LibroEntidades libro1=new LibroEntidades();
        
        //INGRESO DE ATRIBUTOS DEL LIBRO POR EL USUARIO
        Scanner leer=new Scanner (System.in).useDelimiter("\n"); //esto ultimo que se le agrega es para que si se pone un espacio no interfiera con la siguiente cadena que pregunta
        System.out.println("Ingrese el numero de ISBN");
        libro1.setISBN(leer.nextInt());
        System.out.println("Ingrese el titulo del libro");
        libro1.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        libro1.setAutor(leer.next());
        System.out.println("Ingrese las paginas del libro");
        libro1.setPaginas(leer.nextInt());
              
        return libro1;
    }
    
    //SEGUNDO METODO, DONDE SE MUESTRA LA INFORMACION DEL LIBRO
    public void mostrarLibro (LibroEntidades libro1){
        Scanner leer=new Scanner(System.in);
        System.out.println("La informacion del libro es:");
        System.out.println("Nombre: "+libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Paginas: " + libro1.getPaginas());
        System.out.println("ISBN: " + libro1.getISBN());
        
    }
}
