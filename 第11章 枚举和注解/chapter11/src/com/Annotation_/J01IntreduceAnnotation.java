package com.Annotation_;

public class J01IntreduceAnnotation {
    public static void main(String[] args) {

        //注解的理解
        //
        //1)注解(Annotation)也被称为元数据(Metadata），用于修饰解释 包.
        //类、方法、属性、构造器、局部变量等数据信息。
        //2)和注释一样，注解不影响程序逻辑，但注解可以被编译或运行，相当子
        //嵌入在代码中的补充信息。
        //3)在JavaSE中，注解的使用目的比较简单，例如标记过时的功能，忽略
        //警告等。在JavaEE中注解占据了更重要的角色，例如用来配置应用程
        //序的任何切面，代替java EE1日版中所遗留的繁冗代码和XML配置等
    }
}

class Father{
    public void say(){
        System.out.println("Father say is running ~~~~~~~");
    }

}
class Son extends Father{
    //@Override这个注解可以有，也可以无
    //当加入这个注解，如果子类方法没有重写父类的方法，就会报错(编译错误)
    //这个注解的意思是子类方法重写了父类的方法
    //没有这个注解也构成注解，但是需要人工判断是否是重写了父类的方法，所以有注解可能代码的可读性
    //会更好。

    //这个注解只能修饰方法，意思是子类重写类父类的方法
    @Override
    public void say(){
        System.out.println("Father say is running ~~~~~~~");
    }

    //注解的别称为元数据
    //修饰注解的注解成为元注解
    //@Target(ElementType.METHOD)
    //@Retention(RetentionPolicy.SOURCE)
    //public @interface Override {
    //}
    //@Retention和@Target就是元注解

}
