/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import Servicio.circunferenciaServicio;
import circunferenciaEntidades.entidades;

/**
 *
 * @author Alejandra
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPORTO LA CLASE CIRCUNFERENCIA SERVICIO
    circunferenciaServicio cs=new circunferenciaServicio();
    //SE CREA EL OBJETO DE TIPO ENTIDADES, Y SE USA EL METODO DE LA CLASE SERVICIO CREAR CIRCUNFERENCIA
    entidades circunferencia=cs.crearCircunferencia();
    cs.area(circunferencia);
    cs.perimetro(circunferencia);
    
    }
    
}
