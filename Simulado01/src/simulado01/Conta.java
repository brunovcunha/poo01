/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado01;

/**
 *
 * @author brutj
 */
public class Conta {
    private int numero;
    private Cliente correntista;
    private float saldo;

    public Conta() {
    }

    public Conta(int numero, Cliente correntista, float saldo) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    public void depositar(float valorDeposito){
        saldo += valorDeposito;
    }
    
    public boolean sacar(float valorSaque){
        try{
            if(saldo > valorSaque){
            saldo -= valorSaque;
            return true;
        } else{
            throw new Restricoes("Saldo insuficiente para saque!");
        }
        } catch (Restricoes r){
            System.out.println("Restrição de saldo!");
        }
        return false;
    }
    
    public boolean movimentar(float valor, int operacao){
        if(operacao == 0){
            return this.sacar(valor);
        } else{
            this.depositar(valor);
            return true;
        }
    }
}
