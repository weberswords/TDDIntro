package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {



    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds.");
        }
        else {
            balance -= amount;
        }
    }
}