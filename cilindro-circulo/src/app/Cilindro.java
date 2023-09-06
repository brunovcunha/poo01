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
public class Cilindro {

    public double altura;
    
    public Cilindro(double altura){
        this.altura = altura;
    }
    public double area(double areaBase, double comprimento){
        return 2 * areaBase + comprimento * altura;
    }
    public double volume(double areaBase){
        return areaBase * altura;
    }
    public String exibeCilindro(double raio){
        return "Dados do Cilindro:\n" + "\nRaio = " + raio +  "\nAltura = " + altura;
    }
}
