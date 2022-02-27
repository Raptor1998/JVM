package com.raptor.gc;

import java.lang.ref.WeakReference;

/**
 * @author raptor
 * @description RefTest
 * @date 2022/2/17 20:53
 */
public class RefTest {
    public static void main(String[] args) {
        // 声明强引用
        Object obj = new Object();
        System.out.println(obj.toString());
// 创建一个弱引用
        WeakReference<Object> sf = new WeakReference<>(obj);
        obj = null; //销毁强引用，这是必须的，不然会存在强引用和弱引用
        Object o = sf.get();
        Object o1 = new Object();
        System.out.println(o.toString());
        System.out.println(o1.toString());
    }
}
