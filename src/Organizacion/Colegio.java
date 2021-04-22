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
public class Colegio extends EntidadEducacion{
    private String turno;
    
    public Colegio(){
        super("San Calixto",1935,"Privado");
        this.turno = "Mañana";
        this.NroProfesores = 3;
        this.prf[0]="Lic. Diaz";   this.prf[2]="Lic. Jimenez"; 
        this.prf[1]="Lic. Oliver";    
        this.nroEstudiantes = 5;
        this.est[0]="Mauren";   
        this.est[1]="Natalia";  
        this.est[2]="Fabri";  
        this.est[3]="Mauricio";  
        this.est[4]="Lorena";  
    }

    public Colegio(String turno, String nombre, int añoFundacion, String tipo, int NroProfesores, int nroEstudiantes) {
        super(nombre, añoFundacion, tipo, NroProfesores, nroEstudiantes);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    @Override
    public void leer(){
        super.leer();
        System.out.println("Turno: ");
        setTurno(Leer.dato());
    }
    @Override
    public void mostrar(){
        System.out.println("Colegio: "+getNombre());
        System.out.println("Turno: "+getTurno());
        super.mostrar();
    }
    public void agregarProf()
    {
        System.out.println("Nuevo profesor para el colegio: ");
        String x = Leer.dato();
        this.NroProfesores = NroProfesores + 1;
        for(int i=0;i<NroProfesores;i++){
            this.prf[NroProfesores-1] = x;
        }
        System.out.println("Nueva plantilla de profesores:");
        for(int i=0; i<getNroProfesores();i++){
            System.out.println(prf[i]);
        }
    }
}
