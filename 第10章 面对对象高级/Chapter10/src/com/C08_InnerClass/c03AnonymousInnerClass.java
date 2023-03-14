package com.C08_InnerClass;

public class c03AnonymousInnerClass {
    public static void main(String[] args) {


        /*
         class XXX implements AA {
            @Override
            public void say() {
                System.out.println("匿名AA say is running ～～～～～～");
            }

        };
        XXX的名字虽然结果显示com.C08_InnerClass.c03AnonymousInnerClass$1，
        但是不能用其创建对象。记住就行

        * */

        //不难看出，匿名内部类没有类名的(运行类型)，是系统默认给的，
        //程序员不能用这默认名创建对象。所以
        //new AA() {
        //            @Override
        //            public void say() {
        //                System.out.println("匿名AA say is running ～～～～～～");
        //            }
        //
        //        };
        //包含了类加载和对象创建。但是该对象若无变量指向，只能使用一次。
        //然后一定时间内被垃圾回收机制回收
        AA aa = new AA() {
            @Override
            public void say() {
                System.out.println("匿名AA say is running ～～～～～～");
            }

        };
        aa.say();

        //class XXX implements BB {.........}
        BB bb = new BB() {
            @Override
            public void say() {
                System.out.println("匿名BB say is running ～～～～～～～～～");
            }
        };
        bb.say();

        //class XXX extends CC {.........}
        CC cc = new CC() {
            @Override
            public void say() {
                System.out.println("匿名CC say is running ～～～～～～～～");
            }
        };
        cc.say();

        System.out.println(aa.getClass());
        System.out.println(bb.getClass());
        System.out.println(cc.getClass());

    }
}

interface AA {
    void say();
}

abstract class BB {
    public abstract void say();
}

class CC {
    public void say() {
        System.out.println("CC say is running ~~~~~~~~");
    }
}
