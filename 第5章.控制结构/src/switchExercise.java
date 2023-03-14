import java.util.Scanner;
public class switchExercise {
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);


        //题一 ： 小写字母转化为大写字母
        char charNum = myScanner.next().charAt(0);

        switch (charNum) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;

            default:
                System.out.println("other");
                break;
        }

        //题二  判断学生是否及格，以60分为标准

        double score = myScanner.nextInt();
        if(score >= 0 && score <= 100){
            switch((int)(score / 60)){

                case 0:
                    System.out.println("及格");
                    break;
                case 1:
                    System.out.println("不及格");
                    break;
            }
        }
        else{
            System.out.println("输入有误");
        }

        //题三：指定月份所属于的季节

        int month = myScanner.nextInt();

        switch(month){
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季");
                break;
            default :
                System.out.println("输入的季节有误");



        }

    }
}
