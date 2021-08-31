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
public class Main {
    public static void main(String[] args){
        Grupos g1 = new Grupos();
        Grupos g2 = new Grupos("Tigre",5);
        
        g1.leer();
        g2.leer();
        
        g1.mostrar();
        g2.mostrar();
        
    }
}
