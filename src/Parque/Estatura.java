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
public class Estatura {
    private int tamaño;
    
    public Estatura(){
        this.tamaño = 1;
    }

    public Estatura(int tam) {
        this.tamaño = tam;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tam) {
        this.tamaño = tam;
    }
    public void mostrar(){
        System.out.println("Tamaño: "+getTamaño());
    }
}
