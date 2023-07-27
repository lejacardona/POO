/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

import Entidades.ProductoEntidades;
import Servicio.TiendaServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class Producto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    ArrayList <ProductoEntidades> productos=new ArrayList();
    String respuesta="";
    
        do {
        //nombre, categoria, precio, inventario
            ProductoEntidades producto=new ProductoEntidades();
            System.out.println("Ingrese el nombre del producto");
            producto.setNombre(leer.next());
            System.out.println("Ingrese la categoria del producto");
            producto.setCategoria(leer.next());
            System.out.println("Ingrese el precio del producto");
            producto.setPrecio(leer.nextDouble());
            System.out.println("Ingrese el inventario del producto");
            producto.setInventario(leer.nextDouble());
            productos.add(producto);
            
            System.out.println("¿Desea ingresar un producto? si/no");
            respuesta=leer.next();    
        } while (respuesta.equals("si"));
    productos.forEach((producto)->System.out.println(producto));
    TiendaServicio ts=new TiendaServicio();
    ts.venta(productos);
    ts.reposicion(productos);
    
    productos.forEach((producto)->System.out.println(producto));
        
    }
    
}
