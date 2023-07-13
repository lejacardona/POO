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
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
public class CuentaEntidades {
//DEFINIR ATRIBUTOS
private int numeroCuenta;
private int dni;
private double saldo;

    public CuentaEntidades() {
    }

    public CuentaEntidades(int numeroCuenta, int dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

       

    @Override
    public String toString() {
        return "CuentaEntidades{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldo=" + saldo + '}';
    }

   
    

    

    
    

    

}
