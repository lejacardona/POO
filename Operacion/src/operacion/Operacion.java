/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import Entidades.OperacionEntidades;
import Servicio.OperacionServicio;

/**
 *
 * @author Alejandra
 */
public class Operacion {

    /**
     * @param args the command line arguments
     */
    //TUVE QUE PONER TODOS LOS DATOS TIPO FLOAT, PARA QUE SE PUDIERA HACER LA DIVISION
    public static void main(String[] args) {
     //SE LLAMA LA CLASE SERVICIO que es donde estan los METODOS
    OperacionServicio os=new OperacionServicio();
    
    //Aqui creamos un dato/objeto tipo operacionentidades para alojar los atributos de la operacion
    //primero se llama la claseservicio.metodo (es como llamar una funcion/meotodo de tipo math)
    //El primer metodo de crear operacion se debe alojar en una variable para que luego pueda ser llamado como parametro
    //en los otros metodos
    OperacionEntidades Operacion1=os.crearOperacion();
    os.sumar(Operacion1);
    os.restar(Operacion1);
    os.multiplicar(Operacion1);
    os.dividir(Operacion1);
    
    
    }
    
}
