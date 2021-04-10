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
public class Libro extends  Publicacion{
    private int nroPag;
    
    public Libro(String titulo, double precio, int nroPag)
    {
        //en C# el constructor se lo referencia con "base"
        //se hace uso del constructor
        //en Java se lo referencia con "super"
        super(titulo, precio);
        this.nroPag = nroPag;
    }
    public Libro(String titulo){
        super(titulo);
        this.nroPag =  50;
    }
    
    
    public void mostrar(){
        //en C# se usa el termino "base"
        super.mostrar();  //Para evitar que este metodo se prefiera antes que el de padre(por que tienen el mismo nombre)
                           //lo llamamos con super
        System.out.println("Nro de Paginas: " + this.nroPag);
    }
    //  public double precioVenta(Libro x, Libro y){
//      return (this.precio + x.getPrecio() + y.getPrecio());    
//  }  
    
    public int getNroPag() {
        return nroPag;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }
    
}
