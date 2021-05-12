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
public class Instituto extends EntidadEducacion{
    private int nesp;
    private String[] esp = new String[30];
    
    public Instituto(){
        super("i11",2018,"Privado");
        this.NroProfesores = 3;
        this.prf[0]="Lic. Chamon";   this.prf[2]="Lic. Gino"; 
        this.prf[1]="Mg. Velasques"; 
        this.nroEstudiantes = 8;
        this.est[0]="Jhon";   this.est[4]="Mauren";
        this.est[1]="Lucas";  this.est[5]="Kelly";
        this.est[2]="Carla";  this.est[6]="Chris";
        this.est[3]="Paty";   this.est[7]="Marcelo";
        
        this.nesp = 5;
        this.esp[0] = "Física";
        this.esp[1] = "Matemática";
        this.esp[2] = "Mecatrónica";
        this.esp[3] = "Mecanica";
        this.esp[4] = "Informpatica";
    }

    public Instituto(int nesp, String nombre, int anioFundacion, String tipo, int NroProfesores, int nroEstudiantes) {
        super(nombre, anioFundacion, tipo, NroProfesores, nroEstudiantes);
        this.nesp = nesp;
        for(int i=0;i<nesp;i++){
            this.esp[i]="";
        }
    }

    public int getNesp() {
        return nesp;
    }

    public void setNesp(int nesp) {
        this.nesp = nesp;
    }

    public String[] getEsp() {
        return esp;
    }

    public void setEsp(String[] esp) {
        this.esp = esp;
    }
    @Override
    public void leer(){
        super.leer();
        System.out.println("# de especialidades: ");
        setNesp(Leer.datoInt());
        for(int i=0;i<nesp;i++){
            System.out.println("Especialidad "+i+" :");
            esp[i]=Leer.dato();
        }
    }
    @Override
    public void mostrar(){
        System.out.println("Instituto: "+getNombre());
        super.mostrar();
        System.out.println("# de Especialidades: "+getNesp());
        for(int i=0;i<nesp;i++){
            System.out.println(esp[i]);
        }
    }
    public void modanio(){
        System.out.println("Ingrese el nuevo año de fundación");
        int x = Leer.datoInt();
        setAnioFundacion(x);
        System.out.println("Institución: "+getNombre()+" Año de fundación: "+
        getAnioFundacion());
    }
    
}
