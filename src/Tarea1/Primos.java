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
public class Primos {

    private int n;
    private int c;

    public Primos() {
        this.n = 0;
        this.c = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void leer() {
        System.out.println("Ingrese el número a verificar si es número primo o no: ");
        this.n = Leer1.datoInt();
    }

    public void esprimo() {
        if (n == 0 || n == 1 || n == 4) {
            this.c++;
        }
        for (int x = 2; x < n / 2; x++) {
        //si es divisible por cualquiera de estos numeros no es primo
        if (n % x == 0) 
            this.c++;
        }
        if(c > 0){
            System.out.println("NO ES PRIMO");
        }else{
            System.out.println("ES PRIMO");
        }
    }//si no se pudo dividir por cualquiera de arriba, es primo
}
