package ClasePersistencia;

import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ArchRopa a1 = new ArchRopa("ropa.dat");
		//a1.Crear();
		a1.Adicionar();
		a1.Listar();
		//B) Determinar la cantidad de ropa de marca X
		System.out.println("\nn° de ropas de marca: " + a1.contarRopaMarca("Adidas"));
	}
}
