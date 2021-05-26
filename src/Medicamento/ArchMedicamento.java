package Medicamento;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import Persistencia.AddObjectOutputStream;

public class ArchMedicamento {
	private String nomArch;
	private Medicamento medicamento;
	public Medicamento medbarato;
	
	public ArchMedicamento(String nom) {
		this.nomArch = nom;
	}
	public void Crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream aMed = new ObjectOutputStream(new FileOutputStream(nomArch));
		aMed.close();
	}
	public void Adicionar() throws ClassNotFoundException, IOException{
		String op;
		Scanner lee = new Scanner(System.in);
		ObjectOutputStream aMed = null;
		try {
			if(new File(nomArch).exists()) {
				aMed = new AddObjectOutputStream(new FileOutputStream(nomArch,true));
			}else {
				aMed = new ObjectOutputStream(new FileOutputStream(nomArch,true));
			}
			
			do {
				medicamento = new Medicamento();
				medicamento.leer();
				aMed.writeObject(medicamento);
				System.out.println("Desea continuar? s/n");
				op = lee.next();
			}while(op.equals("s"));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin Adicion");
		}finally {
			aMed.close();
		}
	}
	public void Listar() throws ClassNotFoundException, IOException{
		ObjectInputStream aMed = null;
		try {
			aMed = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				medicamento = new Medicamento();
				medicamento = (Medicamento)aMed.readObject();
				medicamento.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin listado");
		}finally {
			aMed.close();
		}
	}
	public void medresfrios() throws ClassNotFoundException, IOException{
		ObjectInputStream aMed = null;
		try {
			aMed = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				medicamento = new Medicamento();
				medicamento = (Medicamento)aMed.readObject();
				if(medicamento.getTipo().equals("resfrios")) {
					medicamento.mostrar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin listado");
		}finally {
			aMed.close();
		}
	}
	public void tosbarato() throws ClassNotFoundException, IOException{
		double preciomin = 100;
		ObjectInputStream aMed = null;
		try {
			aMed = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				medicamento = new Medicamento();
				medicamento = (Medicamento)aMed.readObject();
				if(medicamento.getPrecio()<preciomin && medicamento.getTipo().equals("paraTos")) {
					medbarato = medicamento;
					preciomin = medicamento.getPrecio();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Medicamento de tos más barato: ");
			medbarato.mostrar();
			System.out.println("Fin Metodo");
		}finally {
			aMed.close();	
		}
	}
}
