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
public class PlataformaWebinar {
    private String nombre;
    private int nw;
    private Webinar[] W = new Webinar[30];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNw() {
        return nw;
    }

    public void setNw(int nw) {
        this.nw = nw;
    }

    public Webinar[] getW() {
        return W;
    }

    public void setW(Webinar[] W) {
        this.W = W;
    }
    
    
}
