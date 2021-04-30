/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        //a)Instanciar un vehiculo
        Vehiculo v1 = new Vehiculo();
        v1.Mostrar();
        //b)Comparar colores
        v1.Compcolor("azul");
        //c)Sumar los precios de los neumaticos
        v1.TotalNeum();
    }
}
