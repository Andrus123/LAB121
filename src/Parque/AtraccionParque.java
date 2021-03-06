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
public class AtraccionParque {
    private String nombre;
    private int nnios;
    Ninio[]ni = new Ninio[30]; 
    
    public AtraccionParque(){
        this.nombre = "Tobogan";
        this.nnios = 0;
    }
    public AtraccionParque(String nom){
        this.nombre = nom;
        this.nnios = 0;
    }
    public void adiNinio(Ninio x, Ninio y, Ninio z){
        ni[nnios] = x;
        nnios++;
        ni[nnios] = y;
        nnios++;
        ni[nnios] = z;
        nnios++;
    }
    public void mostrar(){
        System.out.println("\nAtraccion: "+getNombre());
        System.out.println("N° de Niños: "+getNnios());
        for (int i = 0; i < getNnios(); i++) {
            ni[i].mostrar();
        }
    }
    public void verificarninios(){
        for (int i = 0; i < getNnios(); i++) {
            if(getNi()[i].edad>5 && getNi()[i].getE().getTamanio()>70){
                ni[i].mostrar();
            }
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNnios() {
        return nnios;
    }

    public void setNnios(int nnios) {
        this.nnios = nnios;
    }

    public Ninio[] getNi() {
        return ni;
    }

    public void setNi(Ninio[] ni) {
        this.ni = ni;
    }
}
