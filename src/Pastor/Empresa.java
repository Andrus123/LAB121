package Pastor;

import java.io.Serializable;

public class Empresa implements Serializable{
	private String nomEmpresa;
	private int nroChoferes;
	private int nroVehiculos;
	private String tipoviaje;
	private Vehiculo[] v = new Vehiculo[50];
	private Chofer[] c = new Chofer[50];
	
	public Empresa() {
		this.nomEmpresa = "Bolivar";
		this.nroVehiculos = 4;
		this.nroChoferes = 1;
		this.tipoviaje = "Bus-Trip";
		for (int i = 0; i < nroVehiculos; i++) {
			v[i] = new Vehiculo();
		}
		for (int i = 0; i < nroChoferes; i++) {
			c[i] = new Chofer();
		}
	}

	public Empresa(String nomEmpresa, int nroVehiculos,int nroChoferes, String tipoviaje, Vehiculo[] v, Chofer[] c) {
		super();
		this.nomEmpresa = nomEmpresa;
		this.nroVehiculos = nroVehiculos;
		this.nroChoferes = nroChoferes;
		this.tipoviaje = tipoviaje;
		for (int i = 0; i < nroVehiculos; i++) {
			v[i] = new Vehiculo();
		}
		for (int i = 0; i < nroChoferes; i++) {
			c[i] = new Chofer();
		}
	}
	
	
	public void leer() {
		System.out.println("Nombre de la Empresa: ");
		setNomEmpresa(Leer.dato());
		System.out.println("N° de vehículos: ");
		setNroVehiculos(Leer.datoInt());
		System.out.println("N° de choferes: ");
		setNroChoferes(Leer.datoInt());	
		System.out.println("Tipo de Viajes: ");
		setTipoviaje(Leer.dato());
		System.out.println("Vehiculos: ");
		for (int i = 0; i < getNroVehiculos(); i++) {
			v[i].leer();
		}
		for (int i = 0; i <getNroChoferes(); i++) {
			c[i].leer();
		}
	}
	public void mostrar() {
		System.out.println("\nEmpresa: "+getNomEmpresa());
		System.out.println("# de Vehículos: "+getNroVehiculos());
		System.out.println("# de Choferes: "+getNroChoferes());
		System.out.println("Tipo de viajes: "+getTipoviaje());
		System.out.println("Vehiculos: ");
		for (int i = 0; i < getNroVehiculos(); i++) {
			v[i].mostrar();
		}
		for (int i = 0; i < getNroChoferes(); i++) {
			c[i].mostrar();
		}
	}
	
	public void adicionarVehiculo() {
		System.out.println("Adicionando Vehiculo...");
		v[getNroVehiculos()] = new Vehiculo();
		v[getNroVehiculos()].leer();
		this.nroVehiculos++;
	}
	
	public void adicionarChofer() {
		System.out.println("Adicionando chofer...");
		c[getNroChoferes()] = new Chofer();
		c[getNroChoferes()].leer();
		this.nroChoferes++;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}

	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}

	public int getNroVehiculos() {
		return nroVehiculos;
	}

	public void setNroVehiculos(int nroVehiculos) {
		this.nroVehiculos = nroVehiculos;
	}
	
	public int getNroChoferes() {
		return nroChoferes;
	}

	public void setNroChoferes(int nroChoferes) {
		this.nroChoferes = nroChoferes;
	}

	public Chofer[] getC() {
		return c;
	}

	public void setC(Chofer[] c) {
		this.c = c;
	}

	public String getTipoviaje() {
		return tipoviaje;
	}

	public void setTipoviaje(String tipoviaje) {
		this.tipoviaje = tipoviaje;
	}

	public Vehiculo[] getV() {
		return v;
	}

	public void setV(Vehiculo[] v) {
		this.v = v;
	}
	
	
}
