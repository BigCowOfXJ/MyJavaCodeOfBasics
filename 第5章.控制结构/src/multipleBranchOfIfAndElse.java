import java.util.Scanner;
public class multipleBranchOfIfAndElse {
    public static void main(String[] args){
        //马保国的信誉积分评级
        Scanner input = new Scanner(System.in);
        int credit = input.nextInt();

        if(credit > 100 && credit < 0){
            System.out.println("输入错误");
        }
        else if(credit <= 100 && credit >= 80){
            System.out.println("优");
        }else if(credit < 80 && credit >= 60){
            System.out.println("良");
        }else{
            System.out.println("差");
        }




    }
    
}
