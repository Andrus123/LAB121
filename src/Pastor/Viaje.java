package Pastor;

public class Viaje {
	private String tipo;
	private String destino;
	private double tarifa;
	private Pago p;
	private Ruta r;
	
	public Viaje() {
		this.tipo = "Outcity";
		this.destino = "Cochabamba";
		this.tarifa = 80.50;
		p = new Pago();
		r = new Ruta();
	}

	public Viaje(String tipo, String destino, double tarifa, Pago p, Ruta r) {
		super();
		this.tipo = tipo;
		this.destino = destino;
		this.tarifa = tarifa;
		this.p = p;
		this.r = r;
	}
	
	public void leer() {
		System.out.println("Tipo de Viaje : Out(FUERA DE LA URBE)/ In(DENTRO DE LA URBE)");
		setTipo(Leer.dato());
		System.out.println("Destino: ");
		setDestino(Leer.dato());
		System.out.println("Tarifa: ");
		setTarifa(Leer.datoDouble());
		System.out.println("RUTA: ");
		r.leer();
		System.out.println("PAGO: ");
		p.leer();
	}
	
	public void mostrar() {
		System.out.println("Tipo de viaje: "+getTipo());
		System.out.println("DESTINO: "+getDestino());
		System.out.println("TARIFA: "+getTarifa());
		r.mostrar();
		p.mostrar();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public Pago getP() {
		return p;
	}

	public void setP(Pago p) {
		this.p = p;
	}

	public Ruta getR() {
		return r;
	}

	public void setR(Ruta r) {
		this.r = r;
	}
	
	
}
