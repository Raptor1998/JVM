package com.raptor.jvm.chapter13;

/**
 * @author raptor
 * @description NewStringTest
 * @date 2022/1/6 17:02
 */
public class NewStringTest {
    public static void main(String[] args) {

        String s1 = "asd";

        String s2 = new String("as") + new String("d");
        String s3 = s2.intern();

        System.out.println(s2 == s3);
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
    }

}
