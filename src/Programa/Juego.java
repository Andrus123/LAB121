/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Andrés Aquin
 */
public class Juego extends Programa{
    private String nombre;
    private String categoria;
    private String descripcion;
    
    public Juego(String emdv, int np, double v, double p,String n, String cat, String des){
        super(emdv,np,v,p);
        this.nombre = n;
        this.categoria = cat;
        this.descripcion = des;
    }
    public Juego(){
        super();
        this.nombre = "League of Legends";
        this.categoria = "PC";
        this.descripcion = "LOL es un MOPG de 5v5 en linea";
    }
    @Override
    public void leer(){
        super.leer();
        System.out.println("Nombre del Juego: ");
        setNombre(Leer.dato());
        System.out.println("Categoria: ");
        setCategoria(Leer.dato());
        setNombre(Leer.dato());
        System.out.println("Descripción: ");
        setDescripcion(Leer.dato());
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Juego: "+getNombre());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Descripción: "+getDescripcion());
    }

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void compJuego(Juego x, Juego y)
    {
        if(x.nroPlataformas>y.nroPlataformas){
            System.out.println(x.getNombre()+" está disponible en "+x.nroPlataformas +" plataformas");
        }else{
            System.out.println(y.getNombre()+" está disponible en "+y.nroPlataformas +" plataformas");
        }
    }
}
