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
        //d)Determinar si alguno de los neumaticos tiene la marca z
        v1.Detneumatico("Goodyear");
        //e)Cambiar el color de la carroceria
        v1.cambiarColor("Negro");
        //f)Instanciar un vehiculo, dado dos vehiculos mostrar la placa de mas neumaticos
        Vehiculo v2 = new Vehiculo("Ford","GIG-777",7);
        v1.MayorNeumaticos(v1, v2);
    }
}
