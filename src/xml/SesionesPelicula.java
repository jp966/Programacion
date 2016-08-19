/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.util.Vector;

/**
 *
 * @author juan pablo
 */
public class SesionesPelicula {
    Pelicula pelicula;
    Vector sesionesStrPelicula;
    
    public SesionesPelicula(Pelicula pelicula, Vector sesionesStrPelicula){
        this.pelicula=pelicula;
        this.sesionesStrPelicula=sesionesStrPelicula;
    }
    
    public static void main(String[] args) {
    }
}
