package Medicamento;

public class CadenaFarm {
	private String nombre;
	private int nrofarm;
	private Farmacia[] F = new Farmacia[30];
	
	public CadenaFarm() {
		this.nombre = "MedifarmaLatam";
		this.nrofarm = 4;
		for (int i = 0; i < this.nrofarm; i++) {
			F[i] = new Farmacia(this.nombre,"Prado",2);
		}
	}

	public CadenaFarm(String nombre, int nrofarm) {
		super();
		this.nombre = nombre;
		this.nrofarm = nrofarm;
		for (int i = 0; i < this.nrofarm; i++) {
			F[i] = new Farmacia(this.nombre,"Av Central",2);
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
	public void cerrarSucursal(int x, int y) {
		int nm=0;
		for (int i = 0; i < getNrofarm(); i++) {
			if(x==(i+1)) {
				System.out.println("\nTraslado medicamentos a sucursal # "+y);
				nm = F[x-1].getNromedicamentos();
				F[y-1].trasladoMedicamentos(nm);
				F[y-1].trasladoarraymedicamentos(F[x-1], nm);
				F[y-1].mostrar();	
				System.out.println("\nEliminando medicamentos en sucursal # "+x);
				 F[x-1].eliminarMedicamentos();
				 F[x-1].mostrar();
			}
		}
	}
	
	public void mostrarJefe() {
		for (int i = 0; i < getNrofarm(); i++) {
			System.out.println("Jefe de Sucursal # "+(i+1));
			F[i].mostrarJefe();
		}
		
	}
	public void personalSucursalmenor() {
		int menor = 0;
		int suc = 0;
		menor = F[0].getP().getNropersonas();
		for (int i = 0; i < getNrofarm(); i++) {
			if(F[i].getP().getNropersonas() < menor) {
				menor = F[i].getP().getNropersonas();
				suc = i;
			}
		}
		System.out.println("\nSucursal con el menor personal: "+(suc+1)+" con "+menor+" empleados");
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
