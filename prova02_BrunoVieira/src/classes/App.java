/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author brutj
 */
public class App {
    
    public static Scanner s = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> senhas = new ArrayList<>();
        senhas.add("user01:123");
        senhas.add("user02:1234");
        senhas.add("user03:12345");
        
        Validacao validacao = new Validacao();
        
        int tentativas = 0;
        
        while(tentativas < 3){
            System.out.println("Digite seu user:senha");
            String userSenha = s.nextLine();
            
            if(validacao.validaSenha(userSenha, senhas)){
                escolha();
                break;
            } else{
                System.out.println("user:senha incorretos, tente novamente");
                tentativas++;
            }
        }
        
        
    }
    
    public static void escolha(){
        System.out.println("Escolha uma opcao: ");
        System.out.println("Relatorio conta comum (1), Conta Especial (2)");
        
        int numConta = s.nextInt();
        
        if(numConta == 1){
            relatorioComum();
        } else if(numConta == 2){
            
        }
        else{
            System.out.println("Digite um valor Válido");
            escolha();
        }
    }
    
    public static void relatorioComum(){
        Transacao transacoes = new Transacao();
        Conta conta1 = new Conta();
        
        transacoes.realizarTransacao("06/12/2023", conta1, "Depósito Dinheiro", 500.0f, 1);
        
        transacoes.realizarTransacao("06/12/2023", conta1, "Saque Dinheiro", 300.0f, 0);
        transacoes.realizarTransacao("06/12/2023", conta1, "Depósito Dinheiro", 500.0f, 1);
        
        for(Movimento m : transacoes.getMovimentos()){
            System.out.println(m.getData());
            System.out.println(m.getHistorico());
            System.out.println(m.getValor());
            System.out.println(m.getOperacao());
        }
        
    }
}
