package com.C07_Interface;

public class ExtendsVSInterface {
    public static void main(String[] args) {

    }
}

class EE{}
interface EE02{}
interface EE03{}
interface EE04{}


//这里就不多写额外的内容了

//java 中 ：extends 对应关系 1 ： 1，就是一个
//         interface 对应关系1 ：n ，就是像一个。
//接口是单继承机制的一种补充。
class FF extends EE implements EE02,EE03,EE04{}
