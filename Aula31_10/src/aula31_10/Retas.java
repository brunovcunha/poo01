/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula31_10;

/**
 *
 * @author aluno
 */
public class Retas {

    private double x1;
    private double x2;
    private double y1;
    private double y2;
    public static int cont;

    public Retas(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        cont++;
    }

    public double comprimento() {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
                
    }

    public String exibe() {
        return "Reta:\n" + "P1(" + x1 + "," + y1 + ")" + " e P2(" + x2 + "," + y2 + ")\n"
                + "Comprimento: " + String.format("%.2f", comprimento()); 
    }
    
     
}
