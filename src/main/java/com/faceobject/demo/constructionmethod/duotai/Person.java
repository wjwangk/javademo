package com.faceobject.demo.constructionmethod.duotai;

public class Person {
  String name;
  int age;

  public void showInfo(String name,int age){

      System.out.println("姓名:"+name +" "+"年龄:"+age);
  }

 /* public Person(){
      System.out.println("父类的无参构造方法");
  }
  */


  public Person(String name,int age){
      System.out.println("父类的有参构造方法");
  }

}


