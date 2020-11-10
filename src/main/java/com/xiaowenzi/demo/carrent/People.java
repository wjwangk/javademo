package com.xiaowenzi.demo.carrent;

public class People {

    /**
     * 获取账单
     */
    public void getBill(int[] indexs, Car[] cars, int day) {
        double rent = 0;
        int count1 = 0;
        int count2 = 0;
        int peopleCapacity = 0;
        double goodsCapacity = 0;
        String[] str1 = new String[indexs.length];    //定义一个载人的数组
        String[] str2 = new String[indexs.length];    //定义一个载货的数组
        for (int i = 0; i < indexs.length; i++) {        //循环需要租车的数量
            for (int j = 0; j < cars.length; j++) {
                if (indexs[i] == cars[j].getId()) {       //如果输入的第i量车的租车序号和 car类中的id相同
                    rent = rent + cars[j].getRent();      //计算租金
                    if (1 == cars[j].getType() || 3 == cars[j].getType()) {   //如果车的类型为载人或者既能载人又能载货
                        str1[count1] = cars[j].getName();
                        peopleCapacity = peopleCapacity + cars[j].getPeopleCapacity();
                        count1++;
                    }
                    if (2 == cars[j].getType() || 3 == cars[j].getType()) {
                        str2[count2] = cars[j].getName();
                        goodsCapacity = goodsCapacity + cars[j].getGoodsCapacity();
                        count2++;
                    }
                }
            }
        }
        System.out.println("***可载人的车有：");
        for (int i = 0; i < str1.length; i++) {
           /* if (null != str1[i] && "" != str1[i]){
                System.out.print(str1[i] + " ");
            } */
            if (null != str1[i]) {
                System.out.print(str1[i] + " ");
            }
        }
        System.out.println("共载人：" + peopleCapacity + "人");
        System.out.println("***可载货的车有：");
        for (int i = 0; i < str2.length; i++) {
           /* if (null != str2[i] && "" != str2[i]){
                System.out.print(str2[i]+" ");
            } */
            if (str2[i] != null) {
                System.out.print(str2[i] + " ");
            }
        }
        System.out.println("共载货：" + goodsCapacity + "吨");

        System.out.println("租车总价格：" + rent * day + "元");
    }
}
