package org.example;

public class Account {
    Customer customer;
    int balance;
    public Account(Customer c){
        this.customer = c;
        this.balance = c.initialDeposit;
    }

    /**
     *
     * _requires_: integer
     * _effects_: adds amount to balance
     */
    public void depositMoney(int amount){
        balance += amount;
    }

    /**
     *
     * _requires_: integer
     * _effects_: subtracts amount from balance
     */
    public void withdrawMoney(int amount){
        balance -= amount;
    }

    /**
     *
     * _requires_:
     * _effects_: returns balance of account
     */
    public int checkBalance(){
        return balance;
    }
}
