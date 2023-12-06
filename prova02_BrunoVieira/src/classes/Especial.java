/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author brutj
 */
public class Especial {

    /**
     * @return the limite
     */
    public float getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(float limite) {
        this.limite = limite;
    }

    /**
     * @return the tempo
     */
    public int getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    private float limite;
    private int tempo;

    public Especial() {
    }

    public Especial(float limite, int tempo) {
        this.limite = limite;
        this.tempo = tempo;
    }

    public float defineTaxacao(float saldo) {
        if (tempo < 12 || tempo >= 12 && tempo <= 23 && saldo <= 0) {
            return 0.002f;
        } else if (tempo >= 12 && tempo <= 23 && saldo > 0 || tempo > 23 && saldo <= 0) {
            return 0.0015f;
        } else if (tempo > 23 && saldo > 0) {
            return 0.001f;
        } else {
            return 0.0f;
        }
    }

}
