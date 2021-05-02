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
public class Docente extends Persona {
    private int idDocente;
    
    public Docente(){
        this.nombre = "Lic. Marcelo Aruquipa";
        this.sexo = "Masculino";
        this.idDocente = 7753434;
    }

    public Docente(int idDocente) {
        this.idDocente = idDocente;
    }

    public Docente(int idDocente, String nombre, int ci, String sexo) {
        super(nombre, ci, sexo);
        this.idDocente = idDocente;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("ID del Docente: "+getIdDocente());
    } 
}
