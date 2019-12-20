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
public class Manzana {
    protected String color;
    protected String variedad;
    protected int peso;

    
    public Manzana(){}
    
    public Manzana(String color){
        this.color = color; 
    }
    public Manzana (String color, String variedad){
        this.color = color;
        this.variedad = variedad;
    }
    public Manzana (String color, String variedad, int peso){
        this.color= color;
        this.variedad = variedad;
        this.peso=peso;
    }

    
    //*************************************************  
    public void setColor(String color) {
        this.color=color;
    }

    public String getColor() {
        return this.color;
    }

    public void setVariedad(String variedad) {
       this.variedad=variedad;
    }

    public String getVariedad() {
        return this.variedad;
    }

    public void setPeso(int peso) {
        this.peso=peso;
    }

    public int getPeso() {
       return this.peso;
    }
}
