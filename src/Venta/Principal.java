package Venta;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException {
		try(Scanner sc = new Scanner(System.in)){
			ArchVenta archventa = new ArchVenta("ventas.dat");
			
			int op;
			do {
				System.out.println("\tMENU: "
						+"\n 1. CREAR Archivo de Ventas"
						+"\n 2. ADICIONAR Venta"
						+"\n 3. LISTAR Ventas"
						+"\n 4. NOMBRE DEL PRODUCTO CON MÁS VENTAS EN FECHA X"
						+"\n 5. PRODUCTO MAS RENTABLE"
						+"\n 6. Salir");
				op = sc.nextInt();
				switch(op) {
				case 1:
					archventa.Crear();
					break;
				case 2:
					archventa.Adicionar();
					break;
				case 3:
					archventa.Listar();
					break;
				case 4:
					System.out.println("Ingrese fecha: ");
					String x = sc.next();
					archventa.mayorventaFechaX(x);
					break;
				case 5:
					archventa.productoMayorGanancia();
					break;
				default:
					break;
				}
			}while(op!=6);
		}
	}
}
