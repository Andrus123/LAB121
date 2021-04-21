/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organizacion;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        Organizacion or1 = new Organizacion();
        Normal n1 = new Normal();
        Instituto in1 = new Instituto();
        Colegio c1 = new Colegio();
        n1.mostrar();
        c1.mostrar();
    }
}
