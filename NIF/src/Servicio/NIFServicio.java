/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.NIFEntidades;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class NIFServicio {
    //CREACION DEL OBJETO
    public NIFEntidades crearNIF(){
        Scanner leer=new Scanner(System.in);
        //Creacion del objeto
        NIFEntidades NIF=new NIFEntidades();
        //Setteo del atributo
        System.out.println("Ingrese el DNI");
        NIF.setDNI(leer.nextLong());
        //RECORDAR QUE LA OPERACION MOD o % devuelve el resto de la division
        double resto=NIF.getDNI()%23;
        //EL VALOR DEL RESTO DEBE ESTAR ENTRE 0 Y 22
        
        while  (resto<0 & resto>22){
            System.out.println("El resto no esta entre 0 y 22. Ingrese nuevamente el DNI");
            resto=NIF.getDNI()%23;            
        } 
        
        //CREACION DEL VECTOR CON LAS LETRAS
        String [] vectorLetras=new String [23];
        vectorLetras[0]="T";
        vectorLetras[1]="R";
        vectorLetras[2]="W";
        vectorLetras[3]="A";
        vectorLetras[4]="G";
        vectorLetras[5]="M";
        vectorLetras[6]="Y";
        vectorLetras[7]="F";
        vectorLetras[8]="P";
        vectorLetras[9]="D";
        vectorLetras[10]="X";
        vectorLetras[11]="B";
        vectorLetras[12]="N";
        vectorLetras[13]="J";
        vectorLetras[14]="Z";
        vectorLetras[15]="S";
        vectorLetras[16]="Q";
        vectorLetras[17]="V";
        vectorLetras[18]="H";
        vectorLetras[19]="L";
        vectorLetras[20]="C";
        vectorLetras[21]="K";
        vectorLetras[22]="E";
        
        //SETTEO DE LA LETRA
        for (int i = 0; i < 23; i++) {
            if (resto==i) {
                NIF.setLetra(vectorLetras[i]);
            }
        }
        
        System.out.println("La letra correspondiente al dígito verificador es: "+NIF.getLetra());
        
                
        return NIF;
    }
    
    /**Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).**/
    public void mostrar(NIFEntidades NIF){
        System.out.println("El NIF es: "+NIF.getDNI()+"-"+NIF.getLetra());
    }
}
