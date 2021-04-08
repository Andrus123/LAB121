/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEstudiantes;

/**
 *
 * @author andru
 */
public class ListaEstudiante {
    private String materia;
    private int nroEst;
    private final String[] est = new String [50];
    
    public ListaEstudiante(){
        this.materia = "MAT 115";
        this.nroEst = 14;
        this.est[0] = "Rodri";
        this.est[1] = "Mauricio";
        this.est[2] = "Ronaldo";
        this.est[3] = "Oscar";
        this.est[4] = "Jhona";
        this.est[5] = "Mauren";
        this.est[6] = "Kelly";
        this.est[7] = "Andrea";
        this.est[8] = "Alvaro";
        this.est[9] = "Carlo";
        this.est[10] = "Giancarlo";
        this.est[11] = "Alejandro";
        this.est[12] = "Fabri";
        this.est[13] = "Chris";
        
    }

    public ListaEstudiante(String materia, int nroEst) {
        this.materia = materia;
        this.nroEst = nroEst;
        this.est[0] = "Gary";
        this.est[1] = "Mauren";
        this.est[2] = "Rodri";
        this.est[3] = "Carlo";
        this.est[4] = "Fabricio";
        this.est[5] = "Giancarlo";
        this.est[6] = "Alejandro";
        this.est[7] = "Monserrat";
        this.est[8] = "Luis";
        this.est[9] = "Paola";
        this.est[10] = "Nadia";
        this.est[11] = "Totto";
        this.est[12] = "Marcelo";
        this.est[13] = "Pablo";
        this.est[14] = "Wilmer";
        this.est[15] = "Eduar";
        this.est[16] = "Ariel";
        this.est[17] = "Michi";
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNroEst() {
        return nroEst;
    }

    public void setNroEst(int nroEst) {
        this.nroEst = nroEst;
    }
    
    public void Mostrar(){
        System.out.println("Lista de estudiantes de la materia: " + this.materia);
        for(int i=0; i <= this.nroEst; i++){
        System.out.println("Estudiante: " + this.est[i]);    
        }
    }
    public void vocal(){
        int c =0;
        for(int i=0; i<this.nroEst;i++){ 
            if(est[i].charAt(0)=='A'||est[i].charAt(0)=='E'||est[i].charAt(0)=='I'
                    ||est[i].charAt(0)=='O'||est[i].charAt(0)=='U'){
                c++;
            }
        }System.out.println("Existen "+ c + " nombres que empiezan con vocales");
    }
    public void igual(ListaEstudiante n1, ListaEstudiante n2){
        int contador=0;
        for(int i=0; i<n1.nroEst;i++){
            for(int j=0;j<n2.nroEst;j++){
                if(n1.est[i]==n2.est[j]){
                    contador++;
                }
            }
        }System.out.println("Hay "+contador+" Alumnos inscritos en ambas materias");
    }
    
}
