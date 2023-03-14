package com.Annotation_;

public class J02Deprecat {

    //@Deprecated 可以修饰包，方法，属性，类，参数等等。。。
    //他修饰的表示已经过时的，不推荐使用但是荏苒可以使用的。
    //它可以做版本过度升级

    //@Documented
    //@Retention(RetentionPolicy.RUNTIME)
    //@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
    //public @interface Deprecated {
    //}



    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(aa.n1);
        System.out.println(aa.d1);
        System.out.println(aa.n2);
        System.out.println(aa.d2);
        System.out.println(aa.n3);
        System.out.println(aa.d3);

        aa.say();
        aa.say2();
    }
}

@Deprecated
class AA{
    @Deprecated
    public static final int n1 = 12;
    public static final double d1 = 12;
    @Deprecated
    public static int n2 = 20;
    public final double d2 = 20;
    @Deprecated
    public int n3 = 30;
    public final double d3 = 30;

    @Deprecated
    public static void say(){
        System.out.println("say is running ~~~~~~~");
    }

    public void say2(){
        System.out.println("say2 is running ~~~~~~~");
    }


}
