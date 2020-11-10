package com.javaplan.object.fengzhuang;



public class PassObject {


    public void printAreas(Circle c, int time){
        System.out.println("Radius\t"+"Area");
        for(int i=1;i<=time;i++){
         //   System.out.println(i);
            c.setRadius(i);
            System.out.println(i+"\t"+c.findArea());

        }

    }

    public static void main(String[] args){
        PassObject po = new PassObject();
        Circle c = new Circle();
        po.printAreas(c,5);
    }
}
