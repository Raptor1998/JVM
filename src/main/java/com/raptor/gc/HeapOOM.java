package com.raptor.gc;

import java.util.ArrayList;

/**
 * @author raptor
 * @description HeapOOM
 * @date 2022/1/7 15:54
 */

//-Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
public class HeapOOM {
    // 创建1M的文件
    byte[] buffer = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();
        int count = 0;
        try {
            while (true) {
                list.add(new HeapOOM());
                count++;
            }
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("count:" + count);
        }
    }
}
