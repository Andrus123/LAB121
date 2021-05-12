/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organizacion;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void findEstudiante(Normal x, Instituto y, Colegio z)
    {
        System.out.println("Ingrese el Alumno: ");
        String estx = Leer.dato();
        for(int i=0;i<x.nroEstudiantes;i++)
        {
            if(estx.equals(x.est[i])){
                System.out.println("Se encuentra en la Normal: "+x.getNombre());
            }
        }
        for(int i=0;i<y.nroEstudiantes;i++)
        {
            if(estx.equals(y.est[i])){
                System.out.println("Se encuentra en el Instituto: "+y.getNombre());
            }
        }
        for(int i=0;i<z.nroEstudiantes;i++)
        {
            if(estx.equals(z.est[i])){
                System.out.println("Se encuentra en el Colegio: "+z.getNombre());
            }
        }   
    }
    public static void findProf(Normal x, Instituto y, Colegio z)
    {
        System.out.println("Ingrese el Profesor: ");
        String prfx = Leer.dato();
        for(int i=0;i<x.NroProfesores;i++)
        {
            if(prfx.equals(x.prf[i])){
                System.out.println("Trabaja en la Normal: "+x.getNombre());
            }
        }
        for(int i=0;i<y.NroProfesores;i++)
        {
            if(prfx.equals(y.prf[i])){
                System.out.println("Trabaja en el Instituto: "+y.getNombre());
            }
        }
        for(int i=0;i<z.NroProfesores;i++)
        {
            if(prfx.equals(z.prf[i])){
                System.out.println("Trabaja en el Colegio: "+z.getNombre());
            }
        }
        
    }
    public static void main(String[] args){
        //a)
        Normal n1 = new Normal();
        Instituto in1 = new Instituto();
        Colegio c1 = new Colegio();
        n1.mostrar();
        in1.mostrar();
        c1.mostrar();
        //b)
        findEstudiante(n1,in1,c1);
        //c)
        findProf(n1,in1,c1);
        //d)
        in1.modanio();
        //f)
        c1.agregarProf();
        //g)
        n1.ordenar();
        System.out.println("Ordenado: ");
        n1.mostrar();
        //h)
        n1.dardbaja("Lic. Gonzales");
    }
}
