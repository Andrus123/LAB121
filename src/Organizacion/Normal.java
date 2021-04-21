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
        super();
        this.area = "Técnico";
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
        super.mostrar();
        System.out.println("Normal "+getNombre());
        System.out.println("Area de estudio: "+getArea());
    }
}
