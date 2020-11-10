package com.javaplan.character;

public class StringBufferTest {

    /**
     * 为什么 equals的结果都是 false 呢； 答：因为这里看源码可知，这里的equals就是==；
     * 而string中的equals 是被重写了，所以才会仅仅比较值
     */
    public void compare(){
        StringBuffer stringBuffer  = new StringBuffer("abc098");
        StringBuffer stringBuffer1 = new StringBuffer("abc098");
        StringBuffer stringBuffer2 = new StringBuffer("abc");
        stringBuffer2.append("098");
        System.out.println(stringBuffer2);
        System.out.println(stringBuffer == stringBuffer1);
        System.out.println(stringBuffer.equals(stringBuffer1));
        System.out.println(stringBuffer.equals(stringBuffer2));
        System.out.println(stringBuffer1.equals(stringBuffer2));
    }

    public static void main(String[] args){

       StringBufferTest sbt = new StringBufferTest();
       sbt.compare();

        // 定义StringBuffer 字符串
//        StringBuffer sb = new StringBuffer("a bcd pou123 w");
//        sb.append("abc");    //字符串拼接
//        sb.append(1);
//        System.out.println("字符串拼接："+sb);
//        sb.reverse();       //字符串反转
//        System.out.println("字符串反转："+sb);
//        sb.delete(0,3);    //public delete(int start, int end)注意这里end值为3，移除前2位，可运行程序
//        System.out.println("移除部分子字符串"+sb);
//        sb.replace(0,3,"ttt");
//        System.out.println("字符串替换："+sb);
//        sb.capacity();
//        System.out.println("当前字符串容量为："+sb);
//        System.out.println("截取字符串"+sb.substring(2,8));
//        System.out.println("哈希码："+sb.hashCode());

    }

}
