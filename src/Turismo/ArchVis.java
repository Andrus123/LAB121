package Turismo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ArchVis {
	private String nomArch;
	private Visita visita;
	private Visita visitaencontrada;
	
	public ArchVis(String nom){
		this.nomArch = nom;
	}
	public void Crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream aVis = new ObjectOutputStream(new FileOutputStream(nomArch));
		aVis.close();
	}
	public void Adicionar() throws ClassNotFoundException, IOException{
		String op;
		Scanner lee = new Scanner(System.in);
		ObjectOutputStream aVis = null;
		try {
			if(new File(nomArch).exists()) {
				aVis = new AddObjectOutputStream(new FileOutputStream(nomArch,true));
			}else {
				aVis = new ObjectOutputStream(new FileOutputStream(nomArch,true));
			}
			
			do {
				visita = new Visita();
				visita.leer();
				aVis.writeObject(visita);
				System.out.println("Desea continuar? s/n");
				op = lee.next();
			} while (op.equals("s"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin Adicion");
		}finally {
			aVis.close();
		}
	}
	public void Listar() throws ClassNotFoundException, IOException{
		ObjectInputStream aVis = null;
		try {
			aVis = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				visita = new Visita();
				visita = (Visita)aVis.readObject();
				visita.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin listado");
		}finally {
			aVis.close();
		}
	}
	public String LugaresvisitadosporVisX(String x) throws ClassNotFoundException, IOException{
		int c = 0;
		ObjectInputStream aVis = null;
		try {
			aVis = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				visita = new Visita();
				visita = (Visita)aVis.readObject();
				if(visita.getNombreVisitante().equals(x)) {
					visitaencontrada = visita;
					return visitaencontrada.getCodigo();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(c);
			String cod = visitaencontrada.getCodigo();
			return cod;
		}finally {
			aVis.close();
		}
	}
}
