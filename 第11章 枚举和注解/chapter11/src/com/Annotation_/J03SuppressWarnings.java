package com.Annotation_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings({"all"})
public class J03SuppressWarnings {

    //这里会有警告，如果不太喜欢就用SppressWarnings抑制警告
    //它也可以放在类上
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("============整体遍历============");
        System.out.println(list);

        System.out.println("============逐个遍历遍历============");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        System.out.println("============迭代器遍历/增强for循环============");
        for(Integer l1 : list){
            System.out.println(l1);
        }

        System.out.println("============迭代for不用泛型============");
        //迭代器不用泛型的写法
        Iterator iterator2 = list.iterator();
        while(iterator2.hasNext()){
            System.out.println((Integer) iterator2.next());  //这里默认返回的类型是Object
        }

        System.out.println("============迭代器遍历使用泛型============");
        Iterator<Integer> iterator = list.iterator();

        //private class Itr implements Iterator<E> {.......}  //E是泛型
        //        public boolean hasNext() {
        //            return cursor != size;
        //        }
        while(iterator.hasNext()){
            // public E next() {   //使用到泛型，返回E，没定义是Object
            //            checkForComodification();
            //            int i = cursor;
            //            if (i >= size)
            //                throw new NoSuchElementException();
            //            Object[] elementData = ArrayList.this.elementData;
            //            if (i >= elementData.length)
            //                throw new ConcurrentModificationException();
            //            cursor = i + 1;   //引用下移
            //            return (E) elementData[lastRet = i]; //返回下移前一个元素
            //        }
            System.out.println((iterator.next()));

        }






    }
}
