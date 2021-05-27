package Turismo;

import Medicamento.Leer;

public class LugarTuristico implements java.io.Serializable{
	private String codigo;
	private String nombre;
	private String direccion;
	
	public LugarTuristico() {
		this.codigo = "CAP144";
		this.nombre = "Capilla Sixtina";
		this.direccion = "Vaticano";
	}

	public LugarTuristico(String codigo, String nombre, String direccion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public void leer() {
		System.out.println("Codigo lugar: ");
		setCodigo(Leer.dato());
		System.out.println("Nombre lugar: ");
		setNombre(Leer.dato());
		System.out.println("Direccion: ");
		setDireccion(Leer.dato());
	}
	
	public void mostrar() {
		System.out.println("Codigo lugar: "+getCodigo());
		System.out.println("Nombre lugar: "+getNombre());
		System.out.println("Direccion: "+getDireccion());
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
