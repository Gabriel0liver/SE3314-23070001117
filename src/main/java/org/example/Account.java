package org.example;

public class Account {
    Customer customer;
    int balance;
    public Account(Customer c){
        this.customer = c;
        this.balance = c.initialDeposit;
    }

    public void depositMoney(int amount){
        balance += amount;
    }

    public void withdrawMoney(int amount){
        balance -= amount;
    }

    public int checkBalance(){
        return balance;
    }
}
