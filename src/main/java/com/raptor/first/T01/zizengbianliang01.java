package com.raptor.first.T01;

/**
 * @author raptor
 * @description 自增变量
 * @date 2021/11/8 19:07
 */
public class zizengbianliang01 {
    public static void main(String[] args) {
        //i=1
        int i = 1;
        //i=1
        i = i++;
        // j =1 i = 2
        int j = i++;
        // k=11 j=1 i=4
        int k = i + ++i * i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
        /**
         * 赋值=，最后计算
         * =右边的从左到右加载至一次压入操作数栈
         * 实际先算那个，看远算符优先级
         * 自增、自减操作都是字节修改变量的值，不经过操作数栈
         * 最后额赋值之前，临时结果也存储在操作数栈中
         */
    }
}
