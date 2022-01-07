package com.raptor.jvm.chapter13;

/**
 * @author raptor
 * @description StringExer
 * @date 2022/1/6 15:09
 */
public class StringExer {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringExer ex = new StringExer();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);   //good
        System.out.println(ex.ch);    //best
    }
}