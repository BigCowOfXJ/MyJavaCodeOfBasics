package View;

import Utility.Utility;

import java.util.Scanner;

public class HouseView {


    /*
     * 0 完成界面设计
     * 1 完成房屋增加
     * 2 房屋查找
     * */


    //公用属性
    private Scanner myScanner = new Scanner(System.in);
    private String message =  "名字     电话           地址       房租        状态";
    private String message2 = "%s\t\t%s\t  %s\t\t%.2f\t\t%s";


    //任务0属性
    private char key1;  //这是接收列表选项

    //任务1属性
    private static final int HOUSEMAXNUM = 6;
    private House_Instance[] houses = new House_Instance[6];
    private int choiceNum;   //这是租户选择的房间号，（这里为了方便，设房间大小为6）
    private int capacity = HOUSEMAXNUM;  //这是房间的容量

    //任务2：查找房屋 属性
    private int key3;

    //任务6：退出
    private char judge;



    //测试格式的代码块
    {
        houses[0] = new House_Instance("ck", "12321312311", "北京", 2000, "已租");
        capacity --;
    }

    public void AccessMenu() {
        boolean loop = true;
        while (loop) {
            System.out.println("--------------------房屋出租系统---------------------");
            System.out.println("\t\t\t\t\t1 新增房屋");
            System.out.println("\t\t\t\t\t2 查找房屋");
            System.out.println("\t\t\t\t\t3 删除房屋");
            System.out.println("\t\t\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t\t\t5 房屋列表");
            System.out.println("\t\t\t\t\t6 退出");

            System.out.print("请输入你的选择：");
            key1 = Utility.readMenuSelection();

            switch (key1) {
                case '1':
                    System.out.println("\n--------------------新增房屋---------------------\n");
                    increaseHosue();
                    break;
                case '2':
                    System.out.println("\n--------------------查找房屋---------------------\n");

                    FindHouse();
                    break;
                case '3':
                    System.out.println("\n--------------------删除房屋---------------------\n");
                    DeleteHouse();
                    break;
                case '4':
                    System.out.println("\n--------------------修改房屋信息---------------------\n");
                    modifiHouse();

                    break;
                case '5':
                    System.out.println("\n--------------------房屋列表---------------------\n");
                    listHouse();
                    break;
                case '6':
                    System.out.println("\n--------------------退出---------------------\n");
                    System.out.print("你确定退出吗?（Y/S）：");
                    judge = Utility.readConfirmSelection();
                    if(judge == 'Y') {
                        loop = false;
                    }
                    break;


            }
        }
    }


    //任务1 ：房屋增添
    public void increaseHosue() {
        if (capacity == 0) {
            System.out.println("房屋已满，无法增添～～～\n增添失败\n");
            return;
        }

        System.out.print("请选择房间号：");
        while (true) {

            choiceNum = myScanner.nextInt();
            if (choiceNum >= 1 && choiceNum <= HOUSEMAXNUM) {
                break;
            }
            System.out.print("你的输入有误，请输入1 —— " + HOUSEMAXNUM + " :");
        }
        if(houses[choiceNum - 1] != null){
            System.out.println("房间已租，无法添加用户～～～～～～～～");
            return;
        }


        HouseService.increase(houses, choiceNum - 1);
        capacity--;

        System.out.println("\n——————————————————房屋添加成功————————————————————\n");


    }

    //任务2 ：查找房屋,这个可以重载。这里就不花时间了，后面任务重，拖不得。
    public void FindHouse() {
        System.out.print("请选择查找的房间号：");
        while (true) {

            choiceNum = myScanner.nextInt();
            if (choiceNum >= 1 && choiceNum <= HOUSEMAXNUM) {
                break;
            }
            System.out.print("你的输入有误，请输入1 —— " + HOUSEMAXNUM + " :");
        }
        int i = choiceNum - 1;
        if (houses[i] == null) {
            System.out.println("你所要查找的房屋未出租，无任何信息\n");
            return;
        }


        System.out.println(message);

        System.out.println(String.format(message2, houses[i].getName(), houses[i].getNumber(), houses[i].getAddress(), houses[i].getRent(), houses[i].getStatus()));

    }

    //任务3 ：删除房屋
    public void DeleteHouse(){

        System.out.print("请选择删除的房间号：");
        while (true) {

            choiceNum = myScanner.nextInt();
            if (choiceNum >= 1 && choiceNum <= HOUSEMAXNUM) {
                break;
            }
            System.out.print("你的输入有误，请输入1 —— " + HOUSEMAXNUM + " :");
        }
        int i = choiceNum - 1;

        if (houses[i] == null) {
            System.out.println("你所要删除的房屋未出租，无任何信息，无法删除～～～～\n");
            return;
        }


        houses[i] = null;
        capacity ++;
        System.out.println("\n——————————————————房屋删除成功————————————————————\n");

    }

    //任务4 ： 修改房屋
    public void modifiHouse(){
        if (capacity == 6) {
            System.out.println("所有的房屋无信息～～～\n删除失败\n");
            return;
        }

        System.out.print("请选择房间号：");
        while (true) {

            choiceNum = myScanner.nextInt();
            if (choiceNum >= 1 && choiceNum <= HOUSEMAXNUM) {
                break;
            }
            System.out.print("你的输入有误，请输入1 —— " + HOUSEMAXNUM + " :");
        }


        HouseService.midification(houses, choiceNum - 1);


        System.out.println("\n——————————————————房屋修改成功————————————————————\n");


    }


    //任务5 ： 房屋列表
    public void listHouse() {
        System.out.println(message);

        if(capacity == 6){
            System.out.println("无房屋出租，房屋无信息～～～～～～\n");
        }


        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                continue;
            } else {
                System.out.println(String.format(message2, houses[i].getName(), houses[i].getNumber(), houses[i].getAddress(), houses[i].getRent(), houses[i].getStatus()));
            }
        }
    }




}
