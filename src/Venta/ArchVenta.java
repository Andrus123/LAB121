package Venta;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ArchVenta {
	private String nomArch;
	private Venta venta;
	private Venta mayorventa;
	private Venta Gananciaventa;
		
		public ArchVenta(String nom) {
			this.nomArch = nom;
		}
		public void Crear() throws ClassNotFoundException, IOException {
			ObjectOutputStream aVenta = new ObjectOutputStream(new FileOutputStream(nomArch));
			aVenta.close();
		}
		public void Adicionar() throws ClassNotFoundException, IOException{
			String op;
			Scanner lee = new Scanner(System.in);
			ObjectOutputStream aVenta = null;
			try {
				if(new File(nomArch).exists()) {
					aVenta = new AddObjectOutputStream(new FileOutputStream(nomArch,true));
				}else {
					aVenta = new ObjectOutputStream(new FileOutputStream(nomArch,true));
				}
				
				
				do {
					venta = new Venta();
					venta.leer();
					aVenta.writeObject(venta);
					System.out.println("Desea continuar? s/n");
					op = lee.next();
				}while(op.equals("s"));
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Fin Adicion");
			}finally {
				aVenta.close();
			}
		}
		public void Listar() throws ClassNotFoundException, IOException {
			ObjectInputStream aVenta = null;
			System.out.println("COD |  Nombre  |  Precio | FechaPre |  Cantidad");
			try {
				aVenta = new ObjectInputStream(new FileInputStream(nomArch));
				while(true) {
					venta = new Venta();
					venta = (Venta)aVenta.readObject();
					venta.mostrar();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Fin Listado");
			}finally {
				aVenta.close();
			}
		}
		public void mayorventaFechaX(String x) throws ClassNotFoundException, IOException {
			int cantmax = 1;
			ObjectInputStream aVenta = null;
			try {
				aVenta = new ObjectInputStream(new FileInputStream(nomArch));
				while(true) {
					venta = new Venta();
					venta = (Venta)aVenta.readObject();
					if(venta.getFechapre().equals(x)) {
						if(venta.getCantidad()>cantmax) {
							mayorventa = venta;
							cantmax = venta.getCantidad();
						}
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Nombre del producto con mayores ventas en fecha: "+x);
				System.out.println(mayorventa.getNombre()+" con "+mayorventa.getCantidad()+" unidades");
				System.out.println("Fin Metodo B)");
			}finally {
				aVenta.close();
			}
		}
		public void productoMayorGanancia() throws ClassNotFoundException, IOException {
			double Ingresomax = 0;
			ObjectInputStream aVenta = null;
			try {
				aVenta = new ObjectInputStream(new FileInputStream(nomArch));
				while(true) {
					venta = new Venta();
					venta = (Venta)aVenta.readObject();
					double ingreso = venta.getCantidad()*venta.getPrecio();
					if(ingreso>Ingresomax) {
						Ingresomax = ingreso;
						Gananciaventa = venta;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Producto que generó mayor ganancia: ");
				Gananciaventa.mostrar();
				System.out.println("Con ingresos de :"+Ingresomax);
				System.out.println("Fin Metodo C)");
			}finally {
				aVenta.close();
			}
		}
}
