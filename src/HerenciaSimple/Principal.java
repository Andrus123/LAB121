/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaSimple;

/**
 *
 * @author andru
 */
public class Principal {
    public static void main(String[] args){
        Publicacion pu1 = new Publicacion("Bended", 170.89);
        
        Libro l1 = new Libro("POO C++",55,100);
        Libro l2 = new Libro("Señor de los Anillos");
        Cd c1 = new Cd();
        
        //pu1.mostrar();
        l1.mostrar();
        c1.mostrarCd();
        l2.mostrar();
        //b) y c)
        System.out.println(c1.getTitulo()+" " +c1.getPrecio());
        //d)forma 1
    }
}
