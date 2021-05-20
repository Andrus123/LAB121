package ClasePersistencia;

import java.util.Scanner;

public class RegRopa implements java.io.Serializable{
	private String codigo;
	private String nombre;
	private String talla;
	private String marca;
	private double precio;
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("codigo - nombre - talla - marca - precio");
		this.codigo = lee.next();
		this.nombre = lee.next();
		this.talla = lee.next();
		this.marca = lee.next();
		this.precio = lee.nextDouble();
	}
	
	public void mostrar() {
		System.out.println("codigo: "+ this.codigo);
		System.out.println("nombre: "+ this.nombre);
		System.out.println("talla: "+ this.talla);
		System.out.println("marca: "+ this.marca);
		System.out.println("precio: "+ this.precio);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
