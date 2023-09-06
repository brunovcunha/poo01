/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author aluno
 */
public class Circulo {
    public double xc;
    public double yc;
    public double raio;
    
    Circulo(){
    this.xc = xc;
    this.yc = yc;
    this.raio = raio;
}

    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }
    public double comprimento(){
        return 2 * Math.PI * raio;
    }
    public String exibeCirculo(){
        return "XC = " + xc + "\nYC = " + yc + "\nraio = " + raio;
    }
}
