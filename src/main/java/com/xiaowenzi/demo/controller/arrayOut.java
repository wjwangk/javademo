package com.xiaowenzi.demo.controller;

import java.util.Arrays;

public class arrayOut {
    //完成 main 方法
    public static void main(String[] args) {
        int[] score1 = {89, -23, 64, 91, 119, 52, 73};
        arrayOut hello = new arrayOut();
        int[] conut = hello.sort(score1);
        System.out.println("考试成绩的前三名为：");
        System.out.println(conut[0]);
        System.out.println(conut[1]);
        System.out.println(conut[2]);
    }

    //定义方法完成成绩排序并输出前三名的功能
    public int[] sort(int[] score) {
        int[] result = new int[score.length];
        Arrays.sort(score);
        int j = 0;
        for (int i = score.length - 1; i > 0; i--) {
            if (score[i] >= 0 && score[i] <= 100) {
                {
                    result[j] = score[i];
                    j++;
                }

            } else {
                continue;
            }

        }
        return result;
    }
/*    public int[] sort(int[] score) {
        int[] result = new int[3];
        int j = 0;
        Arrays.sort(score);
        for (int i = score.length-1; i >0; i--) {
            if (score[i] >= 0 && score[i] <= 100) {
                result[j] = score[i];
                j++;
                if (j >= 3){
                    break;
                }
            } else {
                continue;
            }

        }
        return result;
    } */
}