/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferenciaEntidades;

/**
 *
 * @author Alejandra
 */
public class entidades {
    //DEFINIR ATRIBUTOS
    private double radio;    
    //CREAR CONSTRUCTOR VACÍO
    public entidades() {
    }
    //CREAR CONSTRUCTOR CON LOS ATIRBUTOS
    public entidades(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "entidades{" + "radio=" + radio + '}';
    }
    
}

