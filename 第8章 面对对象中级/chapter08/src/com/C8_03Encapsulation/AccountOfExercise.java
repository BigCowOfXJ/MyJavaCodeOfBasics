package com.C8_03Encapsulation;

public class AccountOfExercise {

    private String name;
    private double balance;
    private String pwd;

    public AccountOfExercise(String name, double balance, String pwd) {
        setBalance(balance);
        setName(name);
        setPwd(pwd);
    }
    public AccountOfExercise(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name.length() < 2 || name.length() > 4){
            System.out.println("你输入的名字有误，给默认值：无名～～～～～～");
            this.name = "无名";
            return ;
        }
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        if(balance < 20){
            System.out.println("你的余额不达标，暂时为20～～～～");
            this.balance = 20;
            return;
        }
        this.balance = balance;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length() != 6){
            System.out.println("密码长度有问题，给默认值 ： 000000");
            this.pwd = "000000";
            return ;
        }

        this.pwd = pwd;
    }


    public String info(String pwd) {
        if( !pwd.equals(this.pwd) ){
            return "你输入的密码不正确，无法查看信息";
        }

        return "输入密码正确\n" + "AccountOfExercise{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
