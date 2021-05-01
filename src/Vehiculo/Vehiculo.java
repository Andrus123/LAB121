/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author Andrés Aquin
 */
public class Vehiculo {
    private String marca;
    private String placa;
    private Carroceria c;
    private int nroNeumaticos;
    private Neumatico[] n = new Neumatico[20];
    
    public Vehiculo(){
        this.marca = "TESLA";
        this.placa = "BIT-256";
        this.c = new Carroceria();
        this.nroNeumaticos = 4;
        this.n[0] = new Neumatico("Goodyear",15,750.50);
        this.n[1] = new Neumatico("Goodyear",15,750.50);
        this.n[2] = new Neumatico("Goodyear",15,750.50);
        this.n[3] = new Neumatico("Goodyear",15,750.50);
    }

    public Vehiculo(String marca, String placa, int nroNeumaticos) {
        this.marca = marca;
        this.placa = placa;
        this.nroNeumaticos = nroNeumaticos;
    }
    
    public void Mostrar(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Placa: "+getPlaca());
        this.c.Mostrar();
        System.out.println("N° de Neumaticos: "+getNroNeumaticos());
        for(int i=0;i<getNroNeumaticos();i++){
            this.n[i].Mostrar();
        }
    }
    
    public void Compcolor(String x){
        if(this.c.getColor()==x){
            System.out.println("La carroceria si es de color: "+x);
        }else{
            System.out.println("La carroceria no es de color "+x+", es de color "
                                +c.getColor());
        }
    }
    
    public void TotalNeum(){
        double total = 0;
        for(int i=0; i<this.nroNeumaticos;i++){
            total = total + this.n[i].getPrecio();
        }
        System.out.println("El precio total de todos los neumaticos es: "+total);
    }
    public void Detneumatico(String z){
        int c =0;
        for(int i=0; i<this.nroNeumaticos;i++){
            if(this.n[i].getMarca()==z){
                c++;
            }
        }System.out.println("Cantidad de neumaticos de marca: "+z+" = "+c);
    }
    public void cambiarColor(String colornuevo){
        c.setColor(colornuevo);
        c.Mostrar();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Carroceria getC() {
        return c;
    }

    public void setC(Carroceria c) {
        this.c = c;
    }

    public int getNroNeumaticos() {
        return nroNeumaticos;
    }

    public void setNroNeumaticos(int nroNeumaticos) {
        this.nroNeumaticos = nroNeumaticos;
    }

    public Neumatico[] getN() {
        return n;
    }

    public void setN(Neumatico[] n) {
        this.n = n;
    }
    
}
