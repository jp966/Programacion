/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

/**
 *
 * @author juan pablo
 */
public class Pelicula {
    String codigo;
    String titulo;
    String director;
    String actores;
    
    public Pelicula(String codigo, String titulo, String director,String actores){
        this.codigo=codigo;
        this.titulo=titulo;
        this.director=director;
        this.actores=actores;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getActores() {
        return actores;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    
    
    
    
    public static void main(String[] args) {
    }
    
}
