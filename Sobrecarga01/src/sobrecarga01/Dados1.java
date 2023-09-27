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
public class Dados1 {

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @return the c
     */
    public float getC() {
        return c;
    }

    /**
     * @return the d
     */
    public float getD() {
        return d;
    }
    private int a;
    private int b;
    private float c;
    private float d;

    public Dados1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public Dados1(float c, float d) {
        this.c = c;
        this.d = d;
    }    
}
