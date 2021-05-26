package Medicamento;

public class Personal implements java.io.Serializable {
	private int nropersonas;
	private String[][] P = new String[40][2];
	
	public Personal() {
		this.nropersonas = 2;
		this.P[0][0]="Carlos Fernandez"; this.P[0][1]="Jefe de Personal";
		this.P[1][0]="Juan Campero"; this.P[1][1]="Gerente en Ventas";
	}

	public Personal(int nropersonas, String[][] p) {
		super();
		this.nropersonas = nropersonas;
		P = p;
	}
	public void mostrar() {
		System.out.println("N° de empleados "+getNropersonas());
		for (int i = 0; i < getNropersonas(); i++){
			System.out.println(P[i][0]+" - "+P[i][1]);
		}
	}
	public void mostrarJefe() {
		for (int i = 0; i < getNropersonas(); i++) {
			if(P[i][1]=="Jefe de Personal") {
				System.out.println(P[i][0]);
			}
		}
	}

	public int getNropersonas() {
		return nropersonas;
	}

	public void setNropersonas(int nropersonas) {
		this.nropersonas = nropersonas;
	}

	public String[][] getP() {
		return P;
	}

	public void setP(String[][] p) {
		P = p;
	}
	
}
