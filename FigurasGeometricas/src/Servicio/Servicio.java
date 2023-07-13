/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.FiguraEntidad;
import java.util.Scanner;

/**
 *
 * @author nohav
 */
public class Servicio {
    
    public FiguraEntidad crearFigura(){
        Scanner sc = new Scanner(System.in);
        FiguraEntidad figura = new FiguraEntidad();
        System.out.println("Ingrese el tipo de Figura");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        System.out.println("5. Hexagono");
        System.out.println("6. Pentagono");
        System.out.println("7. Rombo");
        int tipo = sc.nextInt();
        if (tipo == 1){
            figura.setTipo("Cuadrado");
            System.out.println("Ingrese el lado del cuadrado");
            double lado = sc.nextDouble();
            figura.setLado(lado);
            figura.setPerimetro(lado*4);
            figura.setArea(lado*lado);
        }
        if (tipo == 2){
            figura.setTipo("Rectangulo");
            System.out.println("Ingrese la base del rectangulo");
            double base = sc.nextDouble();
            System.out.println("Ingrese la altura del rectangulo");
            double altura = sc.nextDouble();
            figura.setLado(base);
            figura.setPerimetro((base+altura)*2);
            figura.setArea(base*altura);
        }
        
        if (tipo == 3){
            figura.setTipo("Triangulo");
            System.out.println("Ingrese el lado del Triangulo");
            double lado = sc.nextDouble();
            figura.setLado(lado);
            figura.setPerimetro(lado*3);
            figura.setArea(lado*lado*0.4330);
        }
        
        if (tipo == 4){
            figura.setTipo("Circulo");
            System.out.println("Ingrese el radio del circulo");
            double radio = sc.nextDouble();
            figura.setLado(radio);
            figura.setPerimetro(radio*6.2831);
            figura.setArea(radio*radio*3.1415);
        }
        
        if (tipo == 5){
            figura.setTipo("Hexagono");
            System.out.println("Ingrese el lado del hexagono");
            double lado = sc.nextDouble();
            figura.setLado(lado);
            figura.setPerimetro(lado*6);
            figura.setArea(lado*lado*3/1.1544);
        }
        
        if (tipo == 6){
            figura.setTipo("Pentagono");
            System.out.println("Ingrese el lado del Pentagono");
            double lado = sc.nextDouble();
            figura.setLado(lado);
            figura.setPerimetro(lado*5);
            figura.setArea(lado*lado*5/1.453/2);
        }
        
        if (tipo == 7){
            figura.setTipo("Rombo");
            System.out.println("Ingrese la diagonal mayor del rombo");
            double dMayor = sc.nextDouble();
            System.out.println("Ingrese la diagonal menor del rombo");
            double dMenor = sc.nextDouble();
            figura.setLado(dMayor);
            figura.setAltura(dMenor);
            figura.setPerimetro(Math.sqrt(dMayor*dMayor+dMenor*dMenor)*2);
            figura.setArea(dMayor*dMenor);
        }
        return figura;
    }
    
    public void MostrarResultados(FiguraEntidad figura){
        System.out.println("El perimetro de la figura es "+figura.getPerimetro());
        System.out.println("El area de la figura es "+figura.getArea());
    }
    
    
}
