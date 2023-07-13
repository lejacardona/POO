/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.OperacionEntidades;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */

public class OperacionServicio {
    
    //METODO TIPO SUBPROCESO (que no retorne nada)
    public OperacionEntidades crearOperacion(){
        //CREAR UN OBJETO DE TIPO OPERACION (QUE LA DA LA CLASE DE LOS ATRIBUTOS/ENTIDADES)
        OperacionEntidades Operacion1=new OperacionEntidades();
        
        Scanner leer=new Scanner (System.in).useDelimiter("\n"); //esto ultimo que se le agrega es para que si se pone un espacio no interfiera con la siguiente cadena que pregunta
        //SETTEAR/Establecer NUMERO INGRESADO POR EL USUARIO (Primero objeto.set(leer)
        System.out.println("Ingrese un numero");
        Operacion1.setNumero1(leer.nextFloat());
        System.out.println("Ingrese otro numero");
        Operacion1.setNumero2(leer.nextFloat());
        return Operacion1;
     }
    
    //METODO TIPO FUNCION (donde se pone el tipo de dato que se va a retornar en este caso puede ser tipo entero
    //Porque la suma que le vamos a devolver al usuario no es un atributo del objeto, si lo fuera, el tipo de dato seria OperacionEntidades
    public float sumar(OperacionEntidades Operacion1){ //se pone como parametro el objeto operacion1, donde estan los atributos numero1 y 2
        //Para obtener los numeros ingresados, se llama el objeto.getAtributo
        float suma=Operacion1.getNumero1()+Operacion1.getNumero2();
        System.out.println("La suma de los numeros es: "+suma);        
        return suma;
    }
    
    public float restar(OperacionEntidades Operacion1){ //se pone como parametro el objeto operacion1, donde estan los atributos numero1 y 2
        //Para obtener los numeros ingresados, se llama el objeto.getAtributo
        float resta=Operacion1.getNumero1()-Operacion1.getNumero2();
        System.out.println("La suma de los numeros es: "+resta);        
        return resta;
    }
    
    /**Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main**/
    public float multiplicar(OperacionEntidades Operacion1){
        float producto=Operacion1.getNumero1()*Operacion1.getNumero2();
        if (Operacion1.getNumero1()==0 || Operacion1.getNumero2()==0) {
            producto=0;
            System.out.println("ERROR. Uno de los numeros es igual a 0");            
        } else  {
            System.out.println("El producto de los dos numeros es igual a: "+producto);
        }
        
        return producto;
    }
    
    public float dividir (OperacionEntidades Operacion1){
        float division=Operacion1.getNumero1()/Operacion1.getNumero2();
        if (Operacion1.getNumero1()==0 || Operacion1.getNumero2()==0) {
            division=0;
            System.out.println("ERROR. Uno de los numeros es igual a 0");            
        } else  {
            System.out.println("La division de los dos numeros es igual a: "+division);
        }
        return division;
    }
}
