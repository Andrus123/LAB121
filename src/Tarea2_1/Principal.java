/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2_1;

/**
 *
 * @author andru
 */
public class Principal {
    public static void main(String args[]){
        
        Agenda agenda = new Agenda();
        agenda.agregarPersona(1, "Juan");
        agenda.agregarPersona(2, "Maria");
        agenda.visualizarPersona();
    }
}
