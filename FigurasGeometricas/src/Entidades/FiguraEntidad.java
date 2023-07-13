/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author nohav
 */
public class FiguraEntidad {
    private String tipo;
    private int nLados;
    private double altura;
    private double lado;
    private double perimetro;
    private double area; 
    
    
    public FiguraEntidad() {
    }

    public FiguraEntidad(String tipo) {
        this.tipo = tipo;
    }
    

    public FiguraEntidad(String tipo, int nLados, double perimetro, double area) {
        this.tipo = tipo;
        this.nLados = nLados;
        this.perimetro = perimetro;
        this.area = area;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
    

    @Override
    public String toString() {
        return "Entidad{" + "tipo=" + tipo + ", nLados=" + nLados + ", perimetro=" + perimetro + ", area=" + area + '}';
    }
    
    
    
}

