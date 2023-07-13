/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import Entidades.FiguraEntidad;
import Servicio.Servicio;

/**
 *
 * @author nohav
 */
public class FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio sv = new Servicio();
        FiguraEntidad figura  = sv.crearFigura();
        sv.MostrarResultados(figura);
    }
    
}
