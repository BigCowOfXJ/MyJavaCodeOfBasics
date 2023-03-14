package com.C08_InnerClass;

public class c05AnonymousInnerDetail02 {
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

    public static void main(String[] args) {new c05AnonymousInnerDetail02().show();}

    public void show(){
        c05AnonymousInnerDetail02 obj = new c05AnonymousInnerDetail02(){

            public static final int n1 = 30;
            //非静态内部类不允许出现静态的属性(除了fianal修饰)和方法
            //public static int n2 = 20;
            //不允许重写对应外部类的静态方法,因为该对象的运行类型继承了c05AnonymousInnerDetail02。
            //子类是不允许出现非静态方法和父类静态方法重名的现象，因为静态方法无法被重写，只能被子类同名的静态方法覆盖掉。
            //public void say(){}
            //public static void say();  //非静态内部类不允许有静态属性，匿名内部类和局部内部类不允许
            //用static修饰。内部类中只有成员内部类可以用static修饰(静态成员内部类)
            @Override
            public void say2(){
                System.out.println("匿名.say2 is running～～～～～");
            }
            @Override
            public void say3(){
                System.out.println("匿名类 say3 is running ~~~~~`");
                //下面两报错，因为静态方法中不允许出现this和super
                //虽然静态方法中的内部类无法访问对应的外部类的非静态属性和方法
                //但是非静态方法就可以
                c05AnonymousInnerDetail02.say();
                c05AnonymousInnerDetail02.this.say();
                c05AnonymousInnerDetail02.this.say2();
                say2(); //就近原则

                System.out.println("c04AnonymousInnerDetail.n1 = " + c05AnonymousInnerDetail02.n1);
                System.out.println("c04AnonymousInnerDetail.n1 = " + c05AnonymousInnerDetail02.this.n1);
                System.out.println("c04AnonymousInnerDetail.n2 = " + c05AnonymousInnerDetail02.n2);
                System.out.println("c04AnonymousInnerDetail.n2 = " + c05AnonymousInnerDetail02.this.n2);
                System.out.println("匿名类.n1 = " + n1); //遵循就近原则

            }
        };

        obj.say3();


    }
}
