package View;

import Utility.Utility;

import java.util.Scanner;

public class HouseService {

    //为了使用方便，该类的方法为静态（static）
    Scanner scanner = new Scanner(System.in);

    public static void increase(House_Instance[] houses, int num) {
        if (houses[num] != null) {
            System.out.println("房屋已租,添加房屋失败");
            return;
        }

        houses[num] = new House_Instance();
        System.out.print("姓名：");
        houses[num].setName(Utility.readString(4));
        System.out.print("电话：");
        houses[num].setNumber(Utility.readString(11));
        System.out.print("地址：");
        houses[num].setAddress(Utility.readString(15));
        System.out.print("月租：");
        houses[num].setRent(Utility.readInt());
        System.out.print("状态（未租/已租）：");
        houses[num].setStatus(Utility.readString(3));
    }

    public static void midification(House_Instance[] houses, int num){
        if(houses[num] == null){
            System.out.println("房间未出租，无法修改。请添加后修改～～～～～");
            return;
        }


        System.out.print("姓名：");
        houses[num].setName(Utility.readString(4));
        System.out.print("电话：");
        houses[num].setNumber(Utility.readString(11));
        System.out.print("地址：");
        houses[num].setAddress(Utility.readString(15));
        System.out.print("月租：");
        houses[num].setRent(Utility.readInt());
        System.out.print("状态（未租/已租）：");
        houses[num].setStatus(Utility.readString(3));
    }
}
