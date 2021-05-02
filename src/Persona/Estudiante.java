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
    private int [] nota = new int[7];
    private int prom;
    
    public Estudiante(){
        this.ci = 10014246;
        this.nombre = "Andres Aquin";
        this.sexo = "Masculino";
        this.matricula = 772299;
        this.nota[0]=78;  //INF121
        this.nota[1]=85;  //LAB121
        this.nota[2]=90;  //FIS122
        this.nota[3]=67;  //LAB122
        this.nota[4]=85;  //MAT123
        this.nota[5]=85;  //MAT124
        this.nota[6]=80;  //MAT125
        for(int i=0; i<7;i++){
            this.prom = prom + nota[i];
        }
        this.prom = prom/7; 
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

    public int[] getNota() {
        return nota;
    }

    public void setNota(int[] nota) {
        this.nota = nota;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Matricula: "+getMatricula());
        System.out.print("INF121: "+nota[0]);
        System.out.print(" | LAB121: "+nota[1]);
        System.out.print(" | FIS122: "+nota[2]);
        System.out.print(" | LAB122: "+nota[3]);
        System.out.print(" | MAT123: "+nota[4]);
        System.out.print(" | MAT124: "+nota[5]);
        System.out.println(" | MAT125: "+nota[6]);
        prom = 0;
        for(int i=0; i<7;i++){
            this.prom = prom + nota[i];
        }
        this.prom = prom/7;
        System.out.println("Promedio: "+prom);
    }
    public void leer(){
        System.out.println("Nombre estudiante: ");
        setNombre(Leer.dato());
        System.out.println("CI: ");
        setCi(Leer.datoInt());
        System.out.println("Genero: ");
        setSexo(Leer.dato());
        System.out.println("Matricula: ");
        setMatricula(Leer.datoInt());
        System.out.println("Notas: ");
        for(int i=0; i<7; i++){
            nota[i] = Leer.datoInt();
        }
    }
    public void VctorEst(Estudiante [] est, int n) {
        for (int i = 0; i < n; i++) {
                est[i] = new Estudiante();
                est[i].leer(); //Para ingresar nuevos estudiantes
        }
        for(int i = 0; i<n;i++){
            est[i].mostrar();
        }
    }
    public void Mayornota(Estudiante[] x){
        for(int i=0; i<x.length;i++){
            if(x[i].prom>80){
                System.out.println("Estudiantes con la nota más alta: ");
                System.out.println(x[i].nombre+" con "+x[i].prom);
            }
        }
    }
    
}
