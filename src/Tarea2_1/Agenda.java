/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2_1;

import java.util.ArrayList;

/**
 *
 * @author andru
 */
public class Agenda {
    
    private ArrayList<Persona> personas;
    
    public Agenda(){
        personas = new ArrayList<>();
    }
    
    public void agregarPersona(int codigo, String nombre){
        Persona nuevo = new Persona(codigo,nombre);
        personas.add(nuevo);
    }
    
    public void visualizarPersona(){
        for(int i = 0; i<personas.size();i++){
            System.out.println(personas.get(i).getNombre());
        }
    }
}
