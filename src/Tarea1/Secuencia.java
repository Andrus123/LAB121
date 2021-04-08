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
public class Secuencia {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public Secuencia(){
        n=0;
    }
    public void leer(){
        System.out.println("Ingrese cifra para la secuencia: ");
        this.n = Leer.datoInt();
    }
    public void generasecuencia(){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.println(i + "");
            }
        }
    }
}
