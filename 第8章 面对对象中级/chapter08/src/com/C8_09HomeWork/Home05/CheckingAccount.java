package com.C8_09HomeWork.Home05;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(double balance) {

        super(balance);
    }

    @Override
    public void deposit(double money){
        super.deposit(money - 1);
    }

    @Override
    public void withdraw(double money){
        super.withdraw(money + 1);
    }
}
