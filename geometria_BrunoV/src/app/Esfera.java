/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author brutj
 */
public class Esfera {
    public double raio;
    
    Esfera(double raio){
        this.raio = raio;
    }
    
    public double areaEsfera(){
        return 4 * Math.PI * Math.pow(raio, 2);
    }
    
    public double volumeEsfera(){
        return (4 * Math.PI * Math.pow(raio, 3)) / 3;
    }
    
    public String exibeEsfera(){
        return "\nraio = " + raio;
    }
}
