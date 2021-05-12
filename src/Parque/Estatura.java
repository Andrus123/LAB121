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
    private int tamanio;
    
    public Estatura(){
        this.tamanio = 100;
    }

    public Estatura(int tam) {
        this.tamanio = tam;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tam) {
        this.tamanio = tam;
    }
    public void mostrar(){
        System.out.println("Tamaño: "+getTamanio());
    }
}
