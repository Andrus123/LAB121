/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Andrés Aquin
 */
public class ArchProyecto {

    private String nomArch;
    private Proyecto proyecto;
    private Proyecto proyectoavanzado;

    public ArchProyecto(String nom) {
        this.nomArch = nom;
    }

    public void Crear() throws ClassNotFoundException, IOException {
        ObjectOutputStream aRopa = new ObjectOutputStream(new FileOutputStream(nomArch));
        aRopa.close();
    }

    public void Adicionar() throws ClassNotFoundException, IOException {
        String op;
        Scanner lee = new Scanner(System.in);
        ObjectOutputStream aProyecto = null;
        try {
            if (new File(nomArch).exists()) {
                aProyecto = new AddObjectOutputStream(new FileOutputStream(nomArch, true));
            } else {
                aProyecto = new ObjectOutputStream(new FileOutputStream(nomArch, true));
            }

            do {
                proyecto = new Proyecto();
                proyecto.leer();
                aProyecto.writeObject(proyecto);
                System.out.println("Desea continuar? s/n");
                op = lee.next();
            } while (op.equals("s"));

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Fin Adicion");
        } finally {
            aProyecto.close();
        }
    }

    public void Listar() throws ClassNotFoundException, IOException {
        System.out.println("codp - nombre - nro int - % avance - semestre");
        ObjectInputStream aProyecto = null;
        try {
            aProyecto = new ObjectInputStream(new FileInputStream(nomArch));
            while (true) {
                proyecto = new Proyecto();
                proyecto = (Proyecto) aProyecto.readObject();
                proyecto.mostrar();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Fin Listado");
        } finally {
            aProyecto.close();
        }
    }

    public void Proyectomenoravance() throws ClassNotFoundException, IOException {
        int maxavance = 100;
        ObjectInputStream aProyecto = null;
        try {
            aProyecto = new ObjectInputStream(new FileInputStream(nomArch));
            while (true) {
                proyecto = new Proyecto();
                proyecto = (Proyecto) aProyecto.readObject();
                    if (proyecto.getPorcentajeavance()< maxavance) {
                        proyectoavanzado = proyecto;
                        maxavance = proyecto.getPorcentajeavance();
                    }
                
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Proyecto con menor avance: ");
            System.out.println(proyectoavanzado.getNombre() + " AVANCE: "+proyectoavanzado.getPorcentajeavance()+" %"
            +" SEMESTRE: "+proyectoavanzado.getSemestre());
            System.out.println("Fin Metodo");
        } finally {
            aProyecto.close();
        }
    }
    public boolean Modifica(int sem)throws ClassNotFoundException,IOException{
		String resp;
		double x;
		Scanner sc=new Scanner(System.in);
		boolean sw=false;
		ObjectInputStream aProyecto = null;
		ObjectOutputStream archAux=null;
		try{
			aProyecto =new ObjectInputStream(new FileInputStream(nomArch));
			archAux=new ObjectOutputStream(new FileOutputStream("proyecto.dat", true));
			while(true){
				proyecto =new Proyecto();
				proyecto =(Proyecto)aProyecto.readObject();
				if(proyecto.getSemestre()==sem){
					proyecto.mostrar();
					System.out.print("Desea modificar s/n");
					 resp=sc.next();
					if(resp.equals("s")){
						proyecto.setPorcentajeavance(proyecto.getPorcentajeavance()+20);
						sw=true;
					}
				}
			}
		}
		catch (Exception e) {
			System.out.print("\n FIN Modifica");
		}finally{
			aProyecto.close();
			archAux.close();
			File f1 = new File(nomArch);
			File f2 = new File("copia.dat");
			f1.delete();
			f2.renameTo(f1);
		}
		return sw;
	}

}
