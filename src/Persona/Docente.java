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
    public void leer(){
        System.out.println("Nombre del Docente: ");
        setNombre(Leer.dato());
        System.out.println("ID del Docente: ");
        setIdDocente(Leer.datoInt());
        System.out.println("Genero: ");
        setSexo(Leer.dato());
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("ID del Docente: "+getIdDocente());
    }
    public void VctorDoc(Docente[] doc,int n){
        for (int i = 0;i<n; i++){
            doc[i] = new Docente();
            //doc[i].leer();  //Para ingresar nuevos docentes
            doc[i].mostrar();
        }
    }
}
