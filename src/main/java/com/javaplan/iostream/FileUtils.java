package com.javaplan.iostream;

import java.io.File;
import java.io.IOException;

/**
 * 实现功能：
 * 输出一个目录中的所有文件名（目录可能是多级目录，如a目录中有b、c目录。。。）
 *摘自 https://blog.csdn.net/qq_22063697/article/details/52137369
 */

public class FileUtils {

    public static void listDir(String dir) throws IOException {
        File file = new File(dir);
            //传进来的可能不是一个目录    isDirectory()——判断是否为目录
        if (!file.isDirectory()) {
            throw new IOException(dir+"不是目录");
            //传进来的可能是一个错误的路径
        }if(file == null){
            throw new IOException("没有此路径");
        }

        File[] files = file.listFiles();
        for(File f: files){
             //有可能是一个多级目录，递归调用
            if(f.isDirectory()){
                listDir(f.getAbsolutePath());
             //   listDir(f.getPath());
                //是文件就直接输出该文件的绝对路径
            }
            else {
            System.out.println(f.getAbsoluteFile());
            }

        }
    }


    public static void main(String[] args) throws IOException{
        FileUtils.listDir("E:\\jj");
    }
}
