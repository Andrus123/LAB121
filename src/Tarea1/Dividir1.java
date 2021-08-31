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
public class Dividir1 {
    private int a;
    private int b;
    
    public Dividir1(){
        this.a=0;
        this.b=0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void leer(){
        System.out.println("Ingrese el valor de a y b: ");
        this.a = Leer1.datoInt();
        this.b= Leer1.datoInt();
    }
    public void dividirenteros(){
        int c=0;
        while(a>=b){
            a = a - b;
            c++;
        }
        System.out.println("Cociente: " + c);
        System.out.println("Residuo: " + a);
    }
}
