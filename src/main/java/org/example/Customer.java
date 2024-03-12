package org.example;

public class Customer {
    public int initialDeposit;
    String name;

    /**
     *
     * _requires_: name of customer and deposit amount
     * _effects_: creates a customer
     */
    public Customer(String name, int initialDeposit){
        this.name = name;
        this.initialDeposit = initialDeposit;
    }
}
