package com.raptor.first.T03;

/**
 * @author raptor
 * @description main
 * @date 2021/11/8 20:06
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 1.一个类的创建实例需要先加载初始化该类
         *      main方法所在的类需要先加载和初始化
         * 2.一个子类要初始化需要先初始化父类
         * 3.一个类初始化就是执行<clinit>()方法
         *      <clinit>方法由静态类变量显示赋值代码和静态代码块组成
         *      类变量显示赋值代码和静态代码块代码从上到下顺序执行
         *      <clinit>方法只执行一次
         */
        Son son1 = new Son();
        System.out.println();
        Son son2 = new Son();
    }
}
