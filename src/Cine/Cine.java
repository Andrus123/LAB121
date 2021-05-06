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
public class Cine {
    private String nombre;
    private int nroSalas;
    private Sala s[] = new Sala[20];
    private int nroPeliculas;
    private Pelicula p[] = new Pelicula[20];
    
    public Cine(String nombre){
        this.nombre = nombre;
        this.nroSalas = 3;
        this.s[0] = new Sala(5, "Sala 1", "VIP");
        this.s[1] = new Sala(10, "Sala 2", "Standard");
        this.s[2] = new Sala(3, "Sala 4", "3D");
        this.nroPeliculas = 0;
    }
    public Cine(String nombre,int nroPeliculas, Pelicula[] pe){
        this.nombre = nombre;
        this.nroSalas = 3;
        this.s[0] = new Sala(5, "Sala 1", "VIP");
        this.s[1] = new Sala(10, "Sala 2", "Standard");
        this.s[2] = new Sala(3, "Sala 4", "3D");
        this.nroPeliculas = nroPeliculas;
        this.p = pe;
    }
    public void mostrar(){
        System.out.println("\nnombre: "+this.nombre);
        System.out.println("N° de salas: "+this.nroSalas);
        for (int i = 0; i < this.nroSalas; i++) {
            System.out.println(this.s[i].toString());
        }
        System.out.println("N° de peliculas: "+this.nroPeliculas);
        for (int i = 0; i < this.nroPeliculas; i++) {
            this.p[i].mostrar();
        }
    }
    public void adiPelicula(Pelicula x){
        this.p[this.nroPeliculas] = x;
        this.nroPeliculas++;
    }
}
