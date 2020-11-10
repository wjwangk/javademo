package com.javaplan.socket;

import java.io.*;
import java.net.Socket;
/**
 * 客户端：
 * ① 创建Socket对象，指明需要连接的服务器的地址和端口号
 * ② 连接建立后，通过输出流想服务器端发送请求信息
 * ③ 通过输入流获取服务器响应的信息
 * ④ 关闭响应资源
 * @param
 */
public class TcpClient {

    public static void main(String args[]){


        try{
            Socket socket = new Socket("127.0.0.1",8088);

            OutputStream outputStream = socket.getOutputStream(); //字节输出流
            String info = "你好啊，小雯子";
            //输出
            outputStream.write(info.getBytes());
            //getBytes()—把String字符串转换成byte[]数组，因为系统默认的编码格式为byte
            socket.shutdownOutput();

           //获取输入流，接受服务器端的响应
            InputStream inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            while ((info=br.readLine())!=null){
                System.out.println("我是客户端，服务端说："+info);
            }
            socket.shutdownInput();

            //关闭资源
            outputStream.flush();
            br.close();
            inputStream.close();
            outputStream.close();
            socket.close();



        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
