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
public class Mayores {

    //Realizarunalgoritmoparadeterminarelmayordedosnúmeros
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Mayores() {
        num1 = 0;
        num2 = 0;
    }

    public void leer() {
        System.out.println("Ingrese el primer número: ");
        this.num1 = Leer1.datoInt();
        System.out.println("Ingrese el segundo número: ");
        this.num2 = Leer1.datoInt();
    }
    public void comparar(){
        if (num1 == num2){
            System.out.println("Son iguales");
        }else
        if (num1 > num2){
            System.out.println("el mayor es " + num1);
        }else{
            System.out.println("el mayor es " + num2);
        }
    }
   
}
