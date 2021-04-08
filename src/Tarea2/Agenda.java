/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

/**
 *
 * @author andru
 */
public class Agenda {

    private String propietario;
    private int anio;
    private int nroCtos;
    private String[][] ctos = new String[50][3];

    //Constructor por defecto
    public Agenda() {
        this.propietario = "jorge";
        this.anio = 2021;
        this.nroCtos = 3;
        this.ctos[0][0] = "alan";
        this.ctos[0][1] = "70119";
        this.ctos[0][2] = "alan@lo.com";
        this.ctos[1][0] = "sergio";
        this.ctos[1][1] = "60519";
        this.ctos[1][2] = "ser@ho.es";
        this.ctos[2][0] = "jenny";
        this.ctos[2][1] = "24522";
        this.ctos[2][2] = "jnny@g.com";
    }

    //Constructor Parametrizado
    public Agenda(String propietario, int anio) {
        this.propietario = propietario;
        this.anio = anio;
        this.nroCtos = 2;
        this.ctos[0][0] = "rosa";
        this.ctos[0][1] = "65747";
        this.ctos[0][2] = "ross@ya.com";
        this.ctos[1][0] = "jenny";
        this.ctos[1][1] = "24522";
        this.ctos[1][2] = "jnny@g.com";
    }

    public void Mostrar() {
        System.out.println("Datos de objeto Agenda");
        System.out.println("propietario =  " + this.propietario);
        System.out.println("año = " + this.anio);
        System.out.println("nro Ctos = " + this.nroCtos);
        System.out.println("t nombre - telefono - correo");
        for (int i = 0; i < this.nroCtos; i++) {
            System.out.println((i + 1) + ".-\t" + this.ctos[i][0] + "\t" + this.ctos[i][1] + "\t" + this.ctos[i][2]);
        }
    }

    //SOLUCION B}
    
    public void adicionarContacto(Contacto c) {
        if (buscarContacto(c)) {
            System.out.println("El contacto ya existe!!");
        } else {
            this.ctos[this.nroCtos][0] = c.nombre;
            this.ctos[this.nroCtos][1] = c.nroFono + "";
            this.ctos[this.nroCtos][2] = c.correo;
            this.nroCtos++;
        }
    }
    public boolean buscarContacto(Contacto c) {
        for (int i = 0; i < this.nroCtos; i++) {
            if (this.ctos[i][0].equals(c.nombre)) {
                return true;
            }
        }
        return false;
    }
    
}
