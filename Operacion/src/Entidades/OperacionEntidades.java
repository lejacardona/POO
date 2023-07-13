/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Alejandra
 */
public class OperacionEntidades {
    //DEFINIMOS LOS ATRIBUTOS
    private float numero1;
    private float numero2;
    
    //Metodo constructor sin los atributos pasados por parámetro.
    public OperacionEntidades() {
    }
    
    //Método constructor con todos los atributos pasados por parámetro.
    public OperacionEntidades(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //GETTER & SETTER
    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "OperacionEntidades{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
}
