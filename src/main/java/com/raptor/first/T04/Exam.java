package com.raptor.first.T04;

import java.util.Arrays;

/**
 * @author raptor
 * @description Exam
 * @date 2021/11/9 10:30
 */
public class Exam {

    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 200;
        int[] arr = {1, 2, 3, 4, 5};
        MyData my = new MyData();
        change(i, str, num, arr, my);
        System.out.println("i=" + i);
        System.out.println("str=" + str);
        System.out.println("num=" + num);
        System.out.println("arr=" + Arrays.toString(arr));
        System.out.println("my.a=" + my.a);
    }

    /**
     * 实参给形参赋值
     *
     * @param j 基本数据类型  数据值
     * @param s 引用数据类型  地址值     String、包装类等对象不可变性
     * @param n
     * @param a
     * @param m
     */
    public static void change(int j, String s, Integer n, int[] a, MyData m) {
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        m.a += 1;
        System.out.println(j);
        System.out.println(s);
        System.out.println(n);
        System.out.println(Arrays.toString(a));
        System.out.println( m.a);
    }
}

class MyData {
    int a = 10;
}
