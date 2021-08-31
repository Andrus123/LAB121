/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupo;

import Juego.Leer;

/**
 *
 * @author andru
 */
public class Grupos {
    private String nombreGrupo;
    private int nroIntegrantes;
    private String [] nom = new String [50];
    private String [] edad = new String [50];
    
    public Grupos(){
        this.nombreGrupo = "Bolivar";
        this.nroIntegrantes = 7;
        this.nom[0] = "Jhon";
        this.nom[1] = "Carlo";
        this.nom[2] = "Lucia";
        this.nom[3] = "Andres";
        this.nom[4] = "Luis";
        this.nom[5] = "Paola";
        this.nom[6] = "Lorena";
        
        this.edad[0] = "23";
        this.edad[1] = "21";
        this.edad[2] = "22";
        this.edad[3] = "18";
        this.edad[4] = "32";
        this.edad[5] = "45";
        this.edad[6] = "24";
    }

    public Grupos(String nombreGrupo, int nroIntegrantes) {
        this.nombreGrupo = nombreGrupo;
        this.nroIntegrantes = nroIntegrantes;
        this.nom[0] = "Juan";
        this.nom[1] = "Pedro";
        this.nom[2] = "Maria";
        this.nom[3] = "Pepe";
        this.nom[4] = "Jhon";
        this.nom[5] = "Marce";
        this.nom[6] = "Kelly";
        this.nom[7] = "Andrea";
        
        this.edad[0] = "23";
        this.edad[1] = "23";
        this.edad[2] = "23";
        this.edad[3] = "23";
        this.edad[4] = "23";
        this.edad[5] = "23";
        this.edad[6] = "23";
        this.edad[7] = "23";
    }
    

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public int getNroIntegrantes() {
        return nroIntegrantes;
    }

    public void setNroIntegrantes(int nroIntegrantes) {
        this.nroIntegrantes = nroIntegrantes;
    }

    public String[] getNom() {
        return nom;
    }

    public void setNom(String[] nom) {
        this.nom = nom;
    }

    public String[] getEdad() {
        return edad;
    }

    public void setEdad(String[] edad) {
        this.edad = edad;
    }
    public void leer(){
        System.out.println("Cantidad de integrantes");
        this.nroIntegrantes= Leer.datoInt();
    }
    public void mostrar(){
        System.out.println("Grupo :" + this.nombreGrupo);
        for(int i=0; i <= this.nroIntegrantes; i++){
        System.out.println("Integrante: " + this.nom[i]);    
        }
    }
    public void dividir(Grupos g1, Grupos g2){
        for(int i=0; i<(this.nroIntegrantes)/2;i++){
            System.out.println("Integrante: " + this.nom[i]);
           
        }
        for(int j=0; j<g1.nroIntegrantes;j++){
            System.out.println("Nuevo integrante: " + g2.nom[j]);
        }
    }
    
}
