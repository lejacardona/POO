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
public class LibroEntidades {
    //DEFINIMOS LOS ATRIBUTOS
    public int ISBN;
    public String titulo;
    public String autor;
    public int paginas;

    //CREAR LOS CONSTRUCTORES (UNO VACÍO Y OTRO CON TODOS LOS ATRIBUTOS,PASADOS POR PARAMETRO(?))
    public LibroEntidades() {
    }

    public LibroEntidades(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
   //CREAR LOS GETTER & SETTER

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "LibroEntidades{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }   
    
    
}
