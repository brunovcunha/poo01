/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado01;

/**
 *
 * @author brutj
 */
public class Movimento {

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the conta
     */
    public Conta getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    /**
     * @return the historico
     */
    public String getHistorico() {
        return historico;
    }

    /**
     * @param historico the historico to set
     */
    public void setHistorico(String historico) {
        this.historico = historico;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the operacao
     */
    public int getOperacao() {
        return operacao;
    }

    /**
     * @param operacao the operacao to set
     */
    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    /**
     * @return the saldoAnterior
     */
    public float getSaldoAnterior() {
        return saldoAnterior;
    }

    /**
     * @param saldoAnterior the saldoAnterior to set
     */
    public void setSaldoAnterior(float saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }
    private String data;
    private Conta conta;
    private String historico;
    private float valor;
    private int operacao;
    private float saldoAnterior;
    
    

    public Movimento(String data, Conta conta, String historico, float valor, int operacao) {
        this.data = data;
        this.conta = conta;
        this.historico = historico;
        this.valor = valor;
        this.operacao = operacao;
    }
    
    
   
    final static int SACAR = 0;
    final static int DEPOSITAR = 1;
    
    public boolean movimentar(){
        this.setSaldoAnterior(getConta().getSaldo());
        if(getOperacao() == SACAR){
            return getConta().movimentar(getValor(), SACAR);
        } else{
            return getConta().movimentar(getValor(), DEPOSITAR);
        }
    }
    
}
