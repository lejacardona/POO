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
public class ProductoEntidades {
    private String nombre;
    private String categoria;
    private double precio;
    private double inventario;

    public ProductoEntidades() {
    }

    public ProductoEntidades(String nombre, String categoria, double precio, double inventario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getInventario() {
        return inventario;
    }

    public void setInventario(double inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "ProductoEntidades{" + "nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", inventario=" + inventario + '}';
    }
    
}
