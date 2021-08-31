package Pastor;

import java.io.Serializable;

public class Chofer extends Cuenta implements Serializable{
	private int añosExp;
	private int reputación;
	
	public Chofer(){
		super();
		this.ci = 322462;
		this.nombre = "Carlos Fernandez";
		this.correo = "carlosf@gmail.com";
		this.contraseña = "43534sdf";
		this.añosExp = 4;
		this.reputación = 7;
	}

	public Chofer(int ci, String nombre, String correo, String contraseña, int añosExp, int reputación) {
		super(ci, nombre, correo, contraseña);
		this.añosExp = añosExp;
		this.reputación = reputación;
	}
	
	public void leer() {
		System.out.println("Chofer: ");
		super.leer();
		System.out.println("Años de experiencia: ");
		setAñosExp(Leer.datoInt());
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Años de experiencia: "+getAñosExp());
	}

	public int getAñosExp() {
		return añosExp;
	}

	public void setAñosExp(int añosExp) {
		this.añosExp = añosExp;
	}

	public int getReputación() {
		return reputación;
	}

	public void setReputación(int reputación) {
		this.reputación = reputación;
	}
	
}
