package com.javaplan.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\write.txt");  //这个代码每运行一次，内容会被刷新一次
   //     FileInputStream fis = new FileInputStream("E:\\write.txt");   不能边写边读
        int a;
        while ((a = System.in.read())!= -1){
              fos.write(a);
        }



    }
}
