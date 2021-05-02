/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {

    public static void VctorEst(int n) {
        Estudiante[] est = new Estudiante[5];
        for (int i = 0; i < n; i++) {
                est[i] = new Estudiante();
                //est[i].leer(); //Para ingresar nuevos estudiantes
                est[i].mostrar();
        }
    }
    public static void VctorDoc(int n){
        Docente[] doc = new Docente[5];
        for (int i = 0;i<n; i++){
            doc[i] = new Docente();
            //doc[i].leer();  //Para ingresar nuevos docentes
            doc[i].mostrar();
        }
    }

    public static void main(String[] args) {
        // Crear e instanciar un vector con 5 objetos Estudiante
        VctorEst(5);
        // Crear e instanciar un vector con 5 objetos Docente
        VctorDoc(5);
    }
}
