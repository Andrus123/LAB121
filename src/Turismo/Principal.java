package Turismo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args)throws FileNotFoundException,IOException,ClassNotFoundException {
		
		try(Scanner sc = new Scanner(System.in)){
			ArchLugar archlugar = new ArchLugar("lugares.dat");
			ArchVis archvisita = new ArchVis("visitas.dat");
			
			int op;
			do {
				System.out.println("\tMENU: "
						+"\n 1.CREAR ARCH LUGAR"
						+"\n 2.ADICIONAR LUGAR"
						+"\n 3.LISTAR LUGARES"
						+"\n 4.CREAR ARCH VISITAS"
						+"\n 5.ADICIONAR VISITA"
						+"\n 6.LISTAR VISITAR"
						+"\n 7.LUGARES VISITADOS POR X"
						+"\n 8.Salir");
				op = sc.nextInt();
				switch(op) {
				case 1:
					archlugar.Crear();
					break;
				case 2:
					archlugar.Adicionar();
					break;
				case 3:
					archlugar.Listar();
					break;
				case 4:
					archvisita.Crear();
					break;
				case 5:
					archvisita.Adicionar();
					break;
				case 6:
					archvisita.Listar();
					break;
				case 7:
					System.out.println("Ingrese nombre del visitante: ");
					String x = sc.next();
					String cod = archvisita.LugaresvisitadosporVisX(x);
					archlugar.LugaresvisitadosporVisX(cod);
				default:
					break;
				}
			}while(op!=8);
			
		}
	}
}
