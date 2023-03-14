package com.C06_Abstract.HomeWork_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Employee[] ems = new Employee[2];
        ems[0] = new Manage("jack", "1231287", 20000, 100000);
        ems[1] = new ComEmployee("mary", "2321321", 8000);

        String a = "asdasd";
        try {
            show(ems[0]);
            show(ems[1]);
            show(a);
        }catch(Exception e){
            System.out.println("你的类型有误");
        };
    }

    public static void show(Object e) throws Exception{
        if(e instanceof Manage){
            ((Manage)e).work();   //记住这个()，每一个都不能省略
        }else if(e instanceof ComEmployee){
            ((ComEmployee)e).work();
        }
        else{
            throw new Exception();
        }


    }
}


