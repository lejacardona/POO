/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.RectanguloEntidades;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class RectanguloServicio {
    //PRIMER METODO
    public RectanguloEntidades crearRectangulo(){
        //INSTANCIAR UN OBJETO DE TIPO LIBRO
        RectanguloEntidades rectangulo=new RectanguloEntidades();
        Scanner leer=new Scanner (System.in).useDelimiter("\n"); //esto ultimo que se le agrega es para que si se pone un espacio no interfiera 
        //con la siguiente cadena que pregunta
        //INGRESO DE ATRIBUTOS DEL LIBRO POR EL USUARIO
        
        System.out.println("Ingrese la base del rectangulo");
        rectangulo.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        rectangulo.setAltura(leer.nextInt());
                      
        return rectangulo;
    }
    
    //SEGUNDO METODO
    public void superficie(RectanguloEntidades rectangulo){
        int superficie=rectangulo.getAltura()*rectangulo.getBase();
        System.out.println("La superficie del rectangulo es "+superficie);
    }
    
    //TERCER METODO
    public void perimetro(RectanguloEntidades rectangulo){
        int perimetro=2*(rectangulo.getAltura()+rectangulo.getBase());
        System.out.println("El perimetro del rectangulo es "+perimetro);
    }
    
    //CUARTO METODO DIBUJAR RECTANGULO CON *
    public void dibujar(RectanguloEntidades rectangulo){
    
        for (int i = 0; i < rectangulo.getAltura() ; i++) { //el fin en el for es lado (no lado-1 como en pseint), no se si funciona si le pongo <= lado
            System.out.println(" ");
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i==0 || i==rectangulo.getAltura()-1 || j==0 || j==rectangulo.getBase()-1) {
                System.out.print("* ");                             
            }else   {
                    System.out.print("  ");
                }
            }
            
        }
    }
}
