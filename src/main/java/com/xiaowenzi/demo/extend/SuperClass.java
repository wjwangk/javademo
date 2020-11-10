package com.xiaowenzi.demo.extend;

/**
 * 继承的特性：
 * 1. 子类拥有父类非private 的属性和方法
 * 2. 子类可以拥有自己的属性和方法，即子类可以扩展父类
 * 3. 子类可以用自己的方式实现父类的方法,即子类可以重写父类的方法
 * 4. 继承使用关键字 extends ,支持单继承(A extends B)、多重继承（A extends B,B extends C），
 * 5. 不支持多继承（C extends A,B）
 * 6. This 关键字：指向本类的引用
 *     （6.1）调用当前类的构造方法，并且必须是方法的第一条语句。如：this(); 调用默认构造方法。this(参数);
 *       调用带参构造方法。
 *     （6.2）限定当前对象的数据域变量。一般用于方法内的局部变量与对象的数据域变量同名的情况。如 this.num = num。
 *        this.num 表示当前对象的数据域变量 num，而 num 表示方法中的局部变量。
 * 7. final 关键字：可以把类定义为不能继承的，即最终类；或者修饰方法时，此方法不能被子类重写
 *    声明类： final class 类名{// 类体}
 *    声明方法： 修饰符（public/private/protected/default） final 返回值类型 方法名（）{ //方法体}
 * 8. Super关键字：通过Super关键字实现对父类成员的访问,Super 语句必须是子类构造方法中的第一条语句
 * 9. 构造器：
 *
 *    9.1 调用父类的构造方法的唯一途径是使用 super 关键字
 *    9.2 子类的所有构造方法内部， 第一行会（隐式）自动先调用父类的无参构造函数super()；
 *    9.3 如果子类构造方法第一行显式调用了父类构造方法，系统就不再调用无参的super()了。
 *    9.4 如果父类没有无参构造函数，创建子类时，不能编译，除非在构造函数代码体中的第一行显式调用父类有参构造函数。
 *        // 9.4 这句话在 extend.dog 中解释不通，父类Animal中没有无参构造函数，在子类中创建无参构造器后可编译成功
 *  10. 静态方法中不能使用 super 关键字
 *
 */

public class SuperClass {
    private int n;

    SuperClass(){
        System.out.println("SuperClass()");
    }

    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

