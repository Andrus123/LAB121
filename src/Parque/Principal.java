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
        Ninio n1 = new Ninio("Carla", "Peter", "Pepito", 12, new Estatura(100));
        Ninio n2 = new Ninio("Maria", "Juan", "Fernando", 11,new Estatura(80));
        Ninio n3 = new Ninio("Laura", "Carlos", "Juanito", 9,new Estatura(65));
        Ninio n4 = new Ninio("Patricia", "Chris", "Lucas", 10,new Estatura(80));
        Ninio n5 = new Ninio("Maria", "Juan", "Kelly", 11,new Estatura(75));
        Ninio n6 = new Ninio("Maria", "Juan", "Lorena", 5,new Estatura(50));
        
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
        Ninio n7 = new Ninio();
        Ninio n8 = new Ninio();
        Ninio n9 = new Ninio();
        Ninio n10 = new Ninio();
        Ninio n11 = new Ninio();
        Ninio n12 = new Ninio();
        AtraccionParque ap3 = new AtraccionParque();
        Parque par2 = new Parque("Carl Jr");
        
        ap3.adiNiño(n7, n8, n9);
        ap3.adiNiño(n10, n11, n12);
        par2.adiAtraccionParque(ap3);
        par2.mostrar();
        
        par2.nombreParqueyNiño();
    }
}
