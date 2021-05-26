package Medicamento;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Probandoarchfarm {
	public static void main(String[] args)throws FileNotFoundException,IOException, ClassNotFoundException {
		System.out.println("\nEJERCICIO PERSISTENCIA #2");
        try (Scanner sc = new Scanner(System.in)) {
        	ArchFarm archfarm = new ArchFarm("farmacias.dat");
        	int op;
        	do {
        		System.out.println("\tMENU"
        				+"\n 1.CREAR "
        				+"\n 2.ADICIONAR "
        				+"\n 3.LISTAR "
        				+"\n 4.MEDICAMENTOS PARA TOS DE LA SUCURSAL 1"
        				+"\n 5.DIRECCION SUCURSAL POR MEDICAMENTO"
        				+"\n 6. Salir");
        		op = sc.nextInt();
        		switch(op) {
        		case 1:
        			archfarm.Crear();
        			break;
        		case 2:
        			archfarm.Adicionar();
        			break;
        		case 3:
        			archfarm.Listar();
        			break;
        		case 4:
        			System.out.println("Ingrese la sucursal: ");
        			int x = sc.nextInt();
        			archfarm.meditosSucursalnumber(x);
        			break;
        		case 5:
        			archfarm.sucursaldirxnmed("Golpex");
        		default:
        			break;
        		}
        	} while (op!=6);
        }
	}
}
