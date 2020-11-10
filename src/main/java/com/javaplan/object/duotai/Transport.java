package com.javaplan.object.duotai;

public class Transport extends Vehicle{

   private final String  car = "车";
   private final String Bus="公交";
   private  final String bicycle="自行车";

    public  String goHome(){
         return "回家";
    }

    @Override
    public void run() {
        super.run();
        System.out.println("骑"+bicycle+goHome());
        System.out.println("打"+car+goHome());
        System.out.println("坐"+Bus+goHome());

    }


}
