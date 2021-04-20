/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Andrés Aquin
 */
public class Programa {

    protected String EmprDev;
    protected int nroPlataformas;
    protected double version;
    protected double precio;

    public Programa() {
        this.EmprDev = "Riot Games";
        this.nroPlataformas = 1;
        this.version = 11.4;
        this.precio = 100;
    }

    public Programa(String emdv, int np, double v, double p) {
        this.EmprDev = emdv;
        this.nroPlataformas = np;
        this.version = v;
        this.precio = p;
    }
    public void leer(){
        System.out.println("Empresa Desarrolladora: ");
        setEmprDev(Leer.dato());
        System.out.println("Número de Plataformas: ");
        setNroPlataformas(Leer.datoInt());
        System.out.println("Version: ");
        setVersion(Leer.datoDouble());
        System.out.println("Precio: ");
        setPrecio(Leer.datoDouble());
    }
    public void mostrar(){
        System.out.println("Tech Startup: ");
        System.out.println(getEmprDev());
        System.out.println("Plataformas: "+getNroPlataformas());
        System.out.println("Versión: "+getVersion());
        System.out.println("Precio: "+getPrecio());
    }

    public String getEmprDev() {
        return EmprDev;
    }

    public void setEmprDev(String emdv) {
        this.EmprDev = emdv;
    }

    public int getNroPlataformas() {
        return nroPlataformas;
    }

    public void setNroPlataformas(int np) {
        this.nroPlataformas = np;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double v) {
        this.version = v;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double p) {
        this.precio = p;
    }
    //c)
    public void camVersion(){
        System.out.println("Actualizacion de versión: ");
        setVersion(Leer.datoDouble());
        this.mostrar();
    }
}
