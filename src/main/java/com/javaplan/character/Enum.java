package com.javaplan.character;

/**
 * 1.可以把枚举放在内部类中，如下所示
 * 2.枚举的常见方法：
 * valuse() 把枚举中的值以数组形式显示
 * value of() 调用枚举中的常量值
 * ordinal() 获取枚举索引位置
 */

public class Enum {
    enum  Month{
        一月,二月,三月,四月,五月,六月,七月,八月,九月,十月,十一月,十二月
    }



    enum Week{
        sunday,monday,tuesday,wednesday,thursday,friday,saturday
    }

    public static void main(String args[]){
        //values() 返回的是枚举类中所有值，以数组表示，注意这里用 类.方法() 引用
        Month month[] = Month.values();
        for(Month mm:month){
           //ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
            System.out.println(mm +"——索引为："+ mm.ordinal());
        }
        System.out.println(month.length);
        //valueOf()方法返回指定字符串值的枚举常量。
        System.out.println(Month.valueOf("五月"));

        Week week[] = Week.values();
        for(int i = 0;i<week.length;i++){
            System.out.println(week[i]);
        }

        Week enum1 = Week.saturday;
        System.out.println(enum1+"  hahaha");









    }
}
