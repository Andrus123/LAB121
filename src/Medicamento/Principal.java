/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicamento;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        //a)
        Medicamento m1 = new Medicamento();
        m1.mostrar();
        //b)
        Pastilla p1 = new Pastilla("Ibuprofeno",10,5,"Antigripal",500);
        p1.mostrar();
        Pastilla p2 = new Pastilla("Aspirina",5,20,"Analgesico",250);
        p2.mostrar();
        Jarabe j1 = new Jarabe("Tosalcos",20,2,"Antigripal",800);
        j1.mostrar();
        Jarabe j2 = new Jarabe("Neuril",58.5,1,"Tonico",450);
        j2.mostrar();
        //c)
        if(p1.getTipo().equals(j1.getTipo()))
        {
            System.out.println("Ambos medicamentos son: "+p1.getTipo());
        }else{
            System.out.println("Son medicamentos para distintos propositos");
        }
    }
}
