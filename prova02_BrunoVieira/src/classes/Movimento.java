/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author brutj
 */
public class Movimento {

    private String data;
    private Conta conta;
    private String historico;
    private float valor;
    private int operacao;
    private float saldoAnterior;

    final static int SACAR = 0;
    final static int DEPOSITAR = 1;

    public Movimento(String data, Conta conta, String historico, float valor, int operacao) {
        this.data = data;
        this.conta = conta;
        this.historico = historico;
        this.valor = valor;
        this.operacao = operacao;
    }

    public boolean movimentar() {
        saldoAnterior = conta.getSaldo();
        if (operacao == SACAR) {
            return conta.movimentar(valor, SACAR);
        } else {
            return conta.movimentar(valor, DEPOSITAR);
        }
    }
    
    public boolean movimentar(Especial especial){
        saldoAnterior = conta.getSaldo();
        if (operacao == SACAR) {
            return conta.movimentar(valor, SACAR, especial);
        } else {
            return conta.movimentar(valor, DEPOSITAR, especial);
        }
    }
}
