package Turismo;

public class Visita implements java.io.Serializable{
	private String fecha;
	private String codigo;
	private String nombreVisitante;
	
	public Visita() {
		this.fecha = "12/8/2021";
		this.codigo = "CAP144";
		this.nombreVisitante = "Peter Parker";
	}

	public Visita(String fecha, String codigo, String nombreVisitante) {
		super();
		this.fecha = fecha;
		this.codigo = codigo;
		this.nombreVisitante = nombreVisitante;
	}
	
	public void leer() {
		System.out.println("Fecha: ");
		setFecha(Leer.dato());
		System.out.println("Codigo visita: ");
		setCodigo(Leer.dato());
		System.out.println("Nombre visitante: ");
		setNombreVisitante(Leer.dato());
	}
	
	public void mostrar() {
		System.out.println("Fecha: "+getFecha());
		System.out.println("Codigo visita: "+getCodigo());
		System.out.println("Nombre visitante: "+getNombreVisitante());
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreVisitante() {
		return nombreVisitante;
	}

	public void setNombreVisitante(String nombreVisitante) {
		this.nombreVisitante = nombreVisitante;
	}
	
	
}
