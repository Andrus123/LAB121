package Persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		try (Scanner sc = new Scanner(System.in)) {
			ArchJuego arch = new ArchJuego("datos.dat");
			
			int op;
			do {
				System.out.println("\tMENU"
								+"\n 1.CREAR "
								+"\n 2.ADICIONAR "
								+"\n 3.LISTAR "
								+"\n 4.LISTAR POR AÑO"
								+"\n 5. Salir");
				op = sc.nextInt();
				switch(op) {
					case 1:
						arch.crear();
						break;
					case 2:
						arch.adicionar();
						break;
					case 3:
						arch.listar();
						break;
					case 4:
					System.out.println("Ingrese el año");
					String x = sc.next();
						arch.mostrarJuegoX(x);
						break;
					default:
						break;
				}
			} while (op!=5);
			//arch.crear();
			//arch.agregar();
//		arch.agregar();
			arch.listar();
		}
	}
}
