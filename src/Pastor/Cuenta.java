package Pastor;

import java.io.Serializable;

public class Cuenta implements Serializable{
	protected int ci;
	protected String nombre;
	protected String correo;
	protected String contrase�a;
	
	public Cuenta() {
		this.ci = 124513;
		this.nombre = "Andr�s Aquin";
		this.correo = "AndyKee37@gmail.com";
		this.contrase�a = "4354abc";
	}

	public Cuenta(int ci, String nombre, String correo, String contrase�a) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.correo = correo;
		this.contrase�a = contrase�a;
	}
	
	public void leer() {
		System.out.println("Ingrese CI: ");
		setCi(Leer.datoInt());
		System.out.println("Ingrese Nombre: ");
		setNombre(Leer.dato());
		System.out.println("Ingrese Correo: ");
		setCorreo(Leer.dato());
		System.out.println("Ingrese Contrase�a: ");
		setContrase�a(Leer.dato());
	}
	public void mostrar() {
		System.out.println("CI: "+getCi());
		System.out.println("Nombre: "+getNombre());
		System.out.println("Correo: "+getCorreo());
		System.out.println("Contrase�a: "+getContrase�a());
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
}
