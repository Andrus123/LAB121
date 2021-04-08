/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadioEmisora;

import Juego.Leer;

/**
 *
 * @author andru
 */
public class RadioEmisora {

    private String nombre;
    private int anioFundacion;
    private int nroProgramas;
    private String[][] r = new String[50][3];
    private int z;
    

    //A)
    //Constructor por defecto
    public RadioEmisora() {
        this.nombre = "Panamericana";
        this.anioFundacion = 1975;
        this.nroProgramas = 3;
        this.r[0][0] = "   Confidencias  ";//Nombre del Programa
        this.r[0][1] = "10";//Hora de Inicio
        this.r[0][2] = "11";//Hora Final
        this.r[1][0] = "   Dialogo       ";//Nombre del Programa
        this.r[1][1] = "8";//Hora de Inicio
        this.r[1][2] = "10";//Hora Final
        this.r[2][0] = "   El Cafecito   ";//Nombre del Programa
        this.r[2][1] = "14";//Hora de Inicio
        this.r[2][2] = "16";//Hora Final
    }

    //Constructor Parametrizado
    public RadioEmisora(String nombre, int anioFundacion, int nroProgramas) {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.nroProgramas = nroProgramas;
        this.r[0][0] = "  Micrófono abierto";//Nombre del Programa
        this.r[0][1] = "9";                 //Hora de Inicio
        this.r[0][2] = "11";                //Hora Final
        this.r[1][0] = "  Mañanero       ";//Nombre del Programa
        this.r[1][1] = "6";                 //Hora de Inicio
        this.r[1][2] = "8";                 //Hora Final
        this.r[2][0] = "  Musica         ";//Nombre del Programa
        this.r[2][1] = "15";               //Hora de Inicio
        this.r[2][2] = "16";               //Hora Final
        this.r[3][0] = "  Debate         ";//Nombre del Programa
        this.r[3][1] = "10";               //Hora de Inicio
        this.r[3][2] = "11";               //Hora Final
    }

    public RadioEmisora(String nombre, int nroProgramas) {
        this.nombre = nombre;
        this.anioFundacion = 2008;
        this.nroProgramas = nroProgramas;
        this.r[0][0] = "  Podcast        ";//Nombre del Programa
        this.r[0][1] = "9";                //Hora de Inicio
        this.r[0][2] = "12";               //Hora Final
        this.r[1][0] = "  Pop            ";//Nombre del Programa
        this.r[1][1] = "12";               //Hora de Inicio
        this.r[1][2] = "13";               //Hora Final
        this.r[2][0] = "  Latinos        ";//Nombre del Programa
        this.r[2][1] = "13";               //Hora de Inicio
        this.r[2][2] = "14";               //Hora Final
        this.r[3][0] = "  Entrevistas    ";//Nombre del Programa
        this.r[3][1] = "15";               //Hora de Inicio
        this.r[3][2] = "16";               //Hora Final
    }

    //Getters y Setters
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

    public int getNroProgramas() {
        return nroProgramas;
    }

    public void setNroProgramas(int nroProgramas) {
        this.nroProgramas = nroProgramas;
    }

    public String[][] getR() {
        return r;
    }

    public void setR(String[][] r) {
        this.r = r;
    }

    public void Mostrar() {
        System.out.println("Radio emisora: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fundado en: " + this.anioFundacion);
        System.out.println("Número de programas emitidos: " + this.nroProgramas);
        System.out.println("   PROGRAMA:        HORAINICIO - HORAFINAL");
        for (int i = 0; i < this.nroProgramas; i++) {
            System.out.println((i + 1) + ".-" + this.r[i][0] + "\t" + this.r[i][1] + "\t" + this.r[i][2]);
        }
    }

    //B)
    public void Unahora(RadioEmisora r3) {
        int hi = 0;
        int hf = 0;
        int c = 0;
        for (int i = 0; i < this.nroProgramas; i++) {
            for (int j = 0; j < this.nroProgramas; j++) {
                hi = Integer.parseInt(r[i][1]);
                hf = Integer.parseInt(r[j][2]);
                if (hf - hi == 1) {
                    c++;
                }
            }

        }
        System.out.println("Hay " + c + " programas que duran una hora en esta Radio Emisora");
    }

    //C)
    public void Mayor(RadioEmisora r1) {
        int z = 0;
        int hora = 0;
        int m = 0;
        System.out.println("Ingrese la Hora: ");
        z = Leer.datoInt();
        for (int i = 0; i < this.nroProgramas; i++) {
            hora = Integer.parseInt(r[i][1]);
            if (hora == z) {
                m = m + 1;
            }
            else if (hora < z){
               m = m + 1;
            }
        }System.out.println(m);
    }
}
