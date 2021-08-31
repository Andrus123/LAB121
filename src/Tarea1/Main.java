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
public class Main {

    public static void main(String[] args) {
        //Inciso A
        Mayores m1 = new Mayores();
        m1.leer();
        m1.comparar();
        //Inciso B
        Secuencias s1 = new Secuencias();
        s1.leer();
        s1.generasecuencia();
        //Inciso C
        Dividir1 d1 = new Dividir1();
        d1.leer();
        d1.dividirenteros();
        //Inciso D
        Primos p1 = new Primos();
        p1.leer();
        p1.esprimo();
        //Inciso E
        Capicuas c1 = new Capicuas();
        c1.incapicua();
    }
}
