/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import Entidades.RectanguloEntidades;
import Servicio.RectanguloServicio;

/**
 *
 * @author Alejandra
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //SE IMPORTA LA CLASE SERVICIO
    RectanguloServicio rs=new RectanguloServicio();
    //SE LLAMA LA FUNCION DE ESA CLASE llamada crear Rectangulo
    RectanguloEntidades rectangulo=rs.crearRectangulo();
    
    //llamar METODOS tipo subproceso para Mostrar superficie y perimetro (no necesita una variable porque no tiene return para ser alojado
    rs.perimetro(rectangulo);
    rs.superficie(rectangulo);
    rs.dibujar(rectangulo);
    }
    
}
