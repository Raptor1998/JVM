package com.raptor.jvm.chapter13;

/**
 * @author raptor
 * @description StringTest2
 * @date 2022/1/6 15:34
 */
public class StringTest2 {
    public static void main(String[] args) {
        String s1 = "a" + "b" + "c";  // 得到 abc的常量池
        String s2 = "abc"; // abc存放在常量池，直接将常量池的地址返回
        /**
         * 最终java编译成.class，再执行.class
         */
        System.out.println(s1 == s2); // true，因为存放在字符串常量池
        System.out.println(s1.equals(s2)); // true
    }
}
