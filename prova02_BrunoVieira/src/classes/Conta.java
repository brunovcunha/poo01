/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author brutj
 */
public class Conta {

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the correntista
     */
    public Cliente getCorrentista() {
        return correntista;
    }

    /**
     * @param correntista the correntista to set
     */
    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
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

    public void depositar(float valorDeposito) {
        saldo += valorDeposito;
    }

    public void depositar(float valorDeposisto, Especial especial) {
        float taxa = valorDeposisto * 0.05f;
        if (especial != null) {
            if (especial.getLimite() == 0) {
                depositar(valorDeposisto);
            } else {
                valorDeposisto -= taxa;
                saldo += valorDeposisto;
            }
        }
    }

    public boolean sacar(float valorSaque) {

        try {
            float taxa = valorSaque * 0.05f;
            valorSaque += taxa;

            if (valorSaque <= saldo) {
                saldo -= valorSaque;
                return true;
            } else {
                throw new Restricao(valorSaque, saldo);
            }
        } catch (Exception e) {
            System.err.println("Exceção de saldo");
        }
        return false;
    }

    public boolean sacar(float valorSaque, Especial especial) {
        try {
            float taxa = especial.defineTaxacao(saldo);
            float taxaCobrada = valorSaque * taxa;
            valorSaque += taxaCobrada;

            if (saldo >= valorSaque) {
                saldo -= valorSaque;
                return true;
            } else {
                throw new Restricao(valorSaque, saldo);
            }
        } catch (Restricao e) {
            System.out.println("Exceção de saque");

        }
        return false;
    }

    public boolean movimentar(float valor, int operacao) {
        if (operacao == 0) {
            return sacar(valor);
        } else {
            depositar(valor);
            return true;
        }
    }

    public boolean movimentar(float valor, int operacao, Especial especial) {
        if (operacao == 0) {
            return sacar(valor, especial);
        } else {
            depositar(valor, especial);
            return true;
        }
    }
}
