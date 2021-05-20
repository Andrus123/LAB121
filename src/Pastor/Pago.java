package Pastor;

public class Pago {
	private String moneda;
	private int ticket;
	private double monto;
	
	public Pago() {
		this.moneda = "Bs.";
		this.ticket = 12613;
		this.monto = 90.70;
	}

	public Pago(String moneda, int ticket, double monto) {
		super();
		this.moneda = moneda;
		this.ticket = ticket;
		this.monto = monto;
	}
	
	public void leer() {
		System.out.println("moneda: ");
		setMoneda(Leer.dato());
		System.out.println("ticket: ");
		setTicket(Leer.datoInt());
		System.out.println("monto: ");
		setMonto(Leer.datoDouble());
	}
	
	public void mostrar() {
		System.out.println("moneda: "+getMoneda());
		System.out.println("ticket: "+getTicket());
		System.out.println("monto: "+getMonto());
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
}
