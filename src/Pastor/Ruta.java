package Pastor;

public class Ruta {
	private String tipo;
	private String ruta;
	private String monitoreo;
	
	public Ruta() {
		this.tipo = "Out";
		this.ruta = "Carretera Norte";
		this.monitoreo = "Mapa Interactivo";
	}

	
	
	public Ruta(String tipo, String ruta, String monitoreo) {
		super();
		this.tipo = tipo;
		this.ruta = ruta;
		this.monitoreo = monitoreo;
	}

	public void leer() {
		System.out.println("Tipo: ");
		setTipo(Leer.dato());
		System.out.println("Ruta: ");
		setRuta(Leer.dato());
		System.out.println("Monitoreo: ");
		setMonitoreo(Leer.dato());
	}
	
	public void mostrar() {
		System.out.println("Tipo: "+getTipo());
		System.out.println("Ruta: "+getRuta());
		System.out.println("Monitoreo: "+getMonitoreo());
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getMonitoreo() {
		return monitoreo;
	}

	public void setMonitoreo(String monitoreo) {
		this.monitoreo = monitoreo;
	}
	
	
}
