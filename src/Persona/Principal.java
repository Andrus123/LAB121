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
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        Docente d1 = new Docente();
        // Crear e instanciar un vector con 5 objetos Estudiante
        Estudiante[] est = new Estudiante[5];
        e1.VctorEst(est, 5);
        // Crear e instanciar un vector con 5 objetos Docente
        Docente[] doc = new Docente[5];
        d1.VctorDoc(doc, 5);
        //Mostrar a los estudiantes que tienen la nota más alta
        e1.Mayornota(est);
        //Mostrar el nombre de los Docentes donde su idDocente termine en impar
        d1.Idimpar(doc);
        //Mostrar la matricula de los estudiantes de sexo F(Femenino)
        e1.MatriculaF(est);
    }
}
