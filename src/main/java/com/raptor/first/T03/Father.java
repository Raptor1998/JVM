package com.raptor.first.T03;

/**
 * 父类的初始化<clinit>
 * 1.j=method()
 * 2.父类的静态代码块
 * <p>
 * 父类实例化方法：
 * 1.super()（最前）
 * 2.i=test()
 * 3.父类的非静态代码块
 * 4.父类的无参构造（最后）
 * <p>
 * 非静态方法前面有一个默认地向this
 * this在构造器或<init>()它表示的是正在创建的对象，因为这里创建的Son对象，所以
 * test()执行的是子类重写的代码
 * <p>
 * 这里i=test()执行的是子类重写的test()方法
 */
public class Father {
    private int i = test();
    public static int j = method();

    static {
        System.out.println("(1)");
    }

    Father() {
        System.out.println("(2)");
    }

    {
        System.out.println("(3)");
    }

    public int test() {
        System.out.println("(4)");
        return 1;
    }

    public static int method() {
        System.out.println("(5)");
        return 1;
    }

}
