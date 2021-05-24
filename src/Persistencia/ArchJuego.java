package Persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ArchJuego {
	private String nombre;
	
	ArchJuego(String nom)
	{
		nombre = nom;
	}
	
	public void crear()throws ClassNotFoundException , IOException
	{
		ObjectOutputStream aRegistro = new ObjectOutputStream(new FileOutputStream(this.nombre));
		aRegistro.close();
	}
	public void adicionar() throws ClassNotFoundException,IOException
	{
		String op;
		Scanner lee = new Scanner(System.in);
		Juego aRegis;
		ObjectOutputStream aRegistro = null;
		try
		{
			if((new File(this.nombre).exists()))
			{
				aRegistro = new AddObjectOutputStream(new FileOutputStream(this.nombre,true));
				
			}
			else
			{
				aRegistro = new ObjectOutputStream(new FileOutputStream(this.nombre,true));
			}
			
			do
			{
				aRegis = new Juego();
				aRegis.leer();
				aRegistro.writeObject((Object)aRegis);
				System.out.println("desea ingresar mas registros s/n");
				op = lee.next();
			}	while(op.equals("s"));
	}
	catch (Exception e)
	{
		System.out.println(e);
		System.out.println("fin de la adicion");
	}finally {
		aRegistro.close();
	}
		
  }
	public void listar() throws ClassNotFoundException, IOException
	{
		ObjectInputStream aRegistro = null;
		Juego aRegis;
		try
		{
			aRegistro = new ObjectInputStream(new FileInputStream(this.nombre));
			while(true)
			{
				aRegis = new Juego();
				aRegis = (Juego)aRegistro.readObject();
				aRegis.mostrar();
				System.out.println();
			}
		}catch (Exception e)
		{
			System.out.println("fin del listado");
		}
		finally
		{
			aRegistro.close();
		}
	}
	public void mostrarJuegoX(String x) throws ClassNotFoundException, IOException
	{
		System.out.println("Juegos estrenados el año: "+x);
		ObjectInputStream aRegistro = null;
		Juego aRegis;
		try
		{
			aRegistro = new ObjectInputStream(new FileInputStream(this.nombre));
			while(true)
			{
				aRegis = new Juego();
				aRegis = (Juego)aRegistro.readObject();
				if(aRegis.getFechaCreacion().equals(x))
				System.out.println(".- "+aRegis.getNombre());
			}
		}catch (Exception e)
		{
			System.out.println();
		}
		finally
		{
			aRegistro.close();
		}
		
	}
}
