/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author andru
 */
public class Principal {
    
    public static void main(String[] args){
        //a)Instanciar 2 Juegos
        Juego j1 = new Juego();
        j1.leer();
        j1.mostrar();
        Juego j2 = new Juego();
        j2.leer();
        j2.mostrar();
        //b)verificar los dos juegos si se crearon el mismo año
        j1.mismoaño(j1, j2);
        //c) verificar si tienen algun atributo igual
        j1.mismoatributo(j1, j2);
        //d)Orden ascendente acorde al año
        Juego j3 = new Juego();
        j3.leer();
        j3.mostrar();
        
        Juego j4 = new Juego();
        j4.leer();
        j4.mostrar();
        
        j1.ascendente(j1, j2, j3, j4);
    }
}
