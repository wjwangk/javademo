package com.javaplan.character;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMethod {
    double a = 10.9805;
    float b = 5.2f;
    BigDecimal bd1 = new BigDecimal(Double.toString(a));
    BigDecimal bd2 = new BigDecimal(Float.toString(b));

    /**
     * 普通加减乘除法得到的结果小数点后多位
     * 注:根本原因是:十进制值通常没有完全相同的二进制表示形式;
     * 十进制数的二进制表示形式可能不精确。只能无限接近于那个值
     */
    public void jiaJian(){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }

    /**
     * 使用 BigDecimal 方法，用来对超过16位有效位的数进行精确的运算
     */
    public void getBigDecimal(){
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));

        /**
         * 对于除法，结果不能整除，有余数时，会报java.lang.ArithmeticException;
         * 要避免这个错误产生，在进行除法运算的时候,使用：
         * divide(BigDecimal，保留小数点后几位小数，舍入模式)
         */
        System.out.println(bd1.divide(bd2,2,BigDecimal.ROUND_HALF_DOWN));
        //ROUND_HALF_DOWN ——向（距离）最近的一边舍入，除非两边（的距离）是相等,如果是这样，向下舍入, 例如1.55 保留一位小数结果为1.5

        /**
         * 需要对BigDecimal进行截断和四舍五入可用 setScale 方法
         * setScale(保留小数点后几位，摄入模式)
         */
        System.out.println(bd2.setScale(2));   //为什么换成 bd2 就能运行成功，bd1 就报错
        System.out.println(bd2.setScale(2,RoundingMode.HALF_DOWN));

    }

    public void compare(){
        BigDecimal num1 = new BigDecimal("0");
        BigDecimal num2 = new BigDecimal("1");
        BigDecimal num3 = new BigDecimal("2");
        BigDecimal num = new BigDecimal("1");

        System.out.println(num1.compareTo(num));     //小于时，返回 -1
        System.out.println(num2.compareTo(num));     //等于时，返回 0
        System.out.println(num3.compareTo(num));     //大于时，返回 1

    }

    public static void main(String[] args){
        BigDecimalMethod bm = new BigDecimalMethod();
        bm.jiaJian();
        bm.getBigDecimal();
        bm.compare();
    }
}
