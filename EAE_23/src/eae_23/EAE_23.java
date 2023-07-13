/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eae_23;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

/**
 *
 * @author Alejandra
 */
public class EAE_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().**/
      Scanner leer = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        int m = 21; //cardinalidad de  la matriz
        String[][] matriz = new String[m][m]; //MATRIZ 21X21

        //creacion de la matriz con  letras de manera aleatorioa
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = String.valueOf((char) (Math.random() * 26 + 'A')); // Generar una letra aleatoria 'A' "A"

                // fila y columna numerica  para lograr ver la posicion de las letras 
                matriz[0][j] = String.valueOf(j);
                matriz[j][0] = String.valueOf(j);
            }
        }

        //numeros de palabras 
        System.out.println("cuantas palabras desea ingresar (máximo 20): ");
        int words = leer.nextInt();
        leer.nextLine(); // consume la nueva línea adicional
        String[] vector = new String[words];
        // asignacion de palabras 
        for (int i = 0; i < words; i++) {
            System.out.println("Digite la palabra N° " + (i + 1) + ":");
            String word1 = leer.nextLine();
            vector[i] = word1.toUpperCase();
            int fila = random(set, m);
            int columna = (int) (Math.random() * (m - word1.length() + 1) + 1);
            llenarMatriz(fila, columna, matriz, word1, m);
        }
        mostrarMatriz(m, m, matriz);
        
        
        
        int contWords=0;
        do {
             System.out.println("encontro alguna palabra ? \n ingrese aqui  la palabra encontrada ");
        String found = leer.nextLine().toUpperCase();
       
        int cont=0;
        int position;
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i].equals(found)) {
             System.out.println(found + " está presente en la sopa de letras");
               cont++ ; position=i; break;
            }
            }
            if (cont==0) {  System.out.println(found + " no  presente en la sopa de letras"); }
            else{

            System.out.println("en que  fila  esta  la primera letra de la palabra " + found );
            int row = leer.nextInt();
            System.out.println("en que  columna   esta  la primera letra de la palabra encontrada " +found);
            int column = leer.nextInt();
            leer.nextLine();
            if (matriz[row][column].equals(String.valueOf(found.charAt(0)))){
                System.out.println("felicitaciones es correcto ");
                contWords++;
                opcionCorrecta( row, column, matriz, found);
                 mostrarMatriz(m, m, matriz);
            }else{System.out.println("posicion incorrecta ");}
            System.out.println(matriz[row][column]);}
            
        } while (contWords<vector.length);
         System.out.println("Felicidades encontraste todas las palabras");
            
            

        }
        //funcion random que entrega un numero  aleatorio pero que nunca se repite,  con el proposito de  que 2 palabras no caigan en la misma posicion
        // set, hashset no perimite duplicado
    public static int random(Set<Integer> set, int m) {
        Random rand = new Random();
        int num;
        do {
            num = rand.nextInt(m - 1) + 1;

        } while (!set.add(num)); // se agrega el numero  al set  y si el numero esta duplicado  se repite hasta  que el numero NO este en  la lista 
        return num;
    }

    // subprograma que llena la matriz 
    public static void llenarMatriz(int row, int column, String[][] matriz, String palabra, int length) {
        palabra = palabra.toUpperCase();

        int fila = row;
        int columna = column;
        for (int j = 0; j < palabra.length(); j++) {
            matriz[fila][columna + j] = String.valueOf(palabra.charAt(j));
        }

    }

    // sub programa que muestra la  matriz en pantalla
    public static void mostrarMatriz(int m, int n, String[][] matriz) {
        System.out.println("Matriz principal:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j].length() > 1) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + "  ");
                }
            }
            System.out.println();
        }
        System.out.println("__________________________________________");
    }

    
    public  static void opcionCorrecta(int row, int column, String[][] matriz, String palabra){
     int fila = row;
        int columna = column;
        for (int j = 0; j < palabra.length(); j++) {
            matriz[fila][columna + j] = "_";
        }
    
    }
}
