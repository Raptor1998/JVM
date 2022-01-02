package com.raptor.jvm.chapter8;

/**
 * @author raptor
 * @description StackAllocation
 * @date 2022/1/1 16:34
 * <p>
 * <p>
 * -Xmx1G -Xms1G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 */
public class StackAllocation {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start) + " ms");

        // 为了方便查看堆内存中对象个数，线程sleep
        Thread.sleep(10000000);
    }

    private static void alloc() {
        // 未发生逃逸
        User user = new User();
    }

    static class User {
        //private String name;
        //private String age;
        //private String gender;
        //private String phone;
    }
}
