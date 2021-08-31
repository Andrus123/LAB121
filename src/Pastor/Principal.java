package Pastor;



public class Principal {
	public static void main(String[] args){
		
		//Registro de empresa
		Empresa e1 = new Empresa();
		//e1.leer();
		e1.mostrar();	
		//Registro de Usuario
		Usuario u1 = new Usuario();
		//u1.leer();
		u1.mostrar();
		//Registro de Viaje
		Viaje v1 = new Viaje();
		v1.leer();
		v1.MedioTransporte();
		v1.mostrar();
	}
}
