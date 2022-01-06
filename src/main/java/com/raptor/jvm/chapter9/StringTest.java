package com.raptor.jvm.chapter9;

/**
 * @author raptor
 * @description StringTest
 * @date 2022/1/2 15:55
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "asd";
        String s2 = new String("asd");
        s1+="asd";
        s2+="asd";
        System.out.println(s1 == s2);
    }
}
