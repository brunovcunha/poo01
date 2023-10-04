/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

/**
 *
 * @author aluno
 */
public class ContaPoupanca {
    public String nome;
    public String numeroConta;
    double saldo;
  

    public ContaPoupanca(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double saque) {

        if (saldo > saque) {
            saldo = saldo - saque;
             saldo = saldo - 0.0005 * saldo;
        }

    }

    public void depositar(double deposito) {
        saldo = saldo + deposito;
    }

    public String exibe() {
        return "Nome: " + nome + "\nNúmero da conta: " + numeroConta + "\nTipo de conta: Poupança" + "\nSaldo: R$" + String.format("%.2f", saldo);
    }

}
