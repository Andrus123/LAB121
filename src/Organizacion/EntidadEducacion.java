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
public class EntidadEducacion extends Organizacion{
    private String nombre;
    private int anioFundacion;
    private String tipo;
    
    public EntidadEducacion(){
        super();
        this.nombre = "UMSA";
        this.anioFundacion = 1830;
        this.tipo = "Publico";
    }

    public EntidadEducacion(String nombre, int anioFundacion, String tipo) {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.tipo = tipo;
    }

    public EntidadEducacion(String nombre, int anioFundacion, String tipo, int NroProfesores, int nroEstudiantes) {
        super(NroProfesores, nroEstudiantes);
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public void leer(){
        super.leer();
        System.out.println("Nombre de la Entidad Educativa: ");
        setNombre(Leer.dato());
        System.out.println("Año de Fundación: ");
        setAnioFundacion(Leer.datoInt());
        System.out.println("Tipo de entidad: ");
        setTipo(Leer.dato());
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Entidad Educativa: "+getNombre());
        System.out.println("Anio de Fundación: "+getAnioFundacion());
        System.out.println("Tipo: "+getTipo());
    }
    
}
