/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

/**
 *
 * @author Andrés Aquin
 */
public class Sala {
    private int nroPersonas;
    private String nombre;
    private String tipo;

    public Sala(int nroPersonas, String nombre, String tipo) {
        this.nroPersonas = nroPersonas;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override //Metodo para imprimir los atributos
    public String toString() {
        return "Sala[nombre="+ nombre + ", nroPersonas= " + nroPersonas +", tipo=" + tipo + ']';
    }    
//    public void mostrar(){
//        System.out.println("");
//    }
}
