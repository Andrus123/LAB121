/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final2;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Andrés Aquin
 */
public class Proyecto implements Serializable{
    private String cod;
    private String nombre;
    private int nroIntegrantes;
    private int porcentajeavance;
    private int semestre;
    
    public void leer(){
        Scanner lee = new Scanner(System.in);
        System.out.println("codp - nombre - nro int - % avance - semestre");
        this.cod = lee.next();
        this.nombre = lee.next();
        this.nroIntegrantes = lee.nextInt();
        this.porcentajeavance = lee.nextInt();
        this.semestre = lee.nextInt();
    }
    
    public void mostrar(){
        System.out.println(getCod()+" "+getNombre()+" "+getNroIntegrantes()
                +" "+getPorcentajeavance()+" "+getSemestre());
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroIntegrantes() {
        return nroIntegrantes;
    }

    public void setNroIntegrantes(int nroIntegrantes) {
        this.nroIntegrantes = nroIntegrantes;
    }

    public int getPorcentajeavance() {
        return porcentajeavance;
    }

    public void setPorcentajeavance(int porcentajeavance) {
        this.porcentajeavance = porcentajeavance;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
}
