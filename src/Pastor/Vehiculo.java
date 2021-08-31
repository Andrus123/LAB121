package Pastor;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	private String licencia;
	private String dueño;
	private int capacidad;
	private String marca;
	private String modelo;
	
	public Vehiculo() {
		this.licencia = "1234XTR";
		this.dueño = "Jhon Smith";
		this.capacidad = 5;
		this.marca = "Suzuki";
		this.modelo = "Jimmy2";
	}

	public Vehiculo(String licencia, String dueño, int capacidad, String marca, String modelo) {
		super();
		this.licencia = licencia;
		this.dueño = dueño;
		this.capacidad = capacidad;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void leer() {
		System.out.println("Ingrese Licencia: ");
		setLicencia(Leer.dato());
		System.out.println("Ingrese Dueño del Vehículo: ");
		setDueño(Leer.dato());
		System.out.println("Ingrese Capacidad del Vehículo: ");
		setCapacidad(Leer.datoInt());
		System.out.println("Ingrese Marca del Vehiculo: ");
		setMarca(Leer.dato());
		System.out.println("Ingrese Modelo del Vehiculo: ");
		setModelo(Leer.dato());
	}
	
	public void mostrar() {
		System.out.println("\nLicencia: "+getLicencia());
		System.out.println("Dueño: "+getDueño());
		System.out.println("Capacidad: "+getCapacidad());
		System.out.println("Marca: "+getMarca());
		System.out.println("Modelo: "+getModelo());
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
