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
public class Neumatico {
    private String marca;
    private int nroAro;
    private Double precio;
    
    public Neumatico(){
        this.marca = "Michellin";
        this.nroAro = 15;
        this.precio = 270.50;
    }

    public Neumatico(String marca, int nroAro, Double precio) {
        this.marca = marca;
        this.nroAro = nroAro;
        this.precio = precio;
    }
    
    public void Mostrar(){
        System.out.println("Marca: "+getMarca());
        System.out.println("N° de Aro: "+getNroAro());
        System.out.println("Precio: "+getPrecio());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNroAro() {
        return nroAro;
    }

    public void setNroAro(int nroAro) {
        this.nroAro = nroAro;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
}
