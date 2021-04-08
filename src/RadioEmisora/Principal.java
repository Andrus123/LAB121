/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadioEmisora;

/**
 *
 * @author andru
 */
public class Principal {
    
    public static void main(String[] args){
        
        //a. Instanciar 3 obj RadioEmisorasde diferente manera, con 2,3 4 programas respectivamente
        RadioEmisora r1 = new RadioEmisora();
        RadioEmisora r2 = new RadioEmisora("Radio Fides",1939,3);
        RadioEmisora r3 = new RadioEmisora("Radio Disney Bolivia",4);
        r1.Mostrar();
        r2.Mostrar();
        r3.Mostrar();
        //b. Dado la ultima RadioEmisora, cuantosprogramas tienen duración de 1 hora??.
        r3.Unahora(r3);
        //c. Dado  tres  radioemisoras,  mostrar  el  nombre  y  la  antigüedad  de  la  radioemisora(s)  
        //que  tenga  el mayor número de programas que empiezan antes o igual a la hora z
        r1.Mayor(r1);
        r2.Mayor(r2);
        r3.Mayor(r3);
    }   
    
}
