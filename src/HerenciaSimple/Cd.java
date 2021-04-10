/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaSimple;

/**
 *
 * @author andru
 */
public class Cd extends Publicacion{
    private int tmpRep;
            
    public Cd(){
        super("Kaliman", 7);
        this.tmpRep = 30;
        
        this.nAutores = 4;
        a[0][0] = "ana";  a[0][1] = "peru"; 
        a[1][0] = "jorge"; a[1][1] = "bolivia";
        a[2][0] = "adrian"; a[2][1] = "chile";
        a[3][0] = "ruben"; a[3][1] = "colombia";
    }
    public void mostrarCd(){
        this.mostrar();
        System.out.println("Tiempo de reproduccion: " + this.tmpRep);
        
    }

    public int getTmpRep() {
        return tmpRep;
    }

    public void setTmpRep(int tmpRep) {
        this.tmpRep = tmpRep;
    }
    
//  public double precioVenta(Libro x, Libro y){
//      return (this.precio + x.getPrecio() + y.getPrecio());    
//  }  
}
