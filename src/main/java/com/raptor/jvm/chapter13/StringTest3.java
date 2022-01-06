package com.raptor.jvm.chapter13;

/**
 * @author raptor
 * @description StringTest3
 * @date 2022/1/6 15:53
 */
public class StringTest3 {
    public static void main(String[] args) {
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";   //编译期间优化
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4); //T
        System.out.println(s3 == s5); //F
        System.out.println(s3 == s6); //F
        System.out.println(s3 == s7); //F
        System.out.println(s5 == s6); //F
        System.out.println(s5 == s7); //F
        System.out.println(s6 == s7); //F

        String s8 = s6.intern();
        System.out.println(s3 == s8); //T
    }
}
