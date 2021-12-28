package com.raptor.jvm.chapter5;

/**
 * @author raptor
 * @description StackTest
 * @date 2021/12/28 15:24
 */
public class StackTest {

    public void methodA() {
        int a = 1;
        int b = 2;
        methodB();
    }

    private void methodB() {
        int p = 34;
        int q = 123;
    }

    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        stackTest.methodA();
    }


    public void test3() {
        int a = 1;
        {
            int b = 2;
            b = a + 1;
        }
        //变量c使用的是已经销毁的b的solt
        int c = 3;
    }
}
