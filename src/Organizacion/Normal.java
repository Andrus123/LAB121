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
public class Normal extends EntidadEducacion{
    private String area;
    
    public Normal(){
        super("Escuela de Veracruz",1958,"Privado");
        this.area = "Técnico";
        this.NroProfesores = 4;
        this.prf[0]="Lic. Chamon";   this.prf[2]="Lic. Jimenez"; 
        this.prf[1]="Mg. Alvarez"; this.prf[3]="Lic. Gonzales"; 
        this.nroEstudiantes = 4;
        this.est[0]="Carlos";   
        this.est[1]="Lucas";  
        this.est[2]="Pablo";  
        this.est[3]="Marta";  
    }

    public Normal(String area, String nombre, int añoFundacion, String tipo, int NroProfesores, int nroEstudiantes) {
        super(nombre, añoFundacion, tipo, NroProfesores, nroEstudiantes);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    @Override
    public void leer(){
        super.leer();
        System.out.println("Area de Estudio: ");
        setArea(Leer.dato());
    }
    @Override
    public void mostrar(){
        System.out.println("Normal: "+getNombre());
        System.out.println("Area de estudio: "+getArea());
        super.mostrar();
    }
    
    public void ordenar(){
        
    }
}
