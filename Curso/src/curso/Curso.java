/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

import Entidades.CursoEntidades;
import Servicio.CursoServicio;

/**
 *
 * @author Alejandra
 */
public class Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPORTAR CLASE SERVICIO
    CursoServicio cs=new CursoServicio();
    
    //CREACION DEL OBJETO, llamando el metodo crear curso de la clase servicio
    CursoEntidades curso=cs.crearCurso();
    
    cs.calcularGananciaSemanal(curso);
    }
    
}
