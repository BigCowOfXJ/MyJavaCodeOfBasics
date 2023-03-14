package com.C08_InnerClass.Detail;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal an1 = dog;

        //下面报错，这里编译器认为类型不符合
        //dog.say(an1);

        //但是这里的匿名内部类
        //class XXX extends Dog{}
        //其编译类型是编译器指定，但是这里并没有报错(个人认为这里进行了处理，所以没报错)
        //这个与上面的不同，记住这个特性就行了
        dog.say(new Dog(){

        });
    }
}
