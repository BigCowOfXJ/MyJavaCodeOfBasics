public class c717OverLoadDetail {
    public static void main(String[] args) {
        /*
         * 这里我们探讨一下重载的细节
         * 
         * 1.方法名：必须相同（现在所知道的使用范围：一般是同类中使用）
         * 2.形参列表必须不一样，哪怕是一个类型都可以。对于形参的名字不作要求
         * 3.返回类型：无要求（不要求一致）
         */
        OLDetail olDetail = new OLDetail();
        olDetail.sum();;
        olDetail.sum(0, 0);
        olDetail.sum(0, 0);

    }
}

class OLDetail{

    public void sum (){
        System.out.println("sum() 被调用");
    }

    public int sum (int n1, int n2){
        System.out.println("sum (int n1, int n2) 被调用");

        return 0;
    }

    public double sum(int n1, double n2){
        System.out.println("sum (int n1, double n2) 被调用");
        return 0;
    }
}
