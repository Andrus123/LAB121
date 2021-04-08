/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1;

/**
 *
 * @author andru
 */
public class Principal {

    public static void main(String[] args) {
        //Inciso A
        Mayor m1 = new Mayor();
        m1.leer();
        m1.comparar();
        //Inciso B
        Secuencia s1 = new Secuencia();
        s1.leer();
        s1.generasecuencia();
        //Inciso C
        Dividir d1 = new Dividir();
        d1.leer();
        d1.dividirenteros();
        //Inciso D
        Primo p1 = new Primo();
        p1.leer();
        p1.esprimo();
        //Inciso E
        Capicua c1 = new Capicua();
        c1.incapicua();
    }
}
