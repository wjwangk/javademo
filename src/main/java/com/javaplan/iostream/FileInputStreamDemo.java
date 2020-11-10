package com.javaplan.iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {


    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\write.txt");

        //输出文件内容
        int a;
        while ((a = fis.read()) != -1){
            //    System.out.print(a);   //输出ascll 码形式
            System.out.print((char)a);  //强制类型转换，把内容转化成 char 类型输出

        }

        //从键盘输入到控制台
//        int b;
//        while ((b = System.in.read())!=-1){
//           // System.out.println(b);
//            System.out.print(b+" ");
//            System.out.println((char)b);   //强制类型转换
//        }


    }
}
