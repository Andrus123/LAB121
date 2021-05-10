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
    Niño N1;
    Niño N2;
    Niño N3;
    
    public AtraccionParque(){
        this.nombre = nombre;
    }

    public AtraccionParque(String nombre) {
        this.nombre = nombre;
    }
    
    
    public AtraccionParque(Niño n1, Niño n2, Niño n3){
        this.nombre = "Salas VR";
        N1 = n1;
        N2 = n2;
        N3 = n3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Niño getN1() {
        return N1;
    }

    public void setN1(Niño N1) {
        this.N1 = N1;
    }

    public Niño getN2() {
        return N2;
    }

    public void setN2(Niño N2) {
        this.N2 = N2;
    }

    public Niño getN3() {
        return N3;
    }

    public void setN3(Niño N3) {
        this.N3 = N3;
    }
    
    public void mostrar(){
        System.out.println("Atraccion: "+getNombre());
        System.out.println("Niños: ");
        N1.mostrar();
        N2.mostrar();
        N3.mostrar();
    }
}
