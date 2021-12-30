package com.raptor.jvm.chapter6;


/**
 * @author raptor
 * @description IHaveNatives
 * @date 2021/12/30 18:20
 */
public class IHaveNatives {
    public native void Native1(int x);

    native static public long Native2();

    native synchronized private float Native3(Object o);

    native void Natives(int[] ary) throws Exception;
}