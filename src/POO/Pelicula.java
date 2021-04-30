/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import Organizacion.Leer;

/**
 *
 * @author Andrés Aquin
 */
public class Pelicula {
    private String titulo;
    private String director;
    private int anio;
    
    public Pelicula(){
        this.titulo = "El Padrino";
        this.director = "Francis Ford Coppola";
        this.anio = 1972;
    }

    public Pelicula(String titulo, String director, int anio) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void llenar(){
        System.out.println("Titulo: ");
        setTitulo(Leer.dato());
        System.out.println("Director: ");
        setDirector(Leer.dato());
        System.out.println("Año de estreno: ");
        setAnio(Leer.datoInt());
    }
    public void mostrar(){
        System.out.println("\nPelicula: "+getTitulo());
        System.out.println("Dirigida por "+getDirector());
        System.out.println("Estreno: "+getAnio());
    }
    public void verfDir(Pelicula x){
        if(this.getDirector()==x.getDirector()){
            System.out.println("Si son del mismo director");
        }else{
            System.out.println("Son de directores diferentes");
        }
    }
    public void compAnio(Pelicula x){
        if(this.getAnio()==x.getAnio()){
            System.out.println("Estreno del mismo año");
        }else{
            System.out.println("Estreno en diferentes años");
        }
    }
    
    public static void main(String[] args){
        //a)instanciar dos peliculas de diferente forma
        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula("Red Social","David Fincher",2010);
        p1.mostrar();
        p2.mostrar();
        //b)verificar si son del mismo director
        p1.verfDir(p2);
        //c)Comparar si ambas salieron el mismo año
        p1.compAnio(p2);
    }
}
