/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.CursoEntidades;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class CursoServicio {
    public CursoEntidades crearCurso(){
        Scanner leer=new Scanner(System.in);
        CursoServicio cs=new CursoServicio();
        CursoEntidades curso=new CursoEntidades();
        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por dia de los alumnos");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese el precio por hora");
        curso.setPrecioPorHora(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias a la semana");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        //Aqui estoy llamando a un subproceso dentro de una funcion (para eso debo importar la clase servicio
        //como se hace en el main y poner como parametro el objeto
        cs.cargarAlumnos(curso);
        return curso;
    }
    
    public void cargarAlumnos(CursoEntidades curso){
        Scanner leer=new Scanner(System.in);
        /**Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.**/
        
        //PARA RELLENAR UN ATRIBUTO TIPO VECTOR (se debe crear un vector auxiliar)
        String [] vectorAlumnos=new String [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno");
            vectorAlumnos[i]=leer.next();            
        }
        
        curso.setAlumnos(vectorAlumnos);
        System.out.println("Los alumnos son:");
        System.out.println(Arrays.toString(curso.getAlumnos()));
    }
    
    /**Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.**/
    public void calcularGananciaSemanal(CursoEntidades curso){           
        
        int gananciaSemanal=curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*5*curso.getCantidadDiasPorSemana();
        System.out.println("La ganancia semanal fue: "+ gananciaSemanal);
    }
}
