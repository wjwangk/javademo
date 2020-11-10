package com.javaplan.iostream;

import java.io.*;

/**
 * 程序说明：
 *
 * 从键盘读入字符，并写入到文件中BufferedReader类的方法：String readLine()
 *
 * 作用：读一行字符串，以回车符为结束。
 *
 * BufferedWriter类的方法：bout.write(String s,offset,len)
 *
 * 作用：从缓冲区将字符串s从offset开始，len长度的字符串写到某处。
 */

public class BufferInputStream {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);   //键盘输入流读到内存
        BufferedReader br = new BufferedReader(isr);

        File file = new File("E:\\write1.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        String s;
        while ((s= br.readLine()).length()>0){
            bw.write(s,0,s.length());

        }
    }
}
