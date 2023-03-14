package com.C08_InnerClass;

public class c04AnonymousInnerDetail {
    public static final int n1 = 10;
    public static int n2 = 20;
    public int n3 = 30;
    public static void say(){
        System.out.println("c04AnonymousInnerDetail say is running ~~~~~");
    }
    public void say2(){
        System.out.println("c04AnonymousInnerDetail say is running ~~~~~");
    }
    public void say3(){}
    public static void main(String[] args) {
        c04AnonymousInnerDetail obj = new c04AnonymousInnerDetail(){

            public static final int n1 = 30;
            //非静态内部类不允许出现静态的属性(除了fianal修饰)和方法
            //public static int n2 = 20;
            //不允许重写对应外部类的静态方法
            //public void say();
            //public static void say();
            @Override
            public void say2(){
                System.out.println("匿名.say2 is running～～～～～");
            }
            @Override
            public void say3(){
                System.out.println("匿名类 say3 is running ~~~~~`");
                //下面两报错，因为静态方法中不允许出现this和super
                //所以静态方法中的内部类无法访问对应的外部类的非静态属性和方法
                //c04AnonymousInnerDetail.this.say();
                //c04AnonymousInnerDetail.this.say2();
                c04AnonymousInnerDetail.say();
                say2();
                System.out.println("c04AnonymousInnerDetail.n1 = " + c04AnonymousInnerDetail.n1);
                System.out.println("c04AnonymousInnerDetail.n2 = " + c04AnonymousInnerDetail.n2);
                System.out.println("匿名类.n1 = " + n1); //遵循就近原则

            }
        };

        obj.say3();

    }
}


