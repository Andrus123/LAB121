/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenciaViajes;

/**
 *
 * @author andru
 */
public class AgenciaViajes {
    private String nombre;
    private String direccion;
    private int NroBuses;
    private String[][] bus = new String[3][30];
    
    public AgenciaViajes(){
        this.nombre = "Amazonas";
        this.direccion = "Av. Juan de las Lomas #34";
        this.NroBuses = 3;
        this.bus[0][0] = "BCJ123"; //Placa
        this.bus[0][1] = "60 personas"; //Capacidad
        this.bus[0][2] = "Semicama"; //Tipo
        this.bus[1][0] = "FCK123"; //Placa
        this.bus[1][1] = "80 personas"; //Capacidad
        this.bus[1][2] = "Buscama"; //Tipo
        this.bus[2][0] = "MRD123"; //Placa
        this.bus[2][1] = "70 personas"; //Capacidad
        this.bus[2][2] = "Normal"; //Tipo
    }

    public AgenciaViajes(String nombre, String direccion, int NroBuses) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.NroBuses = NroBuses;
        this.bus[0][0] = "LALA123"; //Placa
        this.bus[0][1] = "70 personas"; //Capacidad
        this.bus[0][2] = "Semicama"; //Tipo
        this.bus[1][0] = "LON123"; //Placa
        this.bus[1][1] = "80 personas"; //Capacidad
        this.bus[1][2] = "Buscama"; //Tipo
        this.bus[2][0] = "MLN123"; //Placa
        this.bus[2][1] = "70 personas"; //Capacidad
        this.bus[2][2] = "Normal"; //Tipo
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNroBuses() {
        return NroBuses;
    }

    public void setNroBuses(int NroBuses) {
        this.NroBuses = NroBuses;
    }

    public String[][] getBus() {
        return bus;
    }

    public void setBus(String[][] bus) {
        this.bus = bus;
    }
    
    
    public void mostrar(){
        System.out.println("Nombre de la Agencia: " + this.nombre);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Cantidad de Buses: " + this.NroBuses);
    }
    
}
