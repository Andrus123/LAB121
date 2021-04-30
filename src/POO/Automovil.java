/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import RadioEmisora.Leer;

/**
 *
 * @author Andrés Aquin
 */
public class Automovil {

    private String marca;
    private String modelo;
    private String placa;
    private int anio;

    public Automovil() {
        this.marca = "Tesla";
        this.modelo = "X";
        this.placa = "BIT-256";
        this.anio = 2020;
    }

    public Automovil(String marca, String modelo, String placa, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.anio = anio;
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = "XT4-456";
        this.anio = 2018;
    }

    public Automovil(String marca) {
        this.marca = marca;
        this.modelo = "Jimmy";
        this.placa = "RCH-12$";
        this.anio = 2019;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void llenar() {
        System.out.println("Marca: ");
        setMarca(Leer.dato());
        System.out.println("Modelo: ");
        setModelo(Leer.dato());
        System.out.println("Placa: ");
        setPlaca(Leer.dato());
        System.out.println("Año: ");
        setAnio(Leer.datoInt());
    }

    public void mostrar() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Año: " + getAnio());
    }

    public static void verificar(Automovil x, Automovil y, Automovil z, Automovil w) {
        System.out.println("\nIngrese la placa: ");
        String p = Leer.dato();
        if (p.equals(x.getPlaca())) {
            System.out.println("Carro con placa: " + p);
            x.mostrar();
        } else if (p.equals(y.getPlaca())) {
            System.out.println("Carro con placa: " + p);
            y.mostrar();
        } else if (p.equals(z.getPlaca())) {
            System.out.println("Carro con placa: " + p);
            z.mostrar();
        } else if (p.equals(w.getPlaca())) {
            System.out.println("Carro con placa: " + p);
            w.mostrar();
        } else {
            System.out.println("Placa no registrada");
        }
    }

    public static void Autnuevo(Automovil x, Automovil y, Automovil z, Automovil w) {
        int max = 0;
        Automovil maxaut = new Automovil();
        if(x.getAnio()>max){
            max = x.getAnio();
            maxaut = x;
        }
        else if(y.getAnio()>max){
            max = y.getAnio();
            maxaut = y;
        }
        else if(z.getAnio()>max){
            max = z.getAnio();
            maxaut = z;
        }
        else if(w.getAnio()>max){
            max = w.getAnio();
            maxaut = w;
        }
        System.out.println("\nEl carro más reciente es: ");
        maxaut.mostrar();
    }
    public static void Vermarca(Automovil x, Automovil y, Automovil z, Automovil w, String m){
        if (m.equals(x.getMarca())) {
            System.out.println("\nCarro de marca: " + m);
            x.mostrar();
        } else if (m.equals(y.getMarca())) {
            System.out.println("\nCarro de marca: " + m);
            y.mostrar();
        } else if (m.equals(z.getMarca())) {
            System.out.println("\nCarro de marca: " + m);
            z.mostrar();
        } else if (m.equals(w.getMarca())) {
            System.out.println("\nCarro de marca: " + m);
            w.mostrar();
        } else {
            System.out.println("\nNingun carro es de la marca : "+m);
        }
    }

    public static void main(String[] args) {
        //a)Instanciar 4 automovile de dif manera
        Automovil a1 = new Automovil();
        Automovil a2 = new Automovil("Toyota", "Corolla", "BTX-123", 2015);
        Automovil a3 = new Automovil("Mazda", "MX-5");
        Automovil a4 = new Automovil("Ford");
        a1.mostrar();
        a2.mostrar();
        a3.mostrar();
        a4.mostrar();
        //b) verificar automovil con placa x
        verificar(a1, a2, a3, a4);
        //C) Carro más nuevo
        Autnuevo(a1, a2, a3, a4);
        //d)ver si hay carros "Toyota"
        Vermarca(a1, a2, a3, a4, "Toyota");
    }
}
