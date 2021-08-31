package Pastor;

import java.io.Serializable;

public class Cuenta implements Serializable{
	protected int ci;
	protected String nombre;
	protected String correo;
	protected String contraseña;
	
	public Cuenta() {
		this.ci = 124513;
		this.nombre = "Andrés Aquin";
		this.correo = "AndyKee37@gmail.com";
		this.contraseña = "4354abc";
	}

	public Cuenta(int ci, String nombre, String correo, String contraseña) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.correo = correo;
		this.contraseña = contraseña;
	}
	
	public void leer() {
		System.out.println("Ingrese CI: ");
		setCi(Leer.datoInt());
		System.out.println("Ingrese Nombre: ");
		setNombre(Leer.dato());
		System.out.println("Ingrese Correo: ");
		setCorreo(Leer.dato());
		System.out.println("Ingrese Contraseña: ");
		setContraseña(Leer.dato());
	}
	public void mostrar() {
		System.out.println("CI: "+getCi());
		System.out.println("Nombre: "+getNombre());
		System.out.println("Correo: "+getCorreo());
		System.out.println("Contraseña: "+getContraseña());
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
