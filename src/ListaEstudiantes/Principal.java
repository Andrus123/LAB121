/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEstudiantes;

/**
 *
 * @author andru
 */
public class Principal {
    
    public static void main(String[] args){
        
    //A)    
        ListaEstudiante n1 = new ListaEstudiante(); //Instanciado por defecto
        ListaEstudiante n2 = new ListaEstudiante("LAB 121", 17);
    
        n1.Mostrar();
        n2.Mostrar();
    //B)
        n1.vocal();
        n2.vocal();
    //C)    
        n1.igual(n1, n2);
        n2.igual(n1, n2);
    }
    
}
