package com.C8_08SmallChangeSystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SamllChangeSystem {
    private Scanner myScanner = new Scanner(System.in);
    private int choice;
    boolean loop = true;
    private Date data;
    private SimpleDateFormat stand = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private double increase;
    private double decrease;
    private double balance;

    private String activity;

    String inMoney;
    String outMoney;

    public void Test() {

        do {
            System.out.println("------------------零钱通菜单-------------------");
            System.out.println("\t\t\t\t" + "1 零钱通明细" + "\t\t\t");
            System.out.println("\t\t\t\t" + "2 收益入账" + "\t\t\t");
            System.out.println("\t\t\t\t" + "3 消费" + "\t\t\t");
            System.out.println("\t\t\t\t" + "4 退出" + "\t\t\t");
            System.out.print("请选择（1 —— 4）：");

            choice = myScanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("------------------零钱通明细-------------------\n");
                    operation1();
                    break;
                case 2:
                    System.out.println("------------------收益入账-------------------\n");
                    operation2();

                    break;
                case 3:
                    System.out.println("------------------消费-------------------\n");
                    operation3();
                    break;
                case 4:

                    System.out.println("------------------你确定退出？Y/N-------------------\n");
                    operation4();
                    break;


                default:
                    System.out.println("-------------------你的输入有误，请重新输入-------------------\n\n");
            }

        } while (loop);

    }


    public void operation1() {

        if (inMoney == null) {
            return;
        }
        System.out.println(inMoney);

        if (outMoney == null) {
            return;
        }
        System.out.println(outMoney);
    }

    public void operation2() {
        data = new Date();

        System.out.print("存入金额：");
        while(true) {
            increase = myScanner.nextDouble();
            if(increase > 0){
                break;
            }
            System.out.print("输入金额不正确 ，请重新输入：");
        }
        balance += increase;
        if (inMoney == null)
            inMoney = "收益入账\t" + "+" + increase + "\t\t" + stand.format(data) + "\t" + "余额：" + balance;
        else
            inMoney += "\n收益入账\t" + "+" + increase + "\t\t" + stand.format(data) + "\t" + "余额：" + balance;
    }

    public void operation3() {
        System.out.print("消费活动：");
        activity = myScanner.next();

        data = new Date();
        System.out.print("消费金额：");

        while(true) {
            decrease = myScanner.nextDouble();
            if(decrease > 0 && decrease <= balance){
                break;
            }
            System.out.print("输入金额不正确 ，请重新输入：");
        }


        balance -= decrease;

        if (outMoney == null)
            outMoney = activity + "\t" + "-" + decrease + "\t\t" + stand.format(data) + "\t" + "余额：" + balance;
        else
            outMoney += "\n" + activity + "\t" + "-" + decrease + "\t\t" + stand.format(data) + "\t" + "余额：" + balance;
    }

    public void operation4() {
        while (true) {
            String judge = myScanner.next();
            if (judge.equals("Y")) {
                loop = false;
                System.out.println("------------------退出菜单-------------------\n");
                break;
            } else if (judge.equals("N")) {

                System.out.println("------------------您取消了退出菜单-------------------\n");
                break;
            } else {
                System.out.println("------------------你的输入有误，请重新输入-------------------\n");
            }
        }


    }
}
