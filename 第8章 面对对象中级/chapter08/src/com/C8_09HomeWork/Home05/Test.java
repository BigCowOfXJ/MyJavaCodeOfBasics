package com.C8_09HomeWork.Home05;



public class Test {
    public static void main(String[] args) {

        SavingsAccount c1 = new SavingsAccount(1000);
        c1.deposit(100);
        c1.withdraw(100);
        c1.deposit(100);
        System.out.println(c1.getBalance());
        c1.deposit(100);
        c1.deposit(100);
        System.out.println(c1.getBalance());
        c1.earnMonthlyInterest();
        System.out.println(c1.getBalance());
        c1.withdraw(100);
        c1.withdraw(100);
        c1.withdraw(100);
        System.out.println(c1.getBalance());
        c1.withdraw(100);
        c1.withdraw(100);
        System.out.println(c1.getBalance());
    }
}
