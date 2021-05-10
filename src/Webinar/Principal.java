/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Webinar;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args) {
        // 1.- Crear 4 invitados, 2 webinar, 1 objeto Plataforma webinar
        Invitado inv1 = new Invitado("Maria", "04/07/2021", "15:21",
                "www.meet.com.xwa", new Tema(), "Licenciada", "Av Montes", "Directora");
        Invitado inv2 = new Invitado("Juan", "04/07/2021", "15:21",
                "www.meet.com.xwa", new Tema(), "Licenciado", "Av Montes", "CFO");
        Invitado inv3 = new Invitado("Pedro", "04/07/2021", "15:21",
                "www.meet.com.xwa", new Tema(), "Licenciado", "Av Montes", "Director");
        Invitado inv4 = new Invitado("Andres", "04/07/2021", "15:21",
                "www.meet.com.xwa", new Tema(), "Ingeniero", "Av Montes", "CEO");
        inv1.mostrar();
        inv2.mostrar();
        inv3.mostrar();
        inv4.mostrar();
        
        Webinar w1 = new Webinar("Base de datos", "mojix");
        w1.adiInvitado(inv1);
        w1.adiInvitado(inv2);
        Webinar w2 = new Webinar("AI", "Carrera Informatica");
        w2.adiInvitado(inv3);
        w2.adiInvitado(inv4);
        
//        w1.mostrar();
//        w2.mostrar();
        
        PlataformaWebinar pw = new PlataformaWebinar("Coursera");
        pw.adiWebinar(w1);
        pw.adiWebinar(w2);
        
        pw.mostrar();
        //Verificar si el invitado X esta en la plataformaWebinar
        Invitado X = new Invitado("Kelly", "04/07/2021", "15:21",
                "www.meet.com.xwa", new Tema(), "Administradora", "Av Montes", "CEO");
        w1.adiInvitado(X);
        pw.mostrar();
        if (pw.verificarInvitado(X))
            System.out.println("Si está");
        else
            System.out.println("No está");
        
        PlataformaWebinar p2 = new PlataformaWebinar("EdX");
        //Verificar si el Webinar X está en la plataforma Coursera y EdX
        p2.adiWebinar(w2);
        
        if(pw.verificarWebinar(p2,"AI"))
            System.out.println("Si está en ambas plataformas");
        else
            System.out.println("No está en ambas plataformas");
        
    }
}
