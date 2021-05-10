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
public class Parque {
    private String nombre;
    private int nAP;
    private AtraccionParque[] AP = new AtraccionParque[15];
    
    public Parque(){
        this.nombre = "Disneyland";
        this.nAP = 0;
    }
   
    public Parque(String n){
        this.nombre = n;
        this.nAP = 0;
    }
    public void adiAtraccionParque(AtraccionParque x){
        AP[nAP] = x;
        nAP++;
    }
    public void mostrar(){
        System.out.println("\nParque: "+getNombre());
        System.out.println("N° de atracciones: "+getnAP());
        for (int i = 0; i < getnAP(); i++) {
            AP[i].mostrar();
        }
    }
    public void edadyestatura(){
        System.out.println("\nNiños mayores de 5 y con estatura mayor a 70 cm");
        for (int i = 0; i < getnAP(); i++) {
            AP[i].verificarniños();
        }
    }
    public void nombreParqueyNiño(){
        System.out.println("Niños con la Promocion: ");
        for (int i = 0; i < getnAP(); i++) {
            if(AP[i].ni[i].nombre.equals(nombre)){
                System.out.println("Padres del niño:"
                        +AP[i].ni[i].getNomPadre()+" y "+AP[i].ni[i].getNomMadre());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnAP() {
        return nAP;
    }

    public void setnAP(int nAP) {
        this.nAP = nAP;
    }

    public AtraccionParque[] getAP() {
        return AP;
    }

    public void setAP(AtraccionParque[] AP) {
        this.AP = AP;
    }
    
}
