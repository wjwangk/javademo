package com.javaplan.socket;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端:
 * ① 创建ServerSocket对象，绑定监听端口
 * ② 通过accept()方法监听客户端请求
 * ③ 连接建立后，通过输入流读取客户端发送的请求信息
 * ④ 通过输出流向客户端发送相应信息
 * ⑤ 关闭相关资源
 */

public class TcpServer {
    public static void main(String args[]){
        try{
            //创建一个服务器socket，即 ServerSocket，指定绑定的端口
            ServerSocket serverSocket = new ServerSocket(8088);
            System.out.println("-----服务器即将启动，等待客户端的连接-----");
            //调用 accept()方法开始监听，等待客户端的连接
            Socket socket = serverSocket.accept();

            //获取输入流，并读入客户端的信息
            InputStream in = socket.getInputStream(); //字节输入流
            InputStreamReader inreader = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(inreader);
            String info = null;
            while ((info = br.readLine())!= null){
                System.out.println("我是服务器，客户端说："+info);
            }
            socket.shutdownInput();   //关闭输入流

            //获取输出流，相应客户端的信息
            OutputStream outputStream = socket.getOutputStream();
            info = "这里是服务器端，我们接受到了你的请求信息，正在处理...处理完成！";
            outputStream.write(info.getBytes());

            //关闭资源
            outputStream.close();

            br.close();
            inreader.close();
            in.close();
            socket.close();
            serverSocket.close();


        }catch (IOException e){
             e.printStackTrace();
        }
    }
}
