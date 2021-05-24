/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicamento;

/**
 *
 * @author Andrés Aquin
 */
public class Medicamento implements java.io.Serializable{
    protected String nombre;
    protected double precio;
    protected int cantidad;
    protected String tipo;
    
    public Medicamento(){
        this.nombre = "Parecetamol";
        this.precio = 10.5;
        this.cantidad = 7;
        this.tipo = "Painkiller";
    }

    public Medicamento(String nombre, double precio, int cantidad,String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void leer(){
        System.out.println("Nombre del medicamento: ");
        setNombre(Leer.dato());
        System.out.println("Precio: ");
        setPrecio(Leer.datoDouble());
        System.out.println("Cantidad: ");        
        setCantidad(Leer.datoInt());    
    }
    public void mostrar(){
        System.out.println("Medicamento: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Tipo: "+getTipo());
    }
}
