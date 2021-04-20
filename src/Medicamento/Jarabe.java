/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicamento;

/**
 *
 * @author Andrés Aquin
 */
public class Jarabe extends Medicamento{
    private String tipo;
    private int mlitros;
    
    public Jarabe(String nombre, double precio, int cantidad, String tipo, int mlitros){
        super(nombre,precio,cantidad);
        this.tipo = tipo;
        this.mlitros = mlitros;
    }
    public Jarabe(String tipo, int mlitros)
    {
        this.tipo = "Antigripal";
        this.mlitros = 700;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMlitros() {
        return mlitros;
    }

    public void setMlitros(int mlitros) {
        this.mlitros = mlitros;
    }
    @Override
    public void leer(){
        super.leer();
        System.out.println("Tipo de Jarabe: ");
        setTipo(Leer.dato());
        System.out.println("Mililitros: ");
        setMlitros(Leer.datoInt());
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println(getTipo() +" de "+getMlitros()+" ml");
    }
}
