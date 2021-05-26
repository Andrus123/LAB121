package Medicamento;


public class Farmacia implements java.io.Serializable {
	private int NroSucursal;
	private String nombre; 
	private String direccion;
	private int nromedicamentos;
	private Medicamento[] M = new Medicamento[100];
	private Personal P;
	
	public Farmacia() {
		this.NroSucursal = 1;
		this.nombre = "Farmacias Bolivia";
		this.direccion = "Av. Mariscal Santa Cruz";
		this.P = new Personal();
		this.nromedicamentos = 3;
		for (int i = 0; i < this.nromedicamentos; i++) {
			if(i%2==0) {
			M[i] = new Pastilla("Antigripal",560);
			}
			if(i%2!=0) {
			M[i] = new Jarabe("paraTos",750);	
			}
		}
	}

	public Farmacia(String nombre, String direccion, int nromedicamentos) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.P = new Personal();
		this.nromedicamentos = nromedicamentos;
		for (int i = 0; i < this.nromedicamentos; i++) {
			if(i%2==0) {
			M[i] = new Pastilla("Antigripal",560);
			}
			if(i%2!=0) {
			M[i] = new Jarabe("paraTos",750);	
			}
		}
	}
	public void leer() {
		System.out.println("N° de Sucursal: ");
		setNroSucursal(Leer.datoInt());
		System.out.println("Direccion: ");
		setDireccion(Leer.dato());
		System.out.println("N° de medicamentos: ");
		setNromedicamentos(Leer.datoInt());
		for (int i = 0; i < getNromedicamentos(); i++) {
			M[i].leer();
		}
	}
	
	public void mostrar() {
		System.out.println("\nFarmacia: "+getNombre());
		System.out.println("N° de sucursal: "+getNroSucursal());
		System.out.println("Direccion: "+getDireccion());
		System.out.println("Personal: ");
		this.P.mostrar();
		System.out.println("N° de medicamentos: "+getNromedicamentos());
		for (int i = 0; i < getNromedicamentos(); i++) {
			M[i].mostrar();
		}
	}
	public void medResfri() {
		System.out.println("\nMedicamentos para resfríos: ");
		for (int i = 0; i < this.nromedicamentos; i++) {
			if(M[i].getTipo().equals("Antigripal")) {
				M[i].mostrar();
			}
		}
	}
	public void medTos() {
		System.out.println("\nMedicamentos para tos con el menor precio: ");
		for (int i = 0; i < getNromedicamentos(); i++) {
			if(M[i].getTipo().equals("paraTos")) {
				M[i].mostrar();
			}
		}
	}
	public String buscarMed(String x){
		String y = "no";
		for (int i = 0; i < getNromedicamentos(); i++) {
			if(M[i].getNombre().equals(x)) {
				return y = "si";
			}
		}
		return y;
	}
	
	public void BuscarTos() {
		for (int i = 0; i < getNromedicamentos(); i++) {
			if(M[i].getTipo().equals("paraTos")) {
				M[i].mostrar();
			}
		}
	}
	public void eliminarMedicamentos() {
		setNromedicamentos(0);
	}
	public void trasladoMedicamentos(int nromedtras) {
		setNromedicamentos(this.nromedicamentos + nromedtras);
	}
	public void trasladoarraymedicamentos(Farmacia x, int n) {
		for (int i = 0; i < getNromedicamentos(); i++) {
			for (int j = 0; j < x.nromedicamentos; j++) {
				if(i>=(getNromedicamentos()-n)) {
					M[i] = x.M[j];
				}
			}
		}
	}
	
	public void mostrarJefe() {
		P.mostrarJefe();
	}
	public void anadirMed() {
		M[getNromedicamentos()] = new Medicamento();
		M[getNromedicamentos()].leer();
		this.nromedicamentos++;
	}
	
	public int getNroSucursal() {
		return NroSucursal;
	}

	public void setNroSucursal(int nroSucursal) {
		NroSucursal = nroSucursal;
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

	public int getNromedicamentos() {
		return nromedicamentos;
	}

	public void setNromedicamentos(int nromedicamentos) {
		this.nromedicamentos = nromedicamentos;
	}

	public Medicamento[] getM() {
		return M;
	}

	public void setM(Medicamento[] m) {
		M = m;
	}

	public Personal getP() {
		return P;
	}

	public void setP(Personal p) {
		P = p;
	}
	
	
	
}
