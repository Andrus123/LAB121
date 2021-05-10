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
    
    public PlataformaWebinar(String n){
        nw = 0;
        nombre = n;
    }
    public void adiWebinar(Webinar x){
        W[nw] = x;
        nw++;
    }
    public void mostrar(){
        System.out.println("Plataforma: "+getNombre());
        System.out.println("Nro Webinar: "+getNw());
        for (int i = 0; i < getNw(); i++) {
            W[i].mostrar();
        }
    }
    public boolean verificarInvitado(Invitado X){
        for (int i = 0; i < getNw(); i++) {
            if(W[i].verificarInvitado(X))
                return true;
        }
        return false;
    } 
    public boolean verificarWebinar(PlataformaWebinar p2, String x){
        boolean sw = false;
        for (int i = 0; i < nw; i++) 
            if(W[i].getNombre().equals(x))
                sw = true;
        
        boolean sw2 = false;
        for (int i = 0; i < p2.getNw(); i++) 
            if(p2.getW()[i].getNombre().equals(x))
                sw2 = true;
        
        return sw && sw2;
    }

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
