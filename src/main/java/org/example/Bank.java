package org.example;
import java.util.*;

public class Bank {
    ArrayList<Account> accounts;

    public void createAccount(Customer c){
        accounts.add(new Account(c));
    }

    public Account getAccount(String name){
        accounts.forEach((Account a) -> {
            if(a.customer.name == name){
                return a;
            }
        });
        return null;
    }
}
