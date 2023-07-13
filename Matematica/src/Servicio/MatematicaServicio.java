/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidades.MatematicaEntidades;
/**
 *
 * @author Alejandra
 */
public class MatematicaServicio {
    //PRIMER METODO DE CREACION DE OBJETO con atributos 2 numeros reales
    public MatematicaEntidades crearNumeros(){
    MatematicaEntidades math=new MatematicaEntidades();    
    return math;
    }
    
    public double devolverMayor(MatematicaEntidades math){
        double mayor=0;
        double menor=0;
        if (math.getNumero1()<math.getNumero2()) {
            mayor=math.getNumero2();
            menor=math.getNumero1();
            math.setNumero1(mayor);
            math.setNumero2(menor);
        }else  {
            mayor=math.getNumero1();
            menor=math.getNumero2();
            math.setNumero1(mayor);
            math.setNumero2(menor);
        }
        
        return mayor;
    }
    
    public double calcularPotencia(MatematicaEntidades math){
        //DUDA COMO LLAMAR DE UNA FUNCION A OTRA
        //LA FUNCION POTENCIA DEVUELVE DOUBLE
        double potencia= Math.pow(math.getNumero1(),math.getNumero2());
        return potencia;
    }
    
    public double calcularRaiz(MatematicaEntidades math){
        double menorNumero=Math.abs(Math.round(math.getNumero2()));       
        double raiz=Math.sqrt(menorNumero);        
        return raiz;
        
    }
}
