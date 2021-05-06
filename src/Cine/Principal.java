/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        Cine c1 = new Cine("Monje Campero");
        c1.mostrar();
        Pelicula[] z = new Pelicula[20];
        z[0] = new Pelicula("Señor de los Anillos");
        z[1] = new Pelicula("Tenet");
        
//        Director[] dir = new Director[10];
//        dir[0]= new Director("Peter Jackson");
//        dir[1]= new Director("Christopher Nolan");
        
        Director d1 = new Director("Martin Scorscece","Comedia");
        Director d2 = new Director("David Fincher","Drama");
        
        Actor a1 = new Actor("Brad Pitt","Cap Charles");
        Actor a2 = new Actor("Edward Norton","Uberboyo");
        Actor a3 = new Actor("Christian Bale","Batman");
        
        Pelicula q1 = new Pelicula("The Wolf of Wall Street");
        q1.adiDirector(d1);
        q1.adiActor(a1);
        q1.adiActor(a3);
        
        Pelicula q2 = new Pelicula("Fight Club");
        q2.adiDirector(d2);
        q2.adiActor(a2);
        q2.adiActor(a3);
        
        c1.adiPelicula(q1);
        c1.adiPelicula(q2);
        
        c1.mostrar();
        
        Cine c2 = new Cine("Monje Campero", 2, z);
        c2.mostrar();
    }
}
