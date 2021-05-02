/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author Andrés Aquin
 */
public class Persona {
    protected String nombre;
    protected int ci;
    protected String sexo;
    
    public Persona(){
        this.nombre = "Juan";
        this.ci = 12345;
        this.sexo = "Masculino";
    }

    public Persona(String nombre, int ci, String sexo) {
        this.nombre = nombre;
        this.ci = ci;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void mostrar(){
        System.out.println("\nNombre: "+getNombre());
        System.out.println("Ci: "+getCi());
        System.out.println("Género: "+getSexo());
    }
}
