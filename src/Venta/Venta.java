package Venta;

import java.util.Scanner;

public class Venta implements java.io.Serializable{
	private String cod;
	private String nombre;
	private double precio;
	private String fechapre;
	private int cantidad;
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Ingrese codigo: ");
		this.cod = lee.next();
		System.out.println("Ingrese nombre del electrodoméstico: ");
		this.nombre = lee.next();
		System.out.println("Ingrese precio: ");
		this.precio = lee.nextDouble();
		System.out.println("Ingrese fecha de preventa");
		this.fechapre = lee.next();
		System.out.println("Ingrese la cantidad: ");
		this.cantidad = lee.nextInt();
	}
	
	public void mostrar() {
		System.out.println("| "+this.cod+" | "+this.nombre+" | "+this.precio+" | "
		+this.fechapre+" | "+this.cantidad);
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
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

	public String getFechapre() {
		return fechapre;
	}

	public void setFechapre(String fechapre) {
		this.fechapre = fechapre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
