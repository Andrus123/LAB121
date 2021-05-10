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
public class Webinar {
    private String nombre, entidadOrganizadora;
    private int nt;
    private Invitado[]I = new Invitado[30];
    
    public Webinar(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntidadOrganizadora() {
        return entidadOrganizadora;
    }

    public void setEntidadOrganizadora(String entidadOrganizadora) {
        this.entidadOrganizadora = entidadOrganizadora;
    }

    public int getNt() {
        return nt;
    }

    public void setNt(int nt) {
        this.nt = nt;
    }

    public Invitado[] getI() {
        return I;
    }

    public void setI(Invitado[] I) {
        this.I = I;
    }
    
    
}
