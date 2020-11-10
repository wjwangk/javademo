package com.xiaowenzi.demo.Exception;

import ch.qos.logback.core.joran.conditional.ElseAction;

import java.util.Scanner;

public class borrowBooks {
    public static void main(String[] args) {
        String[] books = {"语文", "数学", "物理", "化学", "高数"};
        System.out.println("1-按照名称查找图书； 2-按照序号查找图书");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n == 1) {
            System.out.println("输入图书名称：");
            String name = input.next();

            for (int i = 0; i < books.length; i++) {

                if (books[i].equals(name)) {
                    System.out.println("book:" + name);
                    break;
                } else {
                    System.out.println("图书不存在");
                    break;
                }
            }

        } else if (n == 2) {
            System.out.println("输入图书序号：");
            int s = input.nextInt();
            boolean flag = true;
            for (int i = 0; i < books.length; i++) {
                if (i == s) {
                    System.out.println("book:" + books[i]);
                    flag = false;
                    break;
                }
            }
            if (flag) {

                System.out.println("图书不存在");
            }
        } else {
            System.out.println("命令输入有误！");
        }
    }
}