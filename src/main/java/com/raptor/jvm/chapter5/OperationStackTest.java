package com.raptor.jvm.chapter5;

/**
 * @author raptor
 * @description OperationStackTest
 * @date 2021/12/29 14:51
 */
public class OperationStackTest {
    public void test() {
        int i = 1;
        int a = i++;
        int b = ++i;
    }
}
