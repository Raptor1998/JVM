package com.raptor.jvm.chapter8;

/**
 * @author raptor
 * @description HeapSpace
 * @date 2021/12/30 20:17
 */

/**
 * -Xms 用来设置堆空间（年轻代+老年代）的初始内存大小
 * -X：是jvm运行参数
 * ms：memory start
 * -Xmx：用来设置堆空间（年轻代+老年代）的最大内存大小
 * <p>
 * 开发中建议将初始和最大设置为一样的值
 */
public class HeapSpace {
    public static void main(String[] args) {
        long totalMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
        System.out.println("-Xms:" + totalMemory + "M");
        System.out.println("-Xmx:" + maxMemory + "M");
        System.out.println("系统内存大小:" + totalMemory * 64.0 / 1024 + "G");
        System.out.println("系统内存大小:" + maxMemory * 4.0 / 1024 + "G");
        //
        //try {
        //    Thread.sleep(1000000);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
    }
}
