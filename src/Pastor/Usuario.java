package Pastor;

public class Usuario extends Cuenta{
	private int puntos;
	
	
	public Usuario() {
		super();
		this.ci = 12355;
		this.nombre = "Mauren Quiroga";
		this.correo = "maurenquiroga@gmail.com";
		this.contraseña = "2141vmt";
		this.puntos = 15;
	}


	public Usuario(int ci, String nombre, String correo, String contraseña, int puntos) {
		super(ci, nombre, correo, contraseña);
		this.puntos = puntos;
	}
	
	public void leer() {
		System.out.println("Usuario: ");
		super.leer();
		System.out.println("Puntos: ");
		setPuntos(Leer.datoInt());
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Puntos: "+getPuntos());
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
	
	
}
