package com.raptor.jvm.chapter1;

/**
 * @author raptor
 * @description HelloAPP
 * @date 2021/11/25 21:37
 */
class HelloApp {
    private static int a = 1;  // 准备阶段为0，在下个阶段，也就是初始化的时候才是1

    static {
        a = 10;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}