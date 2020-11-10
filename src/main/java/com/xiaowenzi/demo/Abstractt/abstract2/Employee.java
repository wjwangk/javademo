package com.xiaowenzi.demo.Abstractt.abstract2;

/*
抽象类abstract的总结：
1. 抽象类使用abstract 声明
2. 抽象类不能被 new 实例化，可以被继承此抽象类的非抽象子类实例化对象
3. 抽象类中可以没有抽象方法，但是抽象方法必须在抽象类中
4. 抽象方法没有方法体，必须被继承此类的非抽象子类赋予方法体
5. 抽象类可以被抽象子类继承，也可以被非抽象子类继承
6. 用静态方法static修饰的方法不能做为抽象方法
7. 非抽象子类实现抽象类父类的抽象方法时，返回值类型必须与父类保持一致，否则报错
8. 抽象父类中的普通方法可以通过非抽象子类实例化后直接调用，如下TestDome 类中的 e.getName（）方法
9. 任何子类必须重写父类的抽象方法，或者声明自身为抽象类
 */

// 抽象类
public abstract class Employee {


    //1. 抽象方法只能在抽象类中    2. 抽象方法没有方法体
    public abstract void test();


    // 抽象类中的普通方法
    public int getName(String name){
        System.out.println("抽象类中的普通方法"+name);
        return 1;
    }
}
