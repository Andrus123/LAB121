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
public class Principal {
    public static void main(String[] args){
        // Instanciar 6 objetos Niños, 2 objetos AtraccionParque y un objeto Parque
        Niño n1 = new Niño("Carla", "Peter", "Pepito", 12, new Estatura(100));
        Niño n2 = new Niño("Maria", "Juan", "Fernando", 11,new Estatura(80));
        Niño n3 = new Niño("Laura", "Carlos", "Juanito", 9,new Estatura(65));
        Niño n4 = new Niño("Patricia", "Chris", "Lucas", 10,new Estatura(80));
        Niño n5 = new Niño("Maria", "Juan", "Kelly", 11,new Estatura(75));
        Niño n6 = new Niño("Maria", "Juan", "Lorena", 5,new Estatura(50));
        
        AtraccionParque ap1 = new AtraccionParque("Salas 3D");
        AtraccionParque ap2 = new AtraccionParque("Montaña Rusa");
        
        Parque par1 = new Parque("Universal Studios");
        // Agregar 3 Niños a un objeto AtraccionParque y los otros 3 niños al 
        // otro AtraccionParque
        ap1.adiNiño(n1, n2, n3);
        ap2.adiNiño(n4, n5, n6);
       
        ap1.mostrar();
        ap2.mostrar();
        //Agregar los dos objetos AtraccionParque al objeto Parque y mostrar
        par1.adiAtraccionParque(ap1);
        par1.adiAtraccionParque(ap2);
        par1.mostrar();
        //Del objeto Parque mostrar los niños que miden mas de 70 centímetros de
        //estatura y tiene más de 5 años
        par1.edadyestatura();
        //Crear un objeto Parque igual que el inciso 1,2 y 3, pero solo con
        //constructores por defecto y mostrar los nombres de los padres de aquellos
        //Niños con mismo Nombre con el objeto Parque anteriormente creado
        Niño n7 = new Niño();
        Niño n8 = new Niño();
        Niño n9 = new Niño();
        Niño n10 = new Niño();
        Niño n11 = new Niño();
        Niño n12 = new Niño();
        AtraccionParque ap3 = new AtraccionParque();
        Parque par2 = new Parque("Carl Jr");
        
        ap3.adiNiño(n7, n8, n9);
        ap3.adiNiño(n10, n11, n12);
        par2.adiAtraccionParque(ap3);
        par2.mostrar();
        
        par2.nombreParqueyNiño();
    }
}
