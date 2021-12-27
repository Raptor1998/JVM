package com.raptor.first.T06;

/**
 * @author raptor
 * @description Exam6
 * @date 2021/11/9 14:26
 */
public class Exam6 {
    /**
     * 局部变量：每个线程，每次调用执行的都是新的声明周期
     * 实例变量：随着对象的创建而初始化，随着对象的回收而消亡，每一个实例变量都是独立的
     * 类变量：随着类的初始化而初始化，随着类的卸载而消亡，该类的所有对象的类变量是共享的
     */
    /**
     * 局部变量：栈
     * 实例变量：堆
     * 类变量：方法去
     */
    static int s;
    int i;
    int j;

    {
        int i = 1;
        //就近原则
        i++;
        j++;
        s++;
    }

    public void test(int j) {
        j++;
        //作用域
        i++;
        s++;
    }

    public static void main(String[] args) {
        Exam6 obj1 = new Exam6();
        Exam6 obj2 = new Exam6();
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        /*
        i=2,j=1,s=5
        i=1,j=1,s=5
         */
        System.out.println("i=" + obj1.i + ",j=" + obj1.j + ",s=" + s);
        System.out.println("i=" + obj2.i + ",j=" + obj2.j + ",s=" + s);
    }
}
