package com.xiaowenzi.demo.shuixianhua;

public class shuixianhuashu {
    /*
    打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
    例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
     */
    public static void main(String args[]){
     int nums;
     int[] str = new int[9];
     int j = 0;
     for(int i = 100;i <= 999;i++){
        nums = i;
        int a = i/100;
        int b = i%100/10;
        int c = i%100%10;
        int d =a*a*a + b*b*b + c*c*c;
        if(nums == d){
            System.out.println(nums+"是一个水仙花数");
          //    str[j]=nums;
          //    j++;
        //    System.out.println(str[j]);
        }
        else{
            continue;
        }

    }

    }
}
