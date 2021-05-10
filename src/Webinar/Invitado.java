/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Webinar;

/**
 *
 * @author Andrés Aquin
 */
public class Invitado extends Profesional{
    private String nombre,fecha,hora,link;
    private Tema T = new Tema();
    
    public Invitado(String n, String f, String h, String l, Tema x, String t, String lugar, String c){
        nombre = n;
        fecha = f;
        hora = h;
        link = l;
        T = x;
        titulo = t;
        lugarTrabajo = lugar;
        cargo = c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Tema getT() {
        return T;
    }

    public void setT(Tema T) {
        this.T = T;
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Fecha: "+getFecha());
        System.out.println("Hora: "+getHora());
        System.out.println("Link: "+getLink());
        System.out.println("Tema: "+ T.getTitulo());
        System.out.println("Titulo: "+ getTitulo());
        System.out.println("LugarTrabajo: "+ getLugarTrabajo());
        System.out.println("Cargo: "+ getCargo());
        System.out.println("");
    }
    
}
