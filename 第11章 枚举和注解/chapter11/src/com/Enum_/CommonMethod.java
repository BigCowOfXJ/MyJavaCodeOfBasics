package com.Enum_;

public class CommonMethod {
    public static void main(String[] args) {
        /*
        E extends Enum<E>  表示的是 泛型类里填的泛型是Enum<E>的子类(包括Enum<K>)。
        public abstract class Enum<E extends Enum<E>>{。。。。。}
        可见得，这里使用了泛型，E就是关键字后面的类，在这里E 代表 Week（仅仅是对这个的Enum这个类而言的）

        protected Enum(String name, int ordinal) {
            this.name = name;
            this.ordinal = ordinal;
        }
        根据构造器，可以知道，把枚举对象引用名 和 序号 传进来。
         */

        Week monday = Week.MONDAY;
        //     public final String name() {
        //        return name;
        //    }回对象引用的名字=======\n" +
        System.out.println("==========返回对象的引用名==============");
        System.out.println(monday.name());    //MONDAY

        System.out.println("========返回对象引用的序号===========");
        //    public final int ordinal() {
        //        return ordinal;    //返回的就是序号(从0开始)
        //    }
        System.out.println(monday.ordinal());  //0

        System.out.println("========遍历枚举===========");

        //这里的 Week.values()方法是编译器自动加上的，但是我暂时不知道如何区追到它
        //它是存在Week这个枚举类的内部的
        Week[] weeks = Week.values();
        System.out.println("========遍历枚举1,普通for循环===========");
        //介绍两种遍历方式
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }

        System.out.println("========遍历枚举2，增墙for循环===========");
        for (Week week2 : Week.values()) {
            System.out.println(week2);
        }
        System.out.println("========遍历枚举，打印序号===========");
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i] + "-" + weeks[i].ordinal());
        }

        //valurOf进入到HashMap，HashMap里有方法
        //据此推断上面的Values方法十有八九调用的就是HashMap的Values方法了
        //    public Collection<V> values() {
        //        Collection<V> vs = values;
        //        if (vs == null) {
        //            vs = new Values();
        //            values = vs;
        //        }
        //        return vs;
        //    }


        //public static <T extends Enum<T>> T valueOf(Class<T> enumType,
        //                                                String name) {
        //        T result = enumType.enumConstantDirectory().get(name);  //这里进入到了HashMap（这里K存的是对象引用名，v对应星期N）
        //        if (result != null)
        //            return result;
        //        if (name == null)
        //            throw new NullPointerException("Name is null");
        //        throw new IllegalArgumentException(
        //            "No enum constant " + enumType.getCanonicalName() + "." + name);
        //    }
        Week k = Week.MONDAY;
        Week k2 = Week.valueOf("MONDAY");

        System.out.println(k == k2);


        //    public final int compareTo(E o) {
        //        Enum<?> other = (Enum<?>)o;
        //        Enum<E> self = this;
        //        if (self.getClass() != other.getClass() && // optimization
        //            self.getDeclaringClass() != other.getDeclaringClass())
        //            throw new ClassCastException();
        //        return self.ordinal - other.ordinal;  //这个才是最终返回的结果
        //    }
        System.out.println(weeks[1].compareTo(weeks[3]));   //实质是1 - 3
    }
}
