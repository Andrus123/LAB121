package ClasePersistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ArchRopa {
	private String nomArch;
	private RegRopa rgRopa;
	
	public ArchRopa(String nom) {
		this.nomArch = nom;
	}
	public void Crear() throws ClassNotFoundException, IOException {
		ObjectOutputStream aRopa = new ObjectOutputStream(new FileOutputStream(nomArch));
		aRopa.close();
	}
	public void Adicionar() throws ClassNotFoundException, IOException{
		String op;
		Scanner lee = new Scanner(System.in);
		ObjectOutputStream aRopa = null;
		try {
			if(new File(nomArch).exists()) {
				aRopa = new AddObjectOutputStream(new FileOutputStream(nomArch,true));
			}else {
				aRopa = new ObjectOutputStream(new FileOutputStream(nomArch,true));
			}
			
			
			do {
				rgRopa = new RegRopa();
				rgRopa.leer();
				aRopa.writeObject(rgRopa);
				System.out.println("Desea continuar? s/n");
				op = lee.next();
			}while(op.equals("s"));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin Adicion");
		}finally {
			aRopa.close();
		}
	}
	public void Listar() throws ClassNotFoundException, IOException {
		ObjectInputStream aRopa = null;
		try {
			aRopa = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				rgRopa = new RegRopa();
				rgRopa = (RegRopa)aRopa.readObject();
				rgRopa.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println();
			System.out.println("Fin Listado");
		}finally {
			aRopa.close();
		}
	}
	public int contarRopaMarca(String marcax)throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		int c = 0;
		
		ObjectInputStream aRopa = null;
		try {
			aRopa = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				rgRopa = new RegRopa();
				rgRopa = (RegRopa)aRopa.readObject();
				if(rgRopa.getMarca().equals(marcax))
					//rgRopa.mostrar();
					c++;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin");
		}finally {
			aRopa.close();
		}
		return c;
	}
}
