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
    
    public Webinar(String n, String eo){
        nt = 0;
        nombre = n;
        entidadOrganizadora = eo;
    }
    public void adiInvitado(Invitado x){
        I[nt] = x;
        nt++;
    }
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Entidad Organizadora: "+getEntidadOrganizadora());
        System.out.println("N° de invitados: "+getNt());
        for (int i = 0; i < getNt(); i++) {
            I[i].mostrar();
        }
    }
    public boolean verificarInvitado(Invitado X){
        for (int i = 0; i < getNt(); i++) {
            if(I[i].getNombre().equals(X.getNombre()) && 
                    I[i].getFecha().equals(X.getFecha())&& I[i].getLugarTrabajo().equals(X.getLugarTrabajo()))
                return true;
        }
        return false;
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
