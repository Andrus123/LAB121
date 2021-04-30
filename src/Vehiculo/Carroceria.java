/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author Andrés Aquin
 */
public class Carroceria {
    private int nroVentanas;
    private int nroPuertas;
    private String color;
    
    public Carroceria(){
        this.nroVentanas = 6;
        this.nroPuertas = 4;
        this.color = "verde";
    }

    public Carroceria(int nroVentanas, int nroPuertas, String color) {
        this.nroVentanas = nroVentanas;
        this.nroPuertas = nroPuertas;
        this.color = color;
    }
    public void Mostrar(){
        System.out.println("\nColor: "+ getColor());
        System.out.println("N° de Ventadas: "+ getNroVentanas());
        System.out.println("N° de Puertas: "+ getNroPuertas());
    }

    public int getNroVentanas() {
        return nroVentanas;
    }

    public void setNroVentanas(int nroVentanas) {
        this.nroVentanas = nroVentanas;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
