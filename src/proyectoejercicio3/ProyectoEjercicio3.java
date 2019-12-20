/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio3;

/**
 *
 * @author Ingenieria
 */
public class ProyectoEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Uso del constructor vacio
        Manzana manzanita = new Manzana();
        manzanita.setColor("Rojo");
        manzanita.setVariedad("Criolla");
        manzanita.setPeso(250);
        
        //Uso del constructor con un parametro
        Manzana manzanita2 = new Manzana("Verde");
        manzanita2.setVariedad("Americana");
        manzanita2.setPeso(450);
        
        //Uso del constructor con dos parametros
        Manzana manzanita3 = new Manzana("Rojo Oscuro","Gala");
        manzanita3.setPeso(500);
        
        //Uso del constructor con todos sus parametros
        Manzana manzanita4 = new Manzana("Amarilla","Americana",350);
    }
    
}
