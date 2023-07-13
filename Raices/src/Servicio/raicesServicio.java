/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.raicesEntidades;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class raicesServicio {
    //PRIMER METODO DONDE SE CREA EL OBJETO
    public raicesEntidades crearRaiz(){
        Scanner leer=new Scanner(System.in);
        raicesEntidades raiz=new raicesEntidades();
        System.out.println("Ingrese los coeficientes a,b,c:");
        raiz.setA(leer.nextDouble());
        raiz.setB(leer.nextDouble());
        raiz.setC(leer.nextDouble());
        return raiz;
    }
    
    public double getDiscriminante(raicesEntidades raiz){
        /**Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c**/
        double discriminante=Math.pow(raiz.getB(), 2)-4*raiz.getA()*raiz.getC();
        return discriminante;
    }
    
    public boolean tieneRaices(raicesEntidades raiz){
    raicesServicio rs=new raicesServicio();
    boolean tieneRaices;
        if (rs.getDiscriminante(raiz)>=0) {
            tieneRaices=true;            
        }else{
            tieneRaices=false;  
        }
    return tieneRaices;
    }
    
    /**Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.**/
    public boolean tieneRaiz(raicesEntidades raiz){
    raicesServicio rs=new raicesServicio();
    boolean tieneRaiz;
        if (rs.getDiscriminante(raiz)==0) {
            tieneRaiz=true;            
        }else{
            tieneRaiz=false;  
        }
    return tieneRaiz;
    }
    
    /**Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.**/
    public void obtenerRaices(raicesEntidades raiz){
    raicesServicio rs=new raicesServicio();
    double solucion1;
    double solucion2;
        if (rs.tieneRaices(raiz)) {
            solucion1=-raiz.getB()+rs.getDiscriminante(raiz);
            solucion2=-raiz.getB()-rs.getDiscriminante(raiz);
            System.out.println("La solucion 1 es: "+solucion1);
            System.out.println("La solucion 2 es: "+solucion2);
        }
    }
    
    /**Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.**/
    public void obtenerRaiz(raicesEntidades raiz){
    raicesServicio rs=new raicesServicio();
    double solucion1;
    if (rs.tieneRaiz(raiz)) {
            solucion1=-raiz.getB()+rs.getDiscriminante(raiz);
            System.out.println("La ÚNICA solucion es: "+solucion1);
        }
    }
    
    /**Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.**/
    public void calcular(raicesEntidades raiz){
    raicesServicio rs=new raicesServicio();
    //TIENE RAICES >=0
    boolean raices=rs.tieneRaices(raiz);
        System.out.println("¿Tiene dos soluciones? "+raices);
        
    //TIENE RAIZ ==0
    boolean tieneRaiz=rs.tieneRaiz(raiz);
        System.out.println("¿Tiene única solución? "+tieneRaiz);
        
    //IMPRIMIR LAS DOS SOLUCIONES SI LAS TIENE
    rs.obtenerRaices(raiz);
    
    //IMPRIMIR LAS UNICA SOLUCION SI LA TIENE
    rs.obtenerRaiz(raiz);
    
        if (rs.getDiscriminante(raiz)<0) {
            System.out.println("NO EXISTE UNA SOLUCIÓN PARA ESTA ECUACIÓN");
            
        }
        
    }
}
