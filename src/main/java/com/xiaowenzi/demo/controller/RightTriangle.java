package com.xiaowenzi.demo.controller;

import ch.qos.logback.core.joran.conditional.ElseAction;
import sun.awt.geom.AreaOp;

public class RightTriangle {
    public static void main(String[] args) {
       /* System.out.println("打印直角三角形");
        int i;
        int j;
        for (i = 1; i <= 3; i++)
        {
            for (j = 1; j <= i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
       */
        System.out.println("打印菱形");
        int n = 3;
        for (int i = 1; i <= 9; i++) {
            {

                if (i <= 5) {
                    for (int k = 5 - i; k >= 0; k--) {//j--控制空格的数量
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                } else {
                    for (int k = i - 5; k >= 0; k--) {//j--控制空格的数量
                        System.out.print(" ");
                    }
                    {

                        {
                            for (int j = 2 * n + 1; j > 0; j--) {
                                System.out.print("*");

                            }

                        }
                        System.out.println();

                    }
                    n--;
                }
            }
        }
    }
}

