package Persistencia;

import java.io.Serializable;
import java.util.Scanner;

public class Juego implements Serializable{
	private String nombre, fechaCreacion;
	
	Juego()
	{
		nombre = "Minecreaft";
		fechaCreacion = "2008";
	}
	
	public void mostrar() {
		System.out.println("Juego: "+getNombre()+" - "+" Fecha de Creacion: "+getFechaCreacion());
	}
	void leer()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre: ");
		nombre = sc.next();
		System.out.println("Intro Fecha");
		fechaCreacion = sc.next();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
}
