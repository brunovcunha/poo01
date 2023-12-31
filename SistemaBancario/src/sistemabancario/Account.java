/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;

/**
 *
 * @author brutj
 */
public class Account {
    private int number;
    private String holder;
    private double balance;
    
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }
    
     public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
         deposit(initialDeposit);
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return the holder
     */
    public String getHolder() {
        return holder;
    }

    /**
     * @param holder the holder to set
     */
    public void setHolder(String holder) {
        this.holder = holder;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
        public void withdraw(double amount){
        balance -= amount + 5.0;
    }
    
     public String toString(){
         return "Account " + number + ", Holder: "+ holder + ", Balance: $ " + String.format("%.2f", balance);
     }
}
