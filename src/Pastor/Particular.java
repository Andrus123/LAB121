package Pastor;

public class Particular extends Chofer{
	private int puntaje;
	private Vehiculo v;
	
	public Particular() {
		super();
		this.nombre = "Juan Perez";
		this.ci = 12125;
		this.correo = "JuanP@gmail.com";
		this.puntaje = 7;
		v = new Vehiculo("TXR123","Juan Perez", 4,"Toyota","Corolla");
	}

	public Particular(int ci, String nombre, String correo, String contraseña, int añosExp, int reputación, int puntaje,
			Vehiculo v) {
		super(ci, nombre, correo, contraseña, añosExp, reputación);
		this.puntaje = puntaje;
		this.v = v;
	}
	
	public void leer() {
		System.out.println("\n-Particular-");
		super.leer();
		System.out.println("Puntaje: ");
		setPuntaje(Leer.datoInt());
		System.out.println("Vehiculo Particular: ");
		v.leer();
	}
	public void mostrar() {
		System.out.println("\n-Particular-");
		super.mostrar();
		System.out.println("Puntaje: "+getPuntaje());
		v.mostrar();
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public Vehiculo getV() {
		return v;
	}

	public void setV(Vehiculo v) {
		this.v = v;
	}
	
	
	
}
