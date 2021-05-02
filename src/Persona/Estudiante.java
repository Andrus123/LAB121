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
public class Estudiante extends Persona {
    private int matricula;
    private String [] nota = new String[7];
    
    public Estudiante(){
        this.ci = 10014246;
        this.nombre = "Andres Aquin";
        this.sexo = "Masculino";
        this.matricula = 772299;
        this.nota[0]="INF121: 78";  //INF121
        this.nota[1]="LAB121: 85";  //LAB121
        this.nota[2]="FIS122: 90";  //FIS122
        this.nota[3]="LAB122: 67";  //LAB122
        this.nota[4]="MAT123: 71";  //MAT123
        this.nota[5]="MAT124: 85";  //MAT124
        this.nota[6]="MAT125: 80";  //MAT125
    }

    public Estudiante(int matricula) {
        this.matricula = matricula;
    }

    public Estudiante(int matricula, String nombre, int ci, String sexo) {
        super(nombre, ci, sexo);
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String[] getNota() {
        return nota;
    }

    public void setNota(String[] nota) {
        this.nota = nota;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Matricula: "+getMatricula());
        for(int i=0; i<7;i++){
            System.out.println(nota[i]);
        }
    }
}
