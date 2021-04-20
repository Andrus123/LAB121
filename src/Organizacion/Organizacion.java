/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organizacion;

/**
 *
 * @author Andrés Aquin
 */
public class Organizacion {
    protected int NroProfesores;
    protected int nroEstudiantes;
    protected String[] est = new String[30];
    protected String[] prf = new String[20];
    
    public Organizacion(){
        this.NroProfesores = 5;
        this.prf[0]="Lic. Perez"; this.prf[3]="Lic. Gino"; 
        this.prf[1]="Mg. Quiroga"; this.prf[4]="Lic. Rosso";
        this.prf[2]="Lic. Oquendo";
        this.nroEstudiantes = 8;
        this.est[0]="Juan";   this.est[4]="Mauren";
        this.est[1]="Pedro";  this.est[5]="Kelly";
        this.est[2]="Marco";  this.est[6]="Luis";
        this.est[3]="Andres"; this.est[7]="Paola";
    }

    public Organizacion(int NroProfesores, int nroEstudiantes) {
        this.NroProfesores = NroProfesores;
        this.nroEstudiantes = nroEstudiantes;
    }

    public int getNroProfesores() {
        return NroProfesores;
    }

    public void setNroProfesores(int NroProfesores) {
        this.NroProfesores = NroProfesores;
    }

    public int getNroEstudiantes() {
        return nroEstudiantes;
    }

    public void setNroEstudiantes(int nroEstudiantes) {
        this.nroEstudiantes = nroEstudiantes;
    }

    public String[] getEst() {
        return est;
    }

    public void setEst(String[] est) {
        this.est = est;
    }

    public String[] getPrf() {
        return prf;
    }

    public void setPrf(String[] prf) {
        this.prf = prf;
    }
    public void leer(){
        System.out.println("Número de profesores: ");
        setNroProfesores(Leer.datoInt());
        System.out.println("Número de estudiantes: ");
        setNroEstudiantes(Leer.datoInt());
        for(int i=0; i<getNroProfesores();i++){
            prf[i]=Leer.dato();
        }
        for(int i=0; i<getNroEstudiantes();i++){
            est[i]=Leer.dato();
        }
    }
    public void mostrar(){
        System.out.println("# de profesores: "+NroProfesores);
        for(int i=0; i<getNroProfesores();i++){
            System.out.println(prf[i]);
        }
        System.out.println("# de estudiantes: "+nroEstudiantes);
        for(int i=0;i<getNroEstudiantes();i++){
            System.out.println(est[i]);
        }
    }
}
