package com.xiaowenzi.demo.controller;

import jdk.nashorn.internal.ir.WhileNode;

public class Test {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int k = 1;
        while (i <= 20) {
            {
                k = i;
                int n = 1;
                while (n < i) {
                    k = k * (i - n);
                    n++;
                }
            /*for (int n = 1; n < i; n++) {
                k = k * (i - n);
            }*/
            }
            sum = sum + k;
            i++;
        }
        System.out.println(sum);
    }
}
