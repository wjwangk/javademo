package com.xiaowenzi.demo.net;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;

public class ipAddress {

    public static void main(String[] args){
        getLocalHost();
        getSocketPort();
    }

    public static   void getLocalHost(){

        System.out.println("-------获取ip地址-----------");
        try {
            // 获取本地ip地址
            InetAddress address1 = InetAddress.getLocalHost();
            System.out.println(address1);
            InetAddress address2 = InetAddress.getByName("127.0.0.1");
            System.out.println(address2);
            InetAddress address3 = InetAddress.getByName("localhost");
            System.out.println(address3);

            // 获取域名ip地址
            InetAddress address4 = InetAddress.getByName("www.baidu.com");
            System.out.println(address4);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void getSocketPort(){
        System.out.println("-------获取ip地址和端口号-----------");
        //定义ip:port
        InetSocketAddress ipport =new  InetSocketAddress("127.0.0.1",8080);
        System.out.println(ipport);
        InetSocketAddress ipport1 =new  InetSocketAddress("localhost",8080);
        System.out.println(ipport1);

        System.out.println(ipport.getAddress());
        System.out.println(ipport.getHostName());   // 获取地址
        System.out.println(ipport.getPort());       //获取端口号


    }
}
