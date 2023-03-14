package com.HomeWork_;

@SuppressWarnings({"all"})
public class HomeWork03 {
    public static void main(String[] args) {
        AA aa = new AA();

        AA.BB bb = aa.new BB();// 成员内部类的实例化,有点遗忘了。。。

        //上面的定义是权限允许范围内，建议还是封装式进行创建对象

        bb.show();
    }
}

class AA{
    private String name = "jack";
    public class BB{
        public void show(){
            final String name = "john";
            System.out.println("BB name is" + name + "  ==== AA name is" + AA.this.name); //类名.this.属性/方法

        }
    }
}