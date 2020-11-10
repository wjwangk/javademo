package com.xiaowenzi.demo.scannertest;


import java.util.Scanner;

// 实现键盘输入用户名密码为admin/admin即登录成功
public class LoginScannerTest {

    public static void main(String args[]){
    String userName;
    String passWord;
    Scanner input = new Scanner(System.in);

        System.out.println("请输入用户名：");
        userName = input.next();

        System.out.println("请输入密码：");
        passWord = input.next();

        if(userName.equals("admin") && passWord.equals("admin")){
            System.out.println("登录成功");
        }else {
            System.out.println("用户名或密码错误");
        }
    }
}
