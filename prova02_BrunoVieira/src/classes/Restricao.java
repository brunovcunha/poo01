/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author brutj
 */
public class Restricao extends Exception{
    private float saque;
    private float saldo;

    public Restricao(float saque, float saldo) {
        super();
        this.saque = saque;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Não é possível sacar R$" + saque + " de sua conta\n" + "saldo disponível: R$" + saldo; 
    }
    
    
    
}
