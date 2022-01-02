package com.raptor.jvm.chapter8;

/**
 * @author raptor
 * @description EscapeTest
 * @date 2022/1/1 15:38
 */
public class EscapeTest {
    //public void my_method() {
    //    V v = new V();
    //    // use v
    //    // ....
    //    v = null;
    //}
    public static StringBuffer createStringBufferON(String s1, String s2) {
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2);
        return sb;
    }
    //如果想要StringBuffer sb不发生逃逸，可以这样写
    public static String createStringBufferOFF(String s1, String s2) {
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2);
        return sb.toString();
    }
}
