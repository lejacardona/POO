/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

import Entidades.MatematicaEntidades;
import Servicio.MatematicaServicio;

/**
 *
 * @author Alejandra
 */
public class Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //IMPORTAR LA CLASE SERVICIO PARA USAR LOS METODOS
    MatematicaServicio ms= new MatematicaServicio();
    
    //CREACION DE OBJETO y se setteo los atributos en el main
    MatematicaEntidades math=ms.crearNumeros();
    math.setNumero1(Math.random()*10);
    math.setNumero2(Math.random()*10);
    System.out.println("El 1er numero es: "+math.getNumero1()+", El 2do numero es: "+math.getNumero2());
        
    //SEGUNDO METODO, devolver el mayor numero
    double mayor=ms.devolverMayor(math);
    System.out.println("El mayor es: "+mayor);  
    
    //TERCER METODO, elevar al numero menor
    double potencia = ms.calcularPotencia(math);
    System.out.println("El resultado de la potencia es: "+potencia);
    
    double raiz=ms.calcularRaiz(math);
        System.out.println("La raiz cuadrada del menor numero es: "+raiz);
    }
    
}
