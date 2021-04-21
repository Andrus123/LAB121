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
        super();
        this.turno = "Mañana";
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
        super.mostrar();
        System.out.println("Colegio: "+getNombre());
        System.out.println("Turno: "+getTurno());
    }
}
