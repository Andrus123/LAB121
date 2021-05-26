/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicamento;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author AndrÃ©s Aquin
 */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        //a)
        Medicamento m1 = new Medicamento();
        m1.mostrar();
        //b)
        Pastilla p1 = new Pastilla("Ibuprofeno",10,5,"Antigripal",500);
        p1.mostrar();
        Pastilla p2 = new Pastilla("Aspirina",5,20,"Analgesico",250);
        p2.mostrar();
        Jarabe j1 = new Jarabe("Tosalcos",20,2,"Antigripal",800);
        j1.mostrar();
        Jarabe j2 = new Jarabe("Neuril",58.5,1,"Tonico",450);
        j2.mostrar();
        //c)
        if(p1.getTipo().equals(j1.getTipo()))
        {
            System.out.println("Ambos medicamentos son: "+p1.getTipo());
        }else{
            System.out.println("Son medicamentos para distintos propositos");
        }
        
        System.out.println("\nEJERCICIO 1: ");
        //a) Instanciar una Farmacia con N medicamentos
        Farmacia f1 = new Farmacia("Farmacorp","Av. Prado",3);
        f1.mostrar();
        //b) Mostrar los medicamentos para resfrios
        f1.medResfri();
        //c) Mostrar los medicamentos para la tos
        f1.medTos();
        // EJERCICIO 2
        System.out.println("\nEJERCICIO 2: ");
        //a) Instanciar Sun Objeto CadenaFarm y mostrar
        CadenaFarm cadf1 = new CadenaFarm();
        cadf1.mostrar();
        //b) Mostrar los medicamentos para la tos, de la Sucursal x
        cadf1.tosSucursal(2);
        //c) Agregar un nuevo Medicamento a la sucursal numero x
        cadf1.anadirMed(2);
        //d) Se cierra la Sucursal numero x, llevar sus medicamentos a la sucursalnumero Y
        cadf1.cerrarSucursal(2, 3);
        //EJERCICIO 3
        System.out.println("\nEJERCICIO 3: ");
        //a) Instanciar un Objeto CadenaFarm y mostrar
        CadenaFarm cadf2 = new CadenaFarm("Corporación Pfizer",3);
        cadf2.mostrar();
        //b) Mostrar al Jefe de Personal de cada sucursal
        cadf2.mostrarJefe();
        //c) Mostrar las sucursales que tienen el menor número de Personal
        cadf2.personalSucursalmenor();
        
        System.out.println("\nEJERCICIO PERSISTENCIA #1");
        try (Scanner sc = new Scanner(System.in)) {
        	ArchMedicamento archmed = new ArchMedicamento("medicamentos.dat");
        	int op;
        	do {
        		System.out.println("\tMENU"
        				+"\n 1.CREAR "
        				+"\n 2.ADICIONAR "
        				+"\n 3.LISTAR "
        				+"\n 4.MEDICAMENTOS PARA RESFRIOS"
        				+"\n 5.MEDICAMENTOS PARA TOS CON MENOR PRECIO"
        				+"\n 6. Salir");
        		op = sc.nextInt();
        		switch(op) {
        		case 1:
        			archmed.Crear();
        			break;
        		case 2:
        			archmed.Adicionar();
        			break;
        		case 3:
        			archmed.Listar();
        			break;
        		case 4:
        			archmed.medresfrios();
        			break;
        		case 5:
        			archmed.tosbarato();
        		default:
        			break;
        		}
        	} while (op!=6);
        }
    }
}
