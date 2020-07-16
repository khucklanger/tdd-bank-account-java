package org.xpdojo.bank;

public class Account {

    public int bal = 0;

    public int setBalance(int x) {
        bal=x;
        return bal;
    }

    public void depositMoney(int x ){
        bal += x;
    }

    public void withdrawMoney(int x ){
        bal -= x;
    }
}
