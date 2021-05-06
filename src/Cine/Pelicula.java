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
        this.nombre = nombre;
        this.nroActores = 0;
        this.nroDirectores = 0;
    }
    public void adiDirector(Director z){
        this.d[this.nroDirectores] = z;
        this.nroDirectores++;
    }
    public void adiActor(Actor z){
        this.a[this.nroActores] = z;
        this.nroActores++;
    }
    public void mostrar(){
        System.out.println("\nPelicula: "+this.nombre);
        System.out.println("N° de directores: "+this.nroDirectores);
        for(int i=0;i<this.nroDirectores; i++){
            this.d[i].mostrar();
        }
        System.out.println("N° de actores: "+this.nroActores);
        for (int i = 0; i < this.nroActores; i++) {
            this.a[i].mostrar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroDirectores() {
        return nroDirectores;
    }

    public void setNroDirectores(int nroDirectores) {
        this.nroDirectores = nroDirectores;
    }

    public Director[] getD() {
        return d;
    }

    public void setD(Director[] d) {
        this.d = d;
    }

    public int getNroActores() {
        return nroActores;
    }

    public void setNroActores(int nroActores) {
        this.nroActores = nroActores;
    }

    public Actor[] getA() {
        return a;
    }

    public void setA(Actor[] a) {
        this.a = a;
    }
}
