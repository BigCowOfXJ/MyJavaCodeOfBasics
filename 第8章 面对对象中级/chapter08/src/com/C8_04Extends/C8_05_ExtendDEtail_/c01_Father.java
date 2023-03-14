package com.C8_04Extends.C8_05_ExtendDEtail_;

public class c01_Father {
    public int n1;
    protected double n2;
    char n3;
    private String n4;

    public c01_Father(){
        System.out.println("Father(){....}  is useing");
    }

    public c01_Father(String name){
        System.out.println("c01_Father(String name){.....} is running");
    }

    public String getN4(){
        return n4;
    }

    public void n5(){
        System.out.println("n5() is useing~~~~~");
    }

    protected void n6(){
        System.out.println("n6() is useing~~~~~");
    }

    void n7(){
        System.out.println("n7() is useing~~~~~");
    }

    private void n8(){
        System.out.println("n8() is useing~~~~~");
    }

    public void callN8(){
        n8();
    }



}
