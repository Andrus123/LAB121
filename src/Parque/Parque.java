/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parque;

/**
 *
 * @author Andrés Aquin
 */
public class Parque {
    private String nombre;
    private int nAP;
    private AtraccionParque[] AP = new AtraccionParque[15];
    
    public Parque(){
        this.nombre = "Disneyland";
        this.nAP = 3;
    }
    public void adiAtraccionParque(AtraccionParque x){
        AP[nAP] = x;
        nAP++;
    }
}
