public class c702propertiseDetail {
    public static void main(String[] args) {
        
        //谈谈属性得细节

        //属性可以类比 c语言的全局变量（但又不完全相同）
        //
        //属性可以用修饰符修饰，并且可以自动赋值
        //但局部变量不会自动赋值，除了已经分配空间的数组。
        //局部变量不赋值的部分，是不能进行任何活动的。
        //

        Propertise propertise = new Propertise();
        
        System.out.println(propertise.info());
    }
}
class Propertise{
    byte n1;
    short n2 ; 
    char n3 ;
    int n4 ;
    long n5 ;
    float n6 ;
    double n7 ;
    boolean n8 ;
    String n9;
    int[] n10;
    String[] n11;

    public String info(){
        return "n1=" + n1 + "n2=" + n2 + "n3=" + n3 +
            "n4=" + n4 + "n5=" + n5 + "n6=" + n6 +
            "n7=" + n7 + "n8=" + n8 + "n9=" + n9 +
            "n10=" + n10 + "n11=" + n11 ;
    }
}
