/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga01;

/**
 *
 * @author aluno
 */
public class Adicao1 {
    
    public Adicao1(){
        
    }

    public int addInt(int a, int b) {
        return a + b;
    }

    public float addFloat(float c, float d) {
        return c + d;
    }
    
    public String exibeInt(int a, int b, int soma){
        return String.format("O resultado de %d + %d é %d", a, b, soma);
    }
    
    public String exibeFloat(float c, float d, float soma){
        return String.format("O resultado de %.2f + %.2f é %.2f", c, d, soma);
    }
}
