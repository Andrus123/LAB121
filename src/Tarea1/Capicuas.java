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
public class Capicuas {
    private int n;
    private int aux;
    private int inverso;
    private int cifra;
    
    public Capicuas(){
        this.n = 0;
        this.aux= 0;
        this.inverso = 0;
        this.cifra = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void incapicua(){
        do{
        System.out.println("Introduzca un numero mayor a 10:");
        this.n = Leer1.datoInt();
        }while(n<10);
        
        //se le da la vuelta al numero
        this.aux = n;
        while(aux!=0){
            cifra = aux % 10;
            this.inverso = inverso * 10 + cifra;
            aux = aux/10;
        }
        if (n == inverso){
            System.out.println("ES CAPICUA");
        }else{
            System.out.println("NO ES CAPICUA");
        }
}
}
