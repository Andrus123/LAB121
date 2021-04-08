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
public class Contacto {

    public String nombre;
    public int nroFono;
    public String correo;

    public Contacto() {
        this.nombre = "ruben";
        this.nroFono = 70118;
        this.correo = "rube@lo.com";
    }

    public Contacto(String nombre, int nroFono, String correo) {
        this.nombre = nombre;
        this.nroFono = nroFono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroFono() {
        return nroFono;
    }

    public void setNroFono(int nroFono) {
        this.nroFono = nroFono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void Mostrar() {
        System.out.println("Datos de Contacto");
        System.out.println("nombre = " + this.nombre);
        System.out.println("nro Fono = " + this.nroFono);
        System.out.println("nombre = " + this.correo);
    }

    //SOLUCION C 1RA FORMA
    public boolean verigualDominiCorreo(Contacto c) {

        int tam = this.correo.length(); //LENGTH DEVUELVE EL NUMERO DE CADENAS
        int pos = this.correo.indexOf("."); //IndexOf DEVUELVE LA POSICION DE DONDE SE ENCUENTRA EL CARACTER BUSCADO

        String dominio = this.correo.substring(pos, tam - pos); //Substring extrae una subcadena desde pos y un numero de caracteres

        int tamC = c.correo.length();
        int posC = c.correo.indexOf(".");
        String dominioC = c.correo.substring(posC, tamC - posC);

        if (dominio.equals(dominioC)) {
            return true;
        }
        return false;
    }
    
    //SOLUCION C 2DA FORMA
    //Metodo extrae dominio de correo
    public String extraeDominio(){
        int tam = this.correo.length();
        int pos = this.correo.indexOf(".") + 1;
        String dominio = this.correo.substring(pos,tam-pos);
        return dominio;
    }
}
