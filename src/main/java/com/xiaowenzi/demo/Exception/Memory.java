package com.xiaowenzi.demo.Exception;

public class Memory {
    public static void main(String[] arg) {
        String st1 = "字符串1";
        String st2 = "字符串1";
        String st3 = new String("字符串1");
// 比较两个内容相同的常量字符串，【常量字符串】多次编译时，只创建一个对象地址
        System.out.println("st1和st2的内容相等，是真的吗？" + (st1 == st2));

        /**
         *  st1 和 st3 两个字符串的内容相同，但是这2个对象引用的地址不一样
         *  用 a.equals(b) 比较a,b两个值的内容是否相等
         *  用 a == b 比较 a,b两个值的地址引用是否相等
         */
        System.out.println("st1和st3的地址相等，是真的吗？" + (st1 == st3));   //地址不相同，所以结果为：false
        System.out.println("st1和st3的内容相等，是真的吗？" + (st1.equals(st3)));  //内容相同，所以结果为：true

    }
}
