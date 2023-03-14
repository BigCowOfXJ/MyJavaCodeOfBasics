package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        CaiQuan caiQuan = new CaiQuan();
        caiQuan.test();
    }
}

class CaiQuan {

    public void test(){
        //1先看看界面情况
        String judge ;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("==================欢迎来到猜拳游戏=================\n");
        while(true){
            String instruct = "玩家是否进入游戏  y/n";
            System.out.println(instruct);
            judge = myScanner.next();

        
            if(judge.equals("n")){
                System.out.println("===============退出游戏================\n");
                break;
            }
            //2.以下是进入游戏
            else if(judge.equals("y")){
                int i = 1;
                int[] playArr = new int[3];
                int[] comArr = new int[3];
                int[] judge02 = new int[3] ;
                int winCount = 0;
                while(i <= 3){
                    //玩家出拳
                    //0： 石头 1： 剪刀  2 ：布
                    System.out.println("玩家出拳");
                    playArr[i - 1] = Player();     //int Player()
                    if(playArr[i - 1] > 2){
                        System.out.println("玩家乱出拳，默认判定玩家认输");
                    }

                    //电脑出拳
                    System.out.println("电脑出拳 , 请作稍等～～～～～～～～");
                    comArr[i - 1] = Computer();    //int Computer()

                    //对比结果，并输出该轮详细情况和输赢
                    judge02[i - 1] = CompareResult(playArr[i - 1], comArr[i - 1], i);   //int CompareResult()
                    if(judge02[i - 1] == 1){
                        winCount ++;
                    }


                    i++;

                }
                PrintResult(playArr,comArr,winCount,judge02);  // void PrintResult



                System.out.println("=====================本局游戏结束===================\n");

            }else{
                System.out.println("=============输入错误，请重新输入===============\n");
            }


        }

    }

    public int Player(){
        int num ;
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();
        return num;
    }

    public int Computer(){
        int num ;
        Random rand = new Random();

        num = rand.nextInt(3);
        return num;
    }

    public int CompareResult(int play, int com, int count){

        System.out.println("局数" + "\t\t\t" + "玩家的出拳" + "\t\t" + "电脑出拳" + "\t\t" + "输赢情况" ) ;
        System.out.print(count + "\t\t\t" + play + "\t\t\t" + com + "\t\t\t" );

        if(play == com){
            System.out.println("平手\n");
            return 2;
        }else if(play == 0 && com == 1){
            System.out.println("玩家赢\n");
            return 1;
        }else if(play == 1 && play == 2){
            System.out.println("玩家赢\n");
            return 1;
        }else if(play == 2 && com == 0){
            System.out.println("玩家赢\n");
            return 1;
        }else{
            System.out.println("电脑赢\n");
            return 0;
        }

        


    }

    public void PrintResult(int[] playArr,int[] comArr,int winCount,int[] judge02){

        System.out.println("局数" + "\t\t\t" + "玩家的出拳" + "\t\t" + "电脑出圈" + "\t\t" + "输赢情况" ) ;

        for (int i = 0; i < judge02.length; i++) {
            System.out.print(i + 1 + "\t\t\t");
            System.out.print(playArr[i] + "\t\t\t");
            System.out.print(comArr[i] + "\t\t\t");

            if(judge02[i] == 1){
                System.out.println("玩家赢");
            }else if(judge02[i] == 0){
                System.out.println("电脑赢");
            }else{
                System.out.println("平手");
            }
        }

        System.out.println();




    }

}