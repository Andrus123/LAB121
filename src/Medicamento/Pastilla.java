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
public class Pastilla extends Medicamento {

    private String tipo;
    private int mgramos;

    public Pastilla(String nombre, double precio, int cantidad, String tipo, int mgramos) {
        super(nombre, precio, cantidad,tipo);
        this.tipo = tipo;
        this.mgramos = mgramos;
    }

    public Pastilla(String tipo, int mgramos) {
    	this.nombre = "Aspirina";
        this.tipo = "Antigripal";
        this.mgramos = 500;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMgramos() {
        return mgramos;
    }

    public void setMgramos(int mgramos) {
        this.mgramos = mgramos;
    }

    @Override
    public void leer() {
        super.leer();
        System.out.println("tipo de pastilla: ");
        setTipo(Leer.dato());
        System.out.println("Miligramos: ");
        setMgramos(Leer.datoInt());
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println(getTipo()+ " de "+getMgramos()+" Mg");
    }
}
