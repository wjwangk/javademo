package com.javaplan.character;

/**
 * 1.枚举跟普通类一样可以用自己的变量、方法和构造函数,
 *2. 构造函数只能使用 private 访问修饰符，所以外部无法调用。
 * 3.注意枚举不能用 new 实例化对象，程序运行时，会自动隐世调用枚举的构造方法
 * 4. 调用枚举中的常量，可以通过 EnumTest et = EnumTest.bluee;
 * 5 .枚举中的普通方法调用方式： et.putong(),
 * 5.
 */
public enum  EnumTest {
    red,
    yellow,
    bluee,
    other(1),
    hh(),
    ss("ss");


    private EnumTest(){
        System.out.println("这是枚举的构造方法，只能用 private 修饰");
        System.out.println("Constructor "+toString());
    }

    private EnumTest(int a){
        System.out.println("int型有参构造方法"+a);
    }

    private EnumTest(String ss){
        System.out.println("String型有参构造方法"+ss);
    }


    public void getInfo(String color){
        System.out.println("这是枚举的普通方法呀！"+color);
    }

    public static void main(String args[]){
//        EnumTest str[] = EnumTest.values();
//        System.out.println("--------------");
//        for(EnumTest mm:str){
//            System.out.println(mm);
//        }


//        EnumTest et = EnumTest.bluee;
//        System.out.println(et);
//        et.getInfo("white");  //调用普通方法
    }

}
