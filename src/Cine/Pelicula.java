/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

/**
 *
 * @author Andrés Aquin
 */
public class Pelicula {
    private String nombre;
    private int nroDirectores;
    private Director d[] = new Director[10];
    private int nroActores;
    private Actor a[] = new Actor[5];
    
    public Pelicula(String nombre){
        this.nroActores = 0;
        this.nroDirectores = 0;
    }
    public void adiDirector(Director z){
        this.d[this.nroDirectores] = z;
        this.nroDirectores++;
    }
}
