package com.C07_Interface;

public class C05InterfacePoly {
    public static void main(String[] args) {
        OA oa = new OA();
        OB ob = new OB();

        IA bb = oa;
        IB cc = oa;  //存在多态

        IA dd = ob;
        IB ee = ob;

        System.out.println(oa.getClass());
        System.out.println(ob.getClass());
        System.out.println(bb.getClass());
        System.out.println(cc.getClass());
        System.out.println(dd.getClass());
        System.out.println(ee.getClass());

    }
}

interface IA{}
interface IB extends IA{}

//下面这样的写法等同于：interface IC extends IB{}
//因为IB继承类IA，所以IC继承IB即继承了IB和IA
interface IC extends IB,IA{}
interface ID extends IB{}

class OA implements IC{}
class OB implements IC{}