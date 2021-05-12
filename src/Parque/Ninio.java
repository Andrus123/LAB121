/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parque;

/**
 *
 * @author Andrés Aquin
 */
public class Ninio extends Persona{
    private String nomMadre;
    private String nomPadre;
    private Estatura E;
    
    public Ninio(){
        super();
        this.nomMadre = "Susan";
        this.nomPadre = "Mark";
        E = new Estatura();
    }

    public Ninio(String nomMadre, String nomPadre, String nombre, int edad, Estatura E) {
        super(nombre, edad);
        this.nomMadre = nomMadre;
        this.nomPadre = nomPadre;
        this.E = E;
    }

    public String getNomMadre() {
        return nomMadre;
    }

    public void setNomMadre(String nomMadre) {
        this.nomMadre = nomMadre;
    }

    public String getNomPadre() {
        return nomPadre;
    }

    public void setNomPadre(String nomPadre) {
        this.nomPadre = nomPadre;
    }

    public Estatura getE() {
        return E;
    }

    public void setE(Estatura E) {
        this.E = E;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Nombre de la Madre: "+getNomMadre());
        System.out.println("Nombre del Padre: "+getNomPadre());
        E.mostrar();
    }
}
