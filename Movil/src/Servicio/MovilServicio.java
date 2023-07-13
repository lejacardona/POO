/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.MovilEntidades;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class MovilServicio {
    
    //CREAR METODO DE CREACION DEL OBJETO
    public MovilEntidades cargarCelular(){
        Scanner leer=new Scanner (System.in);
        MovilEntidades celular=new MovilEntidades();
         /**marca, precio, modelo, memoriaRam, almacenamiento y codigo.**/
        System.out.println("Ingrese la marca del celular");
        celular.setMarca(leer.next());
        System.out.println("Ingrese el precio del celular");
        celular.setPrecio(leer.nextInt());
        System.out.println("Ingrese el modelo del celular");
        celular.setModelo(leer.next());
        System.out.println("Ingrese la memoria del celular");
        celular.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese el almacenamiento del celular");
        celular.setAlmacenamiento(leer.nextInt());
        
        return celular;
    }
    
    public void ingresarCodigo(MovilEntidades celular){
        Scanner leer=new Scanner (System.in);
        //FORMA DE LLENAR UN ATRIBUTO TIPO VECTOR (vector auxiliar)
        System.out.println("Ingrese numero a numero el codigo del celular");
        int [] vectorCodigo=new int [7];
        for (int i = 0; i < 7; i++) {
            vectorCodigo[i]=leer.nextInt();            
        }
        celular.setCodigo(vectorCodigo);
        
        //COMO SE IMPRIME UN VECTOR TIPO ATRIBUTO
        int [] vectorMostrar=celular.getCodigo();
        System.out.println("El codigo es: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(vectorMostrar[i]);
        }
        
    }
}
