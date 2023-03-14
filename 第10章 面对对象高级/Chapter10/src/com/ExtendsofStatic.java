package com;

public class ExtendsofStatic {
}

class Demo {
    public static void main(String[] args) {
        // 子类SonB继承父类Father，子类可以获取父类的所有属性和方法，无论是静态的还是非静态的。
        // 表明静态属性和静态方法可以被继承
        SonB sonB = new SonB();
        System.out.println(sonB.staticStr);// 获取父类的静态变量
        System.out.println(sonB.notStaticStr);// 获取父类的成员变量（非静态变量）
        sonB.staticMethod();// 调用父类的静态方法
        sonB.notStaticMethod();// 调用父类的非静态方法（成员方法）

        System.out.println("=============================================");

        // 表明在使用多态的情况下，静态属性和静态方法又可以被继承
        Father sonBF = new SonB();
        System.out.println(sonBF.staticStr);// 多态获取父类的静态变量
        System.out.println(sonBF.notStaticStr);// 多态获取父类的成员变量（非静态变量）
        sonBF.staticMethod();// 多态调用父类的静态方法
        sonBF.notStaticMethod();// 多态调用父类的非静态方法（成员方法）

        System.out.println("=============================================");
        System.out.println("=============================================");

        // 子类SonA继承父类Father，并且重写了父类的属性和方法。
        // 表明父类的静态属性和静态方法可以被覆盖
        SonA sonA = new SonA();
        System.out.println(sonA.staticStr);// 获取子类重写后的静态变量
        System.out.println(sonA.notStaticStr);// 获取子类重写后的成员变量（非静态变量）
        sonA.staticMethod();// 调用子类重写后的静态方法
        sonA.notStaticMethod();// 调用子类重写后的非静态方法（成员方法）

        System.out.println("=============================================");

        // 表明父类的静态属性和静态方法可以被覆盖，但覆盖后就没有多态了
        Father sonAF = new SonA();
        System.out.println(sonAF.staticStr);// 多态获取子类重写后的静态变量
        System.out.println(sonAF.notStaticStr);// 多态获取子类重写后的成员变量（非静态变量）
        sonAF.staticMethod();// 多态调用子类重写后的静态方法
        sonAF.notStaticMethod();// 多态调用子类重写后的非静态方法（成员方法）

        Father.staticMethod();
        SonA.staticMethod();
    }
}

/**
 * 父类
 */
class Father {
    public static String staticStr = "父类的静态变量";
    public String notStaticStr = "父类的成员变量（非静态变量）";

    public static void staticMethod() {
        System.out.println("父类的静态方法");
    }

    public void notStaticMethod() {
        System.out.println("父类的成员方法（非静态方法）");
    }
}

/**
 * 子类继承父类，改写静态变量和方法
 */
class SonA extends Father {
    public static String staticStr = "子类改写后的静态变量";
    public String notStaticStr = "子类改写后的成员变量（非静态变量）";

    public static void staticMethod() {
        System.out.println("子类改写后的静态方法");
    }
    //下面代码会报错，父类静态方法不允许子类非静态方法与其重名
    //因为静态方法无法被重写，只能被覆盖。(一定程度上 重写 ！= 覆盖)
//    public void staticMethod() {
//        System.out.println("子类改写后的静态方法");
//    }

    @Override
    public void notStaticMethod() {
        // 成员方法是可以被子类重写的，这里仅作说明
        System.out.println("子类改写后的成员方法（非静态方法）");
    }
}

/**
 * 子类继承父类中的所有属性和方法，但不修改
 */
class SonB extends Father {

}

/*打印结果：
    父类的静态变量
    父类的成员变量（非静态变量）
    父类的静态方法
    父类的成员方法（非静态方法）
    =============================================
    父类的静态变量
    父类的成员变量（非静态变量）
    父类的静态方法
    父类的成员方法（非静态方法）
    =============================================
    =============================================
    子类改写后的静态变量
    子类改写后的成员变量（非静态变量）
    子类改写后的静态方法
    子类改写后的成员方法（非静态方法）
    =============================================
    父类的静态变量
    父类的成员变量（非静态变量）
    父类的静态方法
    子类改写后的成员方法（非静态方法）
    父类的静态方法
    子类改写后的静态方法
 */