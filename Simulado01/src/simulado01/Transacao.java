/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado01;

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
        return movimentos;
    }
    
    
    
    public boolean realizarTransacao(String data, Conta conta, String historico, float valor, int operacao){
        Movimento mov = new Movimento(data, conta, historico, valor, operacao);
        
        if(mov.movimentar() == true){
            movimentos.add(mov);
            return true;
        } else{
            return false;
        }
    }
    
    public void extornarTransacao(){
        for(Movimento m : movimentos){
            m = null;
        }
    }
}
