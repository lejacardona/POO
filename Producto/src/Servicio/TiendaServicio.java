/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.ProductoEntidades;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
/**
 * *Método venta(): El usuario ingresa el nombre del producto que quiere
 * comprar y se lo busca en el ArrayList. Si está en el ArrayList, se llama con
 * ese objeto Producto al método. El método se decrementa de a uno, como un
 * carrito de compras, el atributo cantidad en inventario, del producto que
 * ingresó el usuario. Esto sucederá cada vez que se realice una venta del
 * producto. No se podrán vender productos de los que no queden inventario
 * disponible para vender. Devuelve true si se ha podido realizar la operación y
 * false en caso contrario.**
 */
public class TiendaServicio {

    public boolean venta(ArrayList<ProductoEntidades> productos) {
        Scanner leer = new Scanner(System.in);
        boolean venta = false;
        System.out.println("Ingrese el producto que desea buscar:");
        String productoBuscado = leer.next();

        for (ProductoEntidades producto : productos) {

            if (producto.getNombre().equals(productoBuscado)) {
                if (producto.getInventario() > 0) {
                    producto.setInventario(producto.getInventario() - 1);
                    venta = true;
                } else {
                    System.out.println("No hay unidades existentes");
                }
            }
        }
        if (venta) {
            System.out.println("PRODUCTO COMPRADO");
        } else {
            System.out.println("El producto ingresado NO existe");
        }
        return venta;
    }

    /**
     * *Método reposición(): El usuario ingresa el nombre del producto que
     * quiere reponer y se lo busca en el ArrayList. Si está en el ArrayList, se
     * llama con ese objeto al método. El método incrementa de a uno, como un
     * carrito de compras, el atributo cantidad en inventario, del producto
     * seleccionado por el usuario. Esto sucederá cada vez que se produzca una
     * reposición de un producto.**
     */
    public void reposicion(ArrayList<ProductoEntidades> productos) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el producto que desea buscar:");
        String productoBuscado = leer.next();
        boolean reposicion = false;

        for (ProductoEntidades producto : productos) {
            if (producto.getNombre().equals(productoBuscado)) {
                producto.setInventario(producto.getInventario() + 1);
                reposicion = true;
            }
        }
        
        if (reposicion) {
            System.out.println("PRODUCTO AGREGADO. Inventario actualizado.");
        } else {
            System.out.println("El producto ingresado NO existe");
        }

    }


}
