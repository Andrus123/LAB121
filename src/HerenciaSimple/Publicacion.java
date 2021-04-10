/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaSimple;

/**
 *
 * @author andru
 */
public class Publicacion {
    protected String titulo;
    protected double precio;
    protected int nAutores;
    protected String[][] a = new String[50][2];

    public Publicacion(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
        this.nAutores = 3;
        a[0][0] = "alan";  a[0][1] = "peru"; 
        a[1][0] = "jorge"; a[1][1] = "bolivia";
        a[2][0] = "ruben"; a[2][1] = "colombia";
    }
    public Publicacion(String titulo){
        this.titulo = titulo;
        this.precio = 70;
        this.nAutores = 2;
        a[0][0] = "alan";  a[0][1] = "peru"; 
        a[1][0] = "jorge"; a[1][1] = "bolivia";
    }
    
    public void mostrar(){
        System.out.println("\nDatos de Publicacion");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Precio: " + this.precio);
        System.out.println("Nro Autores : " + this.nAutores);
        System.out.println("\nTitulo:    Precio:");
        for(int i = 0; i< this.nAutores; i++){
            System.out.println(a[i][0] + "\t" + a[i][1]);
        }
    }
    public double precioVenta(Publicacion x, Publicacion y){
        return (this.precio + x.precio + y.precio);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getnAutores() {
        return nAutores;
    }

    public void setnAutores(int nAutores) {
        this.nAutores = nAutores;
    }

    public String[][] getA() {
        return a;
    }

    public void setA(String[][] a) {
        this.a = a;
    }
    
    
}
