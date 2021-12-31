package com.raptor.jvm.chatper8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raptor
 * @description OOMTest
 * @date 2021/12/31 16:37
 */
public class OOMTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        while(true) {
            list.add(999999999);
        }
    }
}
