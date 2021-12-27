package com.raptor.first.T02;

/**
 * @author raptor
 * @description damlimoshi02
 * @date 2021/11/8 19:30
 */
public class Singleton02 {
}
/**
 * 只有一个实例
 * 必须自行创建这个实例
 * 向整个系统提供这个实例
 * <p>
 * 饿汉式：直接创建对象，不存在线程安全问题
 * 1.直接实例化饿汉式
 * 2.枚举式
 * 3.静态代码块（适合复杂实例化）
 * 懒汉式：延迟创建对象
 * 4.线程不安全（使用单线程）
 * 5.线程安全
 * 6.静态内部类（使用多线程）
 */
class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {

    }
}

enum Singleton2 {
    INSTANCE
}

class Singleton3 {
    public static final Singleton3 INSTANCE;

    //当string需要动态获取
    private String s;

    static {
        String s1 = "xxx";
        INSTANCE = new Singleton3(s1);
    }

    private Singleton3(String s) {
        this.s = s;
    }
}

class Singleton4 {
    private static Singleton4 INSTANCE;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        //部分逻辑  线程不安全
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        INSTANCE = new Singleton4();

        return INSTANCE;
    }
}

class Singleton5 {
    private static Singleton5 INSTANCE;

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        //线程安全
        if (INSTANCE == null) {
            synchronized (Singleton5.class) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton5();
            }
        }
        return INSTANCE;
    }
}

class Singleton6 {

    private Singleton6() {

    }

    //静态被不累不会自动随着外部类的加载和初始化而初始化，他是单独去加载和初始化的
    //因为实在内部类加载和初始化，所以是线程安全的
    private static class Inner {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return Inner.INSTANCE;
    }
}
