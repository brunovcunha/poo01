/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author aluno
 */
public class ContaCorrente {

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String nome;
    public String numeroConta;
    private double saldo;

    public ContaCorrente(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double saque) {

        if (saldo > saque) {
            saldo = saldo - saque;
            saldo = saldo - 0.001 * saldo;
        }

    }

    public void depositar(double deposito) {
        saldo = saldo + deposito;
        saldo = saldo - 0.001 * saldo;
    }

    public String exibe() {
        return "Nome: " + nome + "\nNúmero da conta: " + numeroConta + "\nTipo de conta: Corrente" + "\nSaldo: R$" + String.format("%.2f", saldo);
    }

}
