package Pastor;

import java.io.Serializable;

public class Chofer extends Cuenta implements Serializable{
	private int a�osExp;
	private int reputaci�n;
	
	public Chofer(){
		super();
		this.ci = 322462;
		this.nombre = "Carlos Fernandez";
		this.correo = "carlosf@gmail.com";
		this.contrase�a = "43534sdf";
		this.a�osExp = 4;
		this.reputaci�n = 7;
	}

	public Chofer(int ci, String nombre, String correo, String contrase�a, int a�osExp, int reputaci�n) {
		super(ci, nombre, correo, contrase�a);
		this.a�osExp = a�osExp;
		this.reputaci�n = reputaci�n;
	}
	
	public void leer() {
		System.out.println("Chofer: ");
		super.leer();
		System.out.println("A�os de experiencia: ");
		setA�osExp(Leer.datoInt());
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("A�os de experiencia: "+getA�osExp());
	}

	public int getA�osExp() {
		return a�osExp;
	}

	public void setA�osExp(int a�osExp) {
		this.a�osExp = a�osExp;
	}

	public int getReputaci�n() {
		return reputaci�n;
	}

	public void setReputaci�n(int reputaci�n) {
		this.reputaci�n = reputaci�n;
	}
	
}
