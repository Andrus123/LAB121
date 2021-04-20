/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        //a)
        Programa p1 = new Programa();
        Juego j1 = new Juego();
        Juego j2 = new Juego("CDproject",4,11.4,300,"Cyberpunk2077","Consola",
                          "Cyberpunk2077 es la culminación de 10 años de desarrollo,"
                                  + "RPG de calidad AAA");
        System.out.println("\nObjeto Programa: ");
        p1.mostrar();
        System.out.println("\nObjeto Juego: ");
        j1.mostrar();
        j2.mostrar();
        //b)
        j1.compJuego(j1,j2);
        //c)
        p1.camVersion();
    }
}
