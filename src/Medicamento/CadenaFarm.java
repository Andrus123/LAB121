package Medicamento;

public class CadenaFarm {
	private String nombre;
	private int nrofarm;
	private Farmacia[] F = new Farmacia[30];
	
	public CadenaFarm() {
		this.nombre = "MedifarmaLatam";
		this.nrofarm = 2;
		for (int i = 0; i < this.nrofarm; i++) {
			F[i] = new Farmacia();
		}
	}

	public CadenaFarm(String nombre, int nrofarm) {
		super();
		this.nombre = nombre;
		this.nrofarm = nrofarm;
		for (int i = 0; i < this.nrofarm; i++) {
			F[i] = new Farmacia();
		}
	}
	public void mostrar() {
		System.out.println("\nCadena de Farmacias: "+getNombre());
		System.out.println("N° de farmacias: "+getNrofarm());
		System.out.println("Farmacias: ");
		for (int i = 0; i < getNrofarm(); i++) {
			System.out.println("\nSucursal: "+(i+1));
			F[i].mostrar();
		}
	}
	public void tosSucursal(int n) {
		System.out.println("\nBuscando medicamento para la tos en Sucursal: "+n);
		for (int i = 0; i < getNrofarm(); i++) {
			if(n==(i+1)) {
				F[i].BuscarTos();
			}
		}
	}
	public void anadirMed(int n) {
		System.out.println("\nAnadiendo Medicamento en sucursal N° "+n);
		for (int i = 0; i < getNrofarm(); i++) {
			if(n==(i+1)) {
				F[i].anadirMed();
				System.out.println("-Medicamento anadido-");
				F[i].mostrar();
			}
		}
	}
	public void mostrarJefe() {
		for (int i = 0; i < getNrofarm(); i++) {
			System.out.println("Jefe de Sucursal # "+i);
			F[i].mostrarJefe();
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNrofarm() {
		return nrofarm;
	}

	public void setNrofarm(int nrofarm) {
		this.nrofarm = nrofarm;
	}

	public Farmacia[] getF() {
		return F;
	}

	public void setF(Farmacia[] f) {
		F = f;
	}
	
	
}
