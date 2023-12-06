/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brutj
 */
public class Transacao {

    private List<Movimento> movimentos;

    public Transacao() {
        this.movimentos = new ArrayList<>();
    }

    public List<Movimento> getMovimentos() {
        return this.movimentos;
    }

    public boolean realizarTransacao(String data, Conta conta, String historico, float valor, int operacao) {
        Movimento movimento = new Movimento(data, conta, historico, valor, operacao);

        if (!movimento.movimentar()) {
            return false;
        } else {
            movimentos.add(movimento);
            return true;
        }
    }

    public boolean realizarTransacao(String data, Conta conta, Especial especial, String historico, float valor, int operacao) {
        Movimento movimento = new Movimento(data, conta, historico, valor, operacao);

        if (!movimento.movimentar(especial)) {
            return false;
        } else {
            movimentos.add(movimento);
            return true;
        }
    }

    public void estornarTransacao() {
        for (Movimento m : movimentos) {
            m = null;
        }
    }
}
