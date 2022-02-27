package com.raptor.Third;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author raptor
 * @description LockProcess
 * @date 2022/2/27 15:47
 */
public class LockProcess {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
    }
}
