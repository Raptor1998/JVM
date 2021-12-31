package com.raptor.jvm.chatper8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raptor
 * @description GCTest
 * @date 2021/12/31 17:57
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "test";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}