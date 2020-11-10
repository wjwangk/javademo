package com.faceobject.demo.constructionmethod.test3;

/*
编写Car类属性：车名、颜色、产地，实现run()方法
1)  添加有参构造方法，在构造方法中给成员赋值，并调用run()方法。
2)  重载run()方法，给run()方法传递一个int类型参数speed，输出此方法信息。
 */
public class Car {
    String carName;
    String carColor;
    String carPlace;

    public void run(){
        System.out.println("产自"+carPlace+"的"+carColor+carName+"在公路上跑");
    }

    public Car(String carName,String carColor,String carPlace ){
        this.carName = carName;
        this.carColor = carColor;
        this.carPlace = carPlace;


    }

    public void run(int speed){
      System.out.println("产自"+carPlace+"的"+carColor+carName+"以每公里"+speed+"km的速度"+"在公路上跑");
    }

    public static void main(String args[]){
        Car car = new Car("奥迪A6","红色","德国");
        car.run();
        car.run(120);

    }

}
