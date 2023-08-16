/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_reloj;

/**
 *
 * @author Mateo Sbodio - Guillermo Rosales
 */
public class NewMain {

    /**
     * @param args the command line arguments
    
     */
    public static void main(String[] args) {
    Persona p1= new Persona("jkkk",20,175);
    Persona p2= new Persona("mmm",25,173);
    Reloj r1= new Reloj("casio","12345");
    relojFit r2= new relojFit("rolex","25767");
        System.out.println(p1.getNombre());
    p1.hablar(r1);
    p1.decirHora(r1);
        System.out.println(p2.getNombre());
    p2.comer(r2);
    p2.decirHora(r2);
    }
    
}