package com.company;

public class Account<T, X> {
    private T id; // номер счета
    private X balance;
    Account(T i, X b) {
        this.id = i;
        this.balance = b;
    }

    public X getBalance() {
        return balance;
    }

    public T getId() {
        return id;
    }
}
