/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final2;

import Persistencia.ArchJuego;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        try (Scanner sc = new Scanner(System.in)) {
            ArchProyecto arch = new ArchProyecto("proyecto.dat");

            int op;
            do {
                System.out.println("\tMENU"
                        + "\n 1.CREAR "
                        + "\n 2.ADICIONAR "
                        + "\n 3.LISTAR "
                        + "\n 4.PROYECTO CON MENOR AVANCE"
                        + "\n 5.INCREMENTAR Avance"
                        + "\n 6. Salir");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        arch.Crear();
                        break;
                    case 2:
                        arch.Adicionar();
                        break;
                    case 3:
                        arch.Listar();
                        break;
                    case 4:
                        arch.Proyectomenoravance();
                        break;
                    case 5:
                        System.out.println("Introduzca Semestre: ");
                        int sem = sc.nextInt();
                        arch.Modifica(sem);
                        break;
                    default:
                        break;
                }
            } while (op != 6);

        }
    }
}
