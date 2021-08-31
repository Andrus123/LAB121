package Pastor;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	private String licencia;
	private String due�o;
	private int capacidad;
	private String marca;
	private String modelo;
	
	public Vehiculo() {
		this.licencia = "1234XTR";
		this.due�o = "Jhon Smith";
		this.capacidad = 5;
		this.marca = "Suzuki";
		this.modelo = "Jimmy2";
	}

	public Vehiculo(String licencia, String due�o, int capacidad, String marca, String modelo) {
		super();
		this.licencia = licencia;
		this.due�o = due�o;
		this.capacidad = capacidad;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void leer() {
		System.out.println("Ingrese Licencia: ");
		setLicencia(Leer.dato());
		System.out.println("Ingrese Due�o del Veh�culo: ");
		setDue�o(Leer.dato());
		System.out.println("Ingrese Capacidad del Veh�culo: ");
		setCapacidad(Leer.datoInt());
		System.out.println("Ingrese Marca del Vehiculo: ");
		setMarca(Leer.dato());
		System.out.println("Ingrese Modelo del Vehiculo: ");
		setModelo(Leer.dato());
	}
	
	public void mostrar() {
		System.out.println("\nLicencia: "+getLicencia());
		System.out.println("Due�o: "+getDue�o());
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

	public String getDue�o() {
		return due�o;
	}

	public void setDue�o(String due�o) {
		this.due�o = due�o;
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
