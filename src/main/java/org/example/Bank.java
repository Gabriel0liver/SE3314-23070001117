package org.example;
import java.util.*;

public class Bank {
    ArrayList<Account> accounts;

    /**
     *
     * _requires_:
     * _effects_:
     */
    public void createAccount(Customer c){
        accounts.add(new Account(c));
    }

    /**
     *
     * _requires_: A name of a customer
     * _effects_: Returns account with customer name if available, if not return null
     */
    public Account getAccount(String name){
        for(Account acc:accounts)
        {
            if(acc.customer.name.equals(name)){
                return acc;
            }
        }

        return null;
    }
}
