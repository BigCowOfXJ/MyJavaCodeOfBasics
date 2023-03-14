package com.C8_09HomeWork.Home05;

public class SavingsAccount extends BankAccount{
    private int num = 3;

    private static final double rate = 0.2;
    public SavingsAccount(double money){
        super(money);
    }

    @Override
    public void deposit(double money){
        if (num > 0) {
            super.deposit(money);
            num --;
            return;
        }

        super.deposit(money - 1);
    }
    public void deposit(){  //重写的方法也可以重载
        System.out.println("ddadasdasd");
    }

    @Override
    public void withdraw(double money){
        if(num > 0){
            super.withdraw(money);
            num --;
            return;
        }

        super.withdraw(money + 1);
    }

    public void earnMonthlyInterest(){
        num = 3;
        super.deposit(getBalance() * rate);

    }

}
