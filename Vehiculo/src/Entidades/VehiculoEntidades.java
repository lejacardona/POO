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
public class VehiculoEntidades {
    //DEFINIMOS LOS ATRIBUTOS, ponerle privado por buenas practicas
    //marca, modelo, año y tipo
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;   
    private int distancia;
    
    public VehiculoEntidades() {
    }

    public VehiculoEntidades(String marca, String modelo, int anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "VehiculoEntidades{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", tipo=" + tipo + ", distancia=" + distancia + '}';
    }
    
    
   
    
    
}
