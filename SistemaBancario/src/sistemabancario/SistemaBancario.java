/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabancario;

import java.util.Scanner;

/**
 *
 * @author brutj
 */
public class SistemaBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Account conta1;
        
        System.out.print("Enter account number: ");
        int number = s.nextInt();
        System.out.print("Enter account holder: ");
        s.nextLine();
        String holder = s.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char initial = s.next().charAt(0);
        
        if(initial == 'y'){
            double initialDeposit = s.nextDouble();
            conta1 = new Account(number, holder, initialDeposit);
        } else{
            conta1 = new Account(number, holder);
        }
        System.out.println("");
        System.out.println("Account data: ");
        System.out.println(conta1);
        
        System.out.println("");
        System.out.print("Digite 1 para depósito ou 2 para saque: ");
        int operacao = s.nextInt();
        
        while(operacao == 1 || operacao == 2){
            
            if(operacao == 1){
            System.out.print("Enter a deposit value: ");
            double depositValue = s.nextDouble();
            conta1.deposit(depositValue);
            System.out.println("Updated account data: ");
            System.out.println(conta1);
        } else{
              System.out.print("Enter a withdraw value: ");
            double withdrawValue = s.nextDouble();
            conta1.withdraw(withdrawValue);
            System.out.println("Updated account data: ");
            System.out.println(conta1);
        }
            System.out.println("");
        System.out.print("Digite 1 para depósito ou 2 para saque: ");
        operacao = s.nextInt();
        }
        
    }
    
}
