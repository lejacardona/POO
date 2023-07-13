/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.ahorcadoEntidades;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class ahorcadoServicio {
/**Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.**/
    
    //CREACION DEL OBJETO
    public ahorcadoEntidades crearJuego(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la palabra");
        String palabra=leer.next();
        int longitudPalabra=palabra.length();
        //CREO QUE DE ESTA FORMA LE ESTOY ASIGNANDO LA DIMENSION AL ATRIBUTO PALABRA BUSCADA
        ahorcadoEntidades juego =new ahorcadoEntidades(longitudPalabra);
        String [] letras= new String [longitudPalabra];
        
        for (int i = 0; i < palabra.length(); i++) {
            //la funcion substring pasa por cada posicion/cajoncito del string (0,1) es igual
            //a la posicion 0 que estamos acostumbrados
            letras[i]=palabra.substring(i, i+1);            
        }
        
        juego.setPalabraBuscada(letras);
        
        //¿COMO IMPRIMO EL ATRIBUTO PALABRA BUSCADA SABIENDO QUE EL TIPO DE DATOS ES UN VECTOR
        System.out.println("Ingrese el maximo de jugadas");
        juego.setCantidadJugadasMax(leer.nextInt());
        juego.setLetrasEncontradas(0);
//        System.out.println(juego.getPalabraBuscada().length);
        return juego;
    }
    
    /**Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.**/
    public void longitud(ahorcadoEntidades juego){
        System.out.println("La longitud de la palabra que se debe encontrar es: ");
        System.out.println(juego.getPalabraBuscada().length);
    }
    
    /**Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.**/
    
    //ESTE METODO LO PUSE TIPO FUNCION PARA QUE RETORNARA EL NUMERO DE LETRAS ENCONTRADAS
    //PORQUE COMO SUBPROCESO SIN NINGUN RETORNO NO ME ESTABA FUNCIONANDO
    public int buscar(ahorcadoEntidades juego){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra=leer.next();
        //inicializar variable encontre, por cada letra que ingrese el usuario
        int encontre=0;
        boolean estaba=true;
        
        String [] palabra=juego.getPalabraBuscada();
        for (int i = 0; i < juego.getPalabraBuscada().length; i++) {
            //AQUI DEBO COGER EL VECTOR AUXILIAR QUE TENGO O CREAR OTRO FOR PARA QUE LO RECORRA TODO
            
            if (palabra[i].equalsIgnoreCase(letra)){
                System.out.println("La letra fue encontrada");
                //contador de encontre (para que cuente cuantas veces encontro una letra en la palabra
                encontre++;
                estaba=true;
                System.out.println(estaba);
                System.out.println("se encontraron tantas palabras_b");
                System.out.println(encontre);
            }else{
                System.out.println("No se encontro la letra");
                estaba=false;
                System.out.println(estaba);
            }
        }
        return encontre;
    }
    
    /**Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.**/
    public void encontradas(ahorcadoEntidades juego){
        ahorcadoServicio as=new ahorcadoServicio();
        int oportunidades=juego.getCantidadJugadasMax();
        //debo inicializarlo en 0 por fuera del ciclo, para que se siga guardando la variable en cada letra que ingrese el usuario
        //y lo igualo a letrasencontradas que es cero
        int encontre1=juego.getLetrasEncontradas();
        
        do {
            //y se debe sumar la variable de letras encontrados como un contador para que no pase nada si se reinicia el contado dentro de buscar
            //y se suma con el valor que retorne el metodo buscar
            encontre1=encontre1+as.buscar(juego);
            //voy seteando la variable de letras encontradas (para que se guarde)
            juego.setLetrasEncontradas(encontre1);
            
            //si despues de entrar al metodo buscar retorna 0, es decir que no encontro ninguna letra en la palabra
            //que reste una oportunidad y diga cuantas oportunidades le quedan
            if (encontre1==0) {
                oportunidades--;
                as.intentos(juego, oportunidades);
            }else {
            System.out.println("se encontraron tantas letras_e");
            System.out.println(encontre1);
            }          
         
            
            if (juego.getLetrasEncontradas()==juego.getPalabraBuscada().length) {
            System.out.println("Ha encontrado todas las letras!");
            }else{
            System.out.println("Ha encontrado "+juego.getLetrasEncontradas()+" letras");
            System.out.println("Le faltan "+(juego.getPalabraBuscada().length-juego.getLetrasEncontradas())+" letras");
        }
        } while (oportunidades!=0 || juego.getPalabraBuscada().length==juego.getLetrasEncontradas());                      
    }
    
    //Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    public void intentos(ahorcadoEntidades juego, int oportunidades){
        System.out.println("Tiene "+oportunidades+" oportunidades");
    }
    
    /**Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.**/
    public void juego(ahorcadoEntidades juego, int encontre){
        ahorcadoServicio as=new ahorcadoServicio();
        //CREACION O INICIO DEL JUEGO
        juego=as.crearJuego();
        as.longitud(juego);
        as.encontradas(juego);
        
    }
    
}
