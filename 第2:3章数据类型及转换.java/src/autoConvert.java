public class autoConvert{
    public static void main(String[] args) throws Exception {
        //  数据类型转换
        //  遵循小转大的规律
        int num = 'a';  
        double d1 = 80;
        //char n2 = 97;   这句其实应该报错
        char n2 = (char)97;

        System.out.println(n2);//    这个是对的，是个例外，但c语言也是这样的，所以联合记忆
        System.out.println(num);
        System.out.println(d1);
        //这里我想到了‘+’的使用
        //  浅提一下
        System.out.println(num + 'a');    //据结果194，单字符不进行拼接
        System.out.println(num + 'a' + "abc");//   多字符拼接，但有顺序
        System.out.println("abc" + num + 'a' + "abc");
    }
}
