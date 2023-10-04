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

import java.util.Scanner;
import pack2.ContaPoupanca;

public class App {

    /**
     * @param args the command line arguments
     */
    
    public static ContaPoupanca leDadosContaPoupanca(){
        System.out.println("Dados conta Poupança: ");
        Scanner s = new Scanner(System.in);
        System.out.print("informe o nome: ");
        String nome = s.nextLine();
        System.out.print("Número da conta: ");
        String numero = s.nextLine();
        System.out.print("Saldo da conta: ");
        double saldo = s.nextDouble();
        System.out.println("");
        
        ContaPoupanca poupanca1 = new ContaPoupanca(nome, numero, saldo);
        
        return poupanca1;
    }
    
    public static ContaCorrente leDadosContaCorrente(){
        System.out.println("Dados conta Corrente: ");
        Scanner s = new Scanner(System.in);
        System.out.print("informe o nome: ");
        String nome = s.nextLine();
        System.out.print("Número da conta: ");
        String numero = s.nextLine();
        System.out.print("Saldo da conta: ");
        double saldo = s.nextDouble();
         System.out.println("");
        
        ContaCorrente corrente1 = new ContaCorrente(nome, numero, saldo);
        
        return corrente1;
    }
    
    public static void menu(){
        Scanner s = new Scanner(System.in);
       System.out.println("----Menu----\n 1-ContaPoupanca 2-ContaCorrente 3-Sair");
        int n = s.nextInt();
    while (n!= 3) {
            switch (n) {
            case 1:
                ContaPoupanca poupanca1 = leDadosContaPoupanca();
                System.out.println("----Menu Poupanca----\n 1-Depositar 2-Sacar 3-Exibir 4-Voltar");
                int menPoupanca = s.nextInt();
                while (menPoupanca != 4) {
                    switch(menPoupanca) {
                        case 1:
                            System.out.println("Qual valor deseja depositar?");
                            double deposito = s.nextInt();
                            poupanca1.depositar(deposito);
                            System.out.printf("O valor de R$%.2f foi depositado\n", deposito);
                            break;
                        case 2:
                            System.out.println("Qual valor deseja sacar?");
                            double saque = s.nextInt();
                            poupanca1.sacar(saque);
                            System.out.printf("O valor de R$%.2f foi sacado\n", saque);

                            break;
                        case 3:
                            System.out.println(poupanca1.exibe());
                            break;
                    }
                    System.out.println("----Menu Poupanca----\n 1-Depositar 2-Sacar 3-Exibir 4-Voltar");
                    menPoupanca = s.nextInt();
                }
                break;

            case 2:
                ContaCorrente corrente1 =leDadosContaCorrente();
                System.out.println("----Menu Corrente----\n 1-Depositar 2-Sacar 3-Exibir 4-Voltar");

                int menCorrente = s.nextInt();
                while (menCorrente != 4) {
                    switch (menCorrente) {
                        case 1:
                            System.out.println("Qual valor deseja depositar?");
                            double deposito = s.nextInt();
                            corrente1.depositar(deposito);
                            System.out.printf("O valor de R$%.2f foi depositado\n", deposito);
                            break;
                        case 2:
                            System.out.println("Qual valor deseja sacar?");
                            double saque = s.nextInt();
                            corrente1.sacar(saque);
                            System.out.printf("O valor de R$%.2f foi sacado\n", saque);

                            break;
                        case 3:
                            System.out.println(corrente1.exibe());
                            break;
                    }
                    System.out.println("----Menu Corrente----\n 1-Depositar 2-Sacar 3-Exibir 4-Voltar");

                    menCorrente = s.nextInt();
                }
                break;
        }

        System.out.println("----Menu----\n 1-ContaPoupanca 2-ContaCorrente 3-Sair");
        n = s.nextInt();
    }
        
   }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic he
        menu();
      
    }
    
}
