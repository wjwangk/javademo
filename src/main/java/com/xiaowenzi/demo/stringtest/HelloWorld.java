package com.xiaowenzi.demo.stringtest;


    public class HelloWorld {
        public static void main(String[] args) {
            // Java文件名
            String fileName = "HelloWorld.java";
            // 邮箱
            String email = "laurenyang@imooc.com";

           int i = 10 ;   //定义一个int 基本类型
            Integer a = new Integer(i); //手动装箱
            Integer b = i;   // 自动装箱
           Integer j = new Integer(8);   //定义一个Integer类型的包装类，值为8
           int m = j.intValue();     //手动拆箱
           int n = j;    //自动拆箱

            //基本类型转换为字符串
            int c = 8 ;    //定义一个基本类型
            String d = Integer.toString(c);    //方法一
            String e = String.valueOf(c);      //方法二
            String f = c + " ";                //方法三

            String str = "abc";
            int h = Integer.parseInt(str);    //方法一
            int g = Integer.valueOf(str);     //方法二

            // 判断.java文件名是否正确：合法的文件名应该以.java结尾
        /*
        参考步骤：
        1、获取文件名中最后一次出现"."号的位置
        2、根据"."号的位置，获取文件的后缀
        3、判断"."号位置及文件后缀名
        */
            //获取文件名中最后一次出现"."号的位置
            int index = fileName.lastIndexOf('.');
            System.out.println(index);   // index =10
            // 获取文件的后缀
            String prefix =fileName.substring(index+1);   //第10位时".",要获取后缀，应该从.以后计算
            System.out.println(prefix);

            // 判断必须包含"."号，且不能出现在首位，同时后缀名为"java"
            if (index !=-1  && index != 0 && prefix == "java" ) {
                System.out.println("Java文件名正确");
            } else {
                System.out.println("Java文件名无效");
            }

            // 判断邮箱格式是否正确：合法的邮箱名中至少要包含"@", 并且"@"是在"."之前
         /*
        参考步骤：
        1、获取文件名中"@"符号的位置
        2、获取邮箱中"."号的位置
        3、判断必须包含"@"符号，且"@"必须在"."之前
        */
            // 获取邮箱中"@"符号的位置
            int index2 =email.indexOf('@');

            // 获取邮箱中"."号的位置
            int index3 = email.indexOf('.');

            // 判断必须包含"@"符号，且"@"必须在"."之前
            if (index2 != -1 && index3 > index2) {
                System.out.println("邮箱格式正确");
            } else {
                System.out.println("邮箱格式无效");
            }
        }
    }

