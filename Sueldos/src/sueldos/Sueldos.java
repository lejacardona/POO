/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;

import Entidades.Vendedor;
import Servicio.VendedorServicio;

/**
 *
 * @author Alejandra
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    VendedorServicio vs=new VendedorServicio(); //LO PRIMERO QUE HAREMOS ES INSTANCIAR UN OBJETO DE TIPO SERVICIO PARA ACCEDER
    //INSTANCIACION DEL OBJETO donde quiero alojar el retorno de lo que construimos en la clase de servicios, con sus atributos llenos
    //objeto se aloja en el main para poder retonrar un objeto vendedor (del metodo altavendedor)cons ust atributos llenos, ese objeto lo alojamos en el main para luego pasarlo como parametro y llamar los otros metodos
    Vendedor v1=vs.altaVendedor();
    vs.SueldoMensual(v1);
    vs.vacaciones(v1);
    
    }
    
}
