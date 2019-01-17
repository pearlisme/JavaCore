package com.pearl.java.Concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {

    private static Lock lockA = new ReentrantLock();
    private static Lock lockB = new ReentrantLock();

    public static void execute() {

        System.out.println("Thread Started");

        new Thread(DeadLock::processThis).start();
        new Thread(DeadLock::processThat).start();

        System.out.println("Thread Ended");
    }

    public static void processThis() {

        lockA.lock();

        System.out.println(Thread.currentThread().getName());

        lockB.lock();

        lockA.unlock();

        lockB.unlock();

    }

    public static void processThat() {

        lockB.lock();

        System.out.println(Thread.currentThread().getName());

        lockA.lock();

        lockB.unlock();

        lockA.unlock();
    }
}
