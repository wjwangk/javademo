package com.faceobject.demo.constructionmethod.fengzhuang1;

/*
 1)建立一个myemployee1包，所有类添加到此包中。设置name属性设置为public修饰符，age属性设置为protected修饰符，
 sex属性设置为默认修饰符，address、phone分别设置为private修饰符,使用重写方法打印学生的所有信息，
 并试图观察是否访问到每个属性,并用注释说明原因

 */
public class MyEmployee1 {

    public static void main(String args[]){
    Person person = new Student();
    person.printInfo();

}
}