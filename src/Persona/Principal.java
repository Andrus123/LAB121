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
    public static void main(String[] args){
        Estudiante e1 = new Estudiante();
        Docente d1 = new Docente();
        e1.mostrar();
        d1.mostrar();
        
        for(int i=0; i<5;i++){
            Estudiante ei= new Estudiante();
        }
    }
}
