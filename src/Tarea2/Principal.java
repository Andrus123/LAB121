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
public class Principal {
    
    public static void main(String[] args){
        
        //SOLUCION A
        Agenda a1 = new Agenda();//Instanciado por constructor por defecto
        Agenda a2 = new Agenda("ricardo",2021);//Instanciado por Constructor Parametrizado
        
        Contacto c1 = new Contacto();
        Contacto c2 = new Contacto("sergio",60519,"ser@ho.es");
        
        a1.Mostrar();
        a2.Mostrar();
        
        c1.Mostrar();
        c2.Mostrar();
        
        //SOLUCION B
        System.out.println("ADICIONAR CONTACTO!");
        a1.adicionarContacto(c1);
        a1.Mostrar();
        
        //SOLUCION C
        System.out.println("Determine si los dos contactos son del mismo dominio del correo");
        //1ERA FORMA:SOLUCION C, DETERMINE SI LOS DOS CONTACTOS SON DEL MISMO DOMINIO DEL CORREO
        if(c1.verigualDominiCorreo(c2)){
            System.out.println("SI CORRESPONDEN AL MISMO DOMINIO!!");
        }else{
            System.out.println("NO CORRESPONDEN AL MISMO DOMINIO!!");
        }
        
        //2DA FORMA: SOLUCION C, DETERMINE SI LOS DOS CONTACTOS SON DEL MISMO DOMINIO DEL CORREO
        //SE DEFINE UN METODO extraeDominio QUE DEVUELVE EL DOMINIO
        if(c1.extraeDominio().equals(c2.extraeDominio())){
            System.out.println("SI CORRESPONDEN AL MISMO DOMINIO" + c1.extraeDominio());
        }
        else{
            System.out.println("NO CORRESPONDEN AL MISMO DOMINIO" + c1.extraeDominio() + " " + c2.extraeDominio());
        }
        
 //SOLUCION D
        System.out.println("Ordenamos la agenda alfabéticamente");
        a1.Mostrar();
       
    }
}
