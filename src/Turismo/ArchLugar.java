package Turismo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class ArchLugar {
	private String nomArch;
	private LugarTuristico lugarturistico;
	
	public ArchLugar(String nom){
		this.nomArch = nom;
	}
	public void Crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream aLugar = new ObjectOutputStream(new FileOutputStream(nomArch));
		aLugar.close();
	}
	public void Adicionar() throws ClassNotFoundException, IOException{
		String op;
		Scanner lee = new Scanner(System.in);
		ObjectOutputStream aLugar = null;
		try {
			if(new File(nomArch).exists()) {
				aLugar = new AddObjectOutputStream(new FileOutputStream(nomArch,true));
			}else {
				aLugar = new ObjectOutputStream(new FileOutputStream(nomArch,true));
			}
			
			do {
				lugarturistico = new LugarTuristico();
				lugarturistico.leer();
				aLugar.writeObject(lugarturistico);
				System.out.println("Desea continuar? s/n");
				op = lee.next();
			} while (op.equals("s"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin Adicion");
		}finally {
			aLugar.close();
		}
	}
	public void Listar() throws ClassNotFoundException, IOException{
		ObjectInputStream aLugar = null;
		try {
			aLugar = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				lugarturistico = new LugarTuristico();
				lugarturistico = (LugarTuristico)aLugar.readObject();
				lugarturistico.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin listado");
		}finally {
			aLugar.close();
		}
	}
	public void LugaresvisitadosporVisX(String x) throws ClassNotFoundException, IOException{
		ObjectInputStream aLugar = null;
		try {
			aLugar = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				lugarturistico = new LugarTuristico();
				lugarturistico = (LugarTuristico)aLugar.readObject();
				if(lugarturistico.getCodigo().equals(x)) {
					lugarturistico.mostrar();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin listado");
		}finally {
			aLugar.close();
		}
	}
	public void CantidadvisitantesporNombre() throws ClassNotFoundException, IOException{
		ObjectInputStream aLugar = null;
		try {
			aLugar = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				lugarturistico = new LugarTuristico();
				lugarturistico = (LugarTuristico)aLugar.readObject();
				lugarturistico.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin listado");
		}finally {
			aLugar.close();
		}
	}
	public void Cantidadvisitantes() throws ClassNotFoundException, IOException{
		ObjectInputStream aLugar = null;
		try {
			aLugar = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				lugarturistico = new LugarTuristico();
				lugarturistico = (LugarTuristico)aLugar.readObject();
				lugarturistico.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin listado");
		}finally {
			aLugar.close();
		}
	}
}
