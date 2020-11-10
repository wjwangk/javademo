package com.javaplan.fanshe;
/**
 * 获取Class对象的三种方式
 * 1 Object ——> getClass();
 * 2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
 * 3 通过Class类的静态方法：forName（String  className）(常用)
 *
 */
public class FanShe {
    public static void main(String args[]){
        //第一种方法获取 class 对象
        Student stu1 = new Student();   //这一new 产生一个Student对象，一个Class对象
        Class stuClass = stu1.getClass(); //获取class对象
        System.out.println(stuClass.getName());

       //第二种方法获取class对象
        Class stuClass2 = Student.class;
        System.out.println(stuClass == stuClass2);  //判断第一种和第二种获取到的class对象是否是同一个

        try{

            //注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
            Class stuClass3 = Class.forName("com.javaplan.fanshe.Student");
            System.out.println(stuClass3 == stuClass2); //判断三种方式是否获取的是同一个Class对象

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}
