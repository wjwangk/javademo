package com.xiaowenzi.demo.Exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class BorrowBook {

    String[] books = {"高数", "数据结构", "语文", "物理"};

    public void  getName(){
        System.out.println("请输入图书名称：");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        boolean flag = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(name)){
                System.out.println("book:" + name);
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("图书不存在!");
            choseBooks();
        }
    }
    public void getId() {
        System.out.println("请输入图书序号：");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        for (int i = 0; i < books.length; i++) {
            if (i == id){
                System.out.println("book:" + books[i]);
                return;
            }
        }
        System.out.println("图书不存在!");
        choseBooks();
    }

    public void choseBooks() {
        System.out.println("输入命令：1-按照名称查找图书； 2-按照序号查找图书");
        Scanner input = new Scanner(System.in);

        try {
            int n = input.nextInt();
            switch (n) {
                case 1:
                    getName();
                    break;
                case 2:

                    getId();
                    break;
                default:
                    System.out.println("图书不存在");
                    choseBooks();

            }
        } catch (InputMismatchException e) {
            System.out.println("输入命令错误！请根据提示输入数字命令!");
            choseBooks();
       //     getId();
        }
    }
    public static void main(String[] args) {
        BorrowBook bb = new BorrowBook();
        bb.choseBooks();
    }


}


