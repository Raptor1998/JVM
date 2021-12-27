package com.raptor.first.T05;

import java.text.BreakIterator;

/**
 * @author raptor
 * @description digui
 * @date 2021/11/9 10:52
 */
public class digui {
    public static void main(String[] args) {
        System.out.println("asd");
        System.out.println(go(4));
        System.out.println("2314");
    }

    public static int go(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return go(n - 2) + go(n - 1);
    }

}
