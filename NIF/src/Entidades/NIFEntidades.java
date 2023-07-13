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
public class NIFEntidades {
    private Long DNI;
    private String letra;

    public NIFEntidades() {
    }

    public NIFEntidades(Long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIFEntidades{" + "DNI=" + DNI + ", letra=" + letra + '}';
    }
    
    
}
