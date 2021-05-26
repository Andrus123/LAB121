package Medicamento;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import Persistencia.AddObjectOutputStream;


public class ArchFarm {
	private String nomArch;
	private Farmacia farmacia;
	
	public ArchFarm(String nom) {
		this.nomArch = nom;
	}
	public void Crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream aFarm = new ObjectOutputStream(new FileOutputStream(nomArch));
		aFarm.close();
	}
	public void Adicionar() throws ClassNotFoundException, IOException{
		String op;
		Scanner lee = new Scanner(System.in);
		ObjectOutputStream aFarm = null;
		try {
			if(new File(nomArch).exists()) {
				aFarm = new AddObjectOutputStream(new FileOutputStream(nomArch,true));
			}else {
				aFarm = new ObjectOutputStream(new FileOutputStream(nomArch,true));
			}
			do {
				farmacia = new Farmacia();
				farmacia.leer();
				aFarm.writeObject(farmacia);
				System.out.println("Desea continuar? s/n");
				op = lee.next();
			}while(op.equals("s"));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin Adicion");
		}finally {
			aFarm.close();
		}
	}
	public void Listar() throws ClassNotFoundException, IOException{
		ObjectInputStream aFarm = null;
		try {
			aFarm = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				farmacia = new Farmacia();
				farmacia = (Farmacia)aFarm.readObject();
				farmacia.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin Listado");
		}finally {
			aFarm.close();
		}
	}
	public void meditosSucursalnumber(int x) throws ClassNotFoundException, IOException{
		ObjectInputStream aFarm = null;
		try {
			aFarm = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				farmacia = new Farmacia();
				farmacia = (Farmacia)aFarm.readObject();
				if(farmacia.getNroSucursal()==x) {
					farmacia.BuscarTos();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin metodo 4");
		}finally {
			aFarm.close();
		}
	}
	public void sucursaldirxnmed(String x) throws ClassNotFoundException, IOException{
		ObjectInputStream aFarm = null;
		try {
			aFarm = new ObjectInputStream(new FileInputStream(nomArch));
			while(true) {
				farmacia = new Farmacia();
				farmacia = (Farmacia)aFarm.readObject();
				farmacia.buscarMed(x);
				if(farmacia.buscarMed(x).equals("si")) {
					System.out.println("N° de sucursal - "+farmacia.getNroSucursal()
										+" direccion - "+farmacia.getDireccion());
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin metodo 5");
		}finally {
			aFarm.close();
		}
	}
}
