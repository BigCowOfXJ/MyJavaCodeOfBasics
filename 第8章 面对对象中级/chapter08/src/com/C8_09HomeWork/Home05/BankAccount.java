package com.C8_09HomeWork.Home05;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    //存款
    public void deposit(double money){
        balance += money;

    }


    //取款
    public void withdraw(double money){
        balance -= money;
    }

}
