/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author brutj
 */
public class Cone {
    public double altura;
    public double raio;
    
    public Cone(double altura, double raio){
        this.altura = altura;
        this.raio = raio;
}
    public double volumeCone(double areaBase){
        return (areaBase * altura) / 3;
    }
    
    public double areaCone(double areaBase){
        double g = Math.pow(raio, 2) + Math.pow(altura, 2);
        double geratriz = Math.sqrt(g);
        return areaBase + (Math.PI * raio  * geratriz);
    }
    
     public String exibeCone(){
        return "Dados do Cone: " + "\nRaio = " + raio +  "\nAltura = " + altura;
    }
}
