package com.xiaowenzi.demo.controller;

import ch.qos.logback.core.joran.conditional.ElseAction;

import javax.validation.constraints.Max;

// 打印数组中的最大值，最小值，平均值
public class array {
    public static void main(String[] args) {
        int score[] = {61, 23, 4, 74, 13, 148, 20};
        int max = score[0];
        int min = score[0];
        double avg;
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
            if (max > score[i]) ;
            {
                max = score[i];
            }
            if (min > score[i]) ;
            {
                min = score[i];
            }
        }
        avg = sum / (score.length);
        System.out.println("数组中的最大值：" + max);
        System.out.println("数组中的最小值：" + min);
        System.out.println("数组中的平均值：" + avg);

    }
}
/*数组的使用方法：
1）定义数组类型；  int[] nums;    int nums[];
2)定义数组长度： nums=new int[length];
将以上步骤合并： int[] nums=new nums[length];
3)数组赋值：nums={1,2,3,4,4,5};
以上步骤合并：int[] nums={1,2,3,4,4,5};    等价于：int[] nums=new nums[]{1,2,3,4,4,5};
4)数组的处理： 例如打印数组使用： Arrays.toString(nums)
*/