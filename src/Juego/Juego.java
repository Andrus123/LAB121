/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author andru
 */
public class Juego {

    private String nombre;
    private String categoria;
    private String version;
    private int anioCreacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Juego() {
        nombre = "fortnite";
        categoria = "consola";
        version = "3.0";
        anioCreacion = 2014;
    }

    public Juego(String nombre, String categoria, String version, int anioCreacion) {
        this.nombre = "starcraft";
        this.categoria = "pc";
        this.version = "3.0";
        this.anioCreacion = 2005;
    }

    public void leer() {
        System.out.println("Nombre: ");
        this.nombre = Leer.dato();
        System.out.println("categoria: ");
        this.categoria = Leer.dato();
        System.out.println("version: ");
        this.version = Leer.dato();
        System.out.println("año de creacion: ");
        this.anioCreacion = Leer.datoInt();
    }

    public void mostrar() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("categoria : " + getCategoria());
        System.out.println("version: " + getVersion());
        System.out.println("año de creacion: " + getAnioCreacion());
    }

    public void mismoanio(Juego j1, Juego j2) {
        if (j1.anioCreacion == j2.anioCreacion) {
            System.out.println("fueron lanzados el mismo a�o");
        } else {
            System.out.println("Tienen distintas fechas de creación");
        }
    }
    public void mismoatributo(Juego j1, Juego j2){
        int c = 0;
        if(j1.getNombre().equals(j2.getNombre())){
            System.out.println("tienen el mismo nombre");
            c++;
        }
        if(j1.getCategoria().equals(j2.getCategoria())){
            System.out.println("tienen la misma categoria");
            c++;
        }
        if(j1.getVersion().equals(j2.getVersion())){
            System.out.println("Son de la misma version");
            c++;
        }
        if(j1.getAnioCreacion() == j2.getAnioCreacion()){
            System.out.println("Se crearon el mismo año");
            c++;
        }
        if(c == 0){
            System.out.println("No comparten Atributos");
        }
    }
    public void ascendente(Juego j1, Juego j2, Juego j3, Juego j4){
        String c = "";
       if(j1.getAnioCreacion()<j2.getAnioCreacion()&&j1.getAnioCreacion()<j3.getAnioCreacion()
               &&j1.anioCreacion<j4.getAnioCreacion()){
           c = j1.getNombre() ;
           System.out.println("Primer lanzamiento" + c);
       }
    }

}
