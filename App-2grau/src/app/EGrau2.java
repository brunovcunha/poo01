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
public class EGrau2 {
    public double a;
    public double b;
    public double c;
    
    public EGrau2(){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double delta(){
        return b * b - 4 * a * c;
    }
    
    public double calculaX1(double delta){
        double raiz = Math.sqrt(delta);
        return (-b +  raiz ) / (2*a);
    }
    public double calculaX2(double delta){
        double raiz = Math.sqrt(delta);
        return (-b -  raiz ) / (2*a);
    }
    
    public String exibe(double x1, double x2){
        return "x1 = " + x1 + " x2 = " + x2;
    }
}
