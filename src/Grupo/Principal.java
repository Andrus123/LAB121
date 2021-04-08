/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupo;

/**
 *
 * @author andru
 */
public class Principal {
    public static void main(String[] args){
        Grupo g1 = new Grupo();
        Grupo g2 = new Grupo("Tigre",5);
        
        g1.leer();
        g2.leer();
        
        g1.mostrar();
        g2.mostrar();
        
        g1.dividir(g1,g2);
    }
}
