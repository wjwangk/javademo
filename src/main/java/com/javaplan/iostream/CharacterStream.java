package com.javaplan.iostream;
import java.io.*;
public class CharacterStream {
    /**
     * 利用程序将文件a.CHM 拷贝到a.chm中。
     * 这里分别用了四种方式，也算对这些的流的速率的一个对比，这四种情况分别是：
     * 1）基本字节流每次读一个字节
     * 2）基本字节流每次读一组字节
     * 3）高效字节流每次读一个字节（即包装流）
     * 4）高效字节流每次读一组字节（即包装流）
     */

    public static void main(String[] args) throws IOException {
        String source = "E:\\app-ANDROID_BASE-debug.apk";
        String dict ="copy.apk";
        long startTime1 = System.currentTimeMillis();
        method1(source,dict);
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1-startTime1+"毫秒");
        long startTime2 = System.currentTimeMillis();
        method2(source,dict);
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2-startTime2+"毫秒");
        long startTime3 = System.currentTimeMillis();
        method3(source,dict);
        long endTime3 = System.currentTimeMillis();
        System.out.println(endTime3-startTime3+"毫秒");
        long startTime4 = System.currentTimeMillis();
        method4(source,dict);
        long endTime4 = System.currentTimeMillis();
        System.out.println(endTime4-startTime4+"毫秒");




    }

    // 基本字节流每次读 一个 字节
    public static void method1(String source,String dict) throws IOException{
        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(dict);
        int a;
        while ((a = fis.read())!=-1){
            fos.write(a);
        }
        fos.close();
        fis.close();
    }

    // 基本字节流每次读 一组 字节
    public static void method2(String source,String dict) throws IOException{
        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(dict);

        byte[] b = new byte[1024];
        int len;
        while ( (len = fis.read(b))!= -1){
            fos.write(b,0,len);

        }
        fos.close();
        fis.close();
    }
    // 高效字节流每次读 一个 字节
    public static void method3(String source,String dict) throws IOException{
        FileInputStream fis = new FileInputStream(source);
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream(dict);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int a;
        while ((a= fis.read())!=-1){
            fos.write(a);
        }


        bos.close();
        bis.close();

    }

    // 高效字节流每次读 一组 字节
    public static void method4(String source,String dict) throws IOException{
        FileInputStream fis = new FileInputStream(source);
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream(dict);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] b = new byte[1024];
        int len;
        while ( (len = fis.read(b))!= -1){
            fos.write(b,0,len);

        }
        fos.close();
        fis.close();

    }
}
