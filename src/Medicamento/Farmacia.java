package Medicamento;


public class Farmacia {
	private String nombre; 
	private String direccion;
	private int nromedicamentos;
	private Medicamento[] M = new Medicamento[100];
	
	public Farmacia() {
		this.nombre = "Farmacias Bolivia";
		this.direccion = "Av. Mariscal Santa Cruz";
		this.nromedicamentos = 3;
		for (int i = 0; i < this.nromedicamentos; i++) {
			if(i%2==0) {
			M[i] = new Pastilla("Antigripal",560);
			}
			if(i%2!=0) {
			M[i] = new Jarabe("Para tos",750);	
			}
		}
	}

	public Farmacia(String nombre, String direccion, int nromedicamentos) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.nromedicamentos = nromedicamentos;
		for (int i = 0; i < this.nromedicamentos; i++) {
			if(i%2==0) {
			M[i] = new Pastilla("Antigripal",560);
			}
			if(i%2!=0) {
			M[i] = new Jarabe("Para tos",750);	
			}
		}
	}
	
	public void mostrar() {
		System.out.println("\nFarmacia: "+getNombre());
		System.out.println("Direccion: "+getDireccion());
		System.out.println("N� de medicamentos: "+getNromedicamentos());
		for (int i = 0; i < getNromedicamentos(); i++) {
			M[i].mostrar();
		}
	}
	public void medResfri() {
		System.out.println("\nMedicamentos para resfr�os: ");
		for (int i = 0; i < this.nromedicamentos; i++) {
			if(M[i].getTipo().equals("Antigripal")) {
				M[i].mostrar();
			}
		}
	}
	public void medTos() {
		System.out.println("\nMedicamentos para tos con el menor precio: ");
		for (int i = 0; i < getNromedicamentos(); i++) {
			if(M[i].getTipo().equals("Para tos")) {
				M[i].mostrar();
			}
		}
	}
	
	public void BuscarTos() {
		for (int i = 0; i < getNromedicamentos(); i++) {
			if(M[i].getTipo()=="Para tos") {
				M[i].mostrar();
			}
		}
	}
	public void anadirMed() {
		M[getNromedicamentos()] = new Medicamento();
		M[getNromedicamentos()].leer();
		this.nromedicamentos++;
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
	
	
	
}