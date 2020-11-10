package com.xiaowenzi.demo.scannertest;


import java.util.Scanner;

/**
  1.输入注册手机号,手机号为11位数字
 2.输入密码
 3.确认密码
 4.若输入密码等于确认密码，则提示“注册成功”，否则提示“请确认输入密码是否一致”
 */

public class RegisterTest {

    public static void main(String[] abc){
        String iphone;
        String pwd;
        String confirmPwd;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入手机号：");
        iphone = input.next();
        System.out.println("请输入密码：");
        pwd = input.next();
        System.out.println("请再次输入密码：");
        confirmPwd = input.next();

        while (iphone.length() != 11){
            System.out.println("请输入正确的手机号码");
            iphone = input.next();
        }

        if(pwd.equals(confirmPwd)){
            System.out.println("手机号："+iphone+"注册成功");
        }else {
            System.out.println("请确认输入密码是否一致");
        }
    }
}
