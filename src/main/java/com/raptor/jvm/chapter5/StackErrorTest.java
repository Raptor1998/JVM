package com.raptor.jvm.chapter5;

/**
 * @author raptor
 * @description StackErrorTest
 * @date 2021/12/28 15:37
 */
public class StackErrorTest {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }
}