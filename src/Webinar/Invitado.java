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
    private Tema t = new Tema();
    
    public Invitado(String n, String f, String h, String l, Tema t){
        
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
        return t;
    }

    public void setT(Tema t) {
        this.t = t;
    }
    
    
}
