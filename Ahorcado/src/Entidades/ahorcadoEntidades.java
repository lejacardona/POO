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
public class ahorcadoEntidades {
    /**un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario.**/
    private int letrasEncontradas;
    private int cantidadJugadasMax;
    private String [] palabraBuscada;

    public ahorcadoEntidades() {
    }
    //DIMENSION DEL VECTOR
    public ahorcadoEntidades (int n){
        palabraBuscada=new String [n];
    }

    public ahorcadoEntidades(int letrasEncontradas, int cantidadJugadasMax, String[] palabraBuscada) {
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadJugadasMax = cantidadJugadasMax;
        this.palabraBuscada = palabraBuscada;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadasMax() {
        return cantidadJugadasMax;
    }

    public void setCantidadJugadasMax(int cantidadJugadasMax) {
        this.cantidadJugadasMax = cantidadJugadasMax;
    }

    public String[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(String[] palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    @Override
    public String toString() {
        return "ahorcadoEntidades{" + "letrasEncontradas=" + letrasEncontradas + ", cantidadJugadasMax=" + cantidadJugadasMax + ", palabraBuscada=" + palabraBuscada + '}';
    }
    
    
}
