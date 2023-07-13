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
public class RectanguloEntidades {
    private int base;
    private int altura;

    public RectanguloEntidades() {
    }

    public RectanguloEntidades(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "RectanguloEntidades{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
