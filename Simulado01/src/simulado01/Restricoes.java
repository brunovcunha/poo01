/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado01;

/**
 *
 * @author brutj
 */
public class Restricoes extends Exception{
    private String texto;
    public Restricoes(String texto){
        super();
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }
    
    
}
