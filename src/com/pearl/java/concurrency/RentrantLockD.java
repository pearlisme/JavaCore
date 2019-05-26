package com.pearl.java.Concurrent;

import java.util.concurrent.locks.*;

public class RentrantLockD {

    private ReentrantLock lock = new ReentrantLock();
    private ReentrantLock fairLock = new ReentrantLock(true);
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private StampedLock stampedLock = new StampedLock();


    private static int count = 0;

    public RentrantLockD perform() {

        lock.lock();
        System.out.println("Lock Acquired");
        try {
            count++;
            System.out.println("count :" + count);
        } finally {
            lock.unlock();
        }
        return this;

    }

    public RentrantLockD performTryLock() {

        boolean isLockAcquired = lock.tryLock();
        System.out.println("isLockAcquired :" + isLockAcquired);
        if (isLockAcquired) {
            try {
//            Code goes here
                System.out.println("lock.getHoldCount() : " + lock.getHoldCount());
                System.out.println("lock.isHeldByCurrentThread() :" + lock.isHeldByCurrentThread());
                System.out.println("lock.getQueueLength() :" + lock.getQueueLength());
                System.out.println("lock.hasQueuedThreads() :" + lock.hasQueuedThreads());
                System.out.println("lock.isFair() :" + lock.isFair());
                System.out.println("fairLock.isFair() :" + fairLock.isFair());
                System.out.println("fairLock.isLocked() :" + fairLock.isLocked());
                fairLock.lock();
                System.out.println("after locking");
                System.out.println("fairLock.isLocked() :" + fairLock.isLocked());
                System.out.println("fairLock.isLocked() :" + fairLock.isLocked());
                count++;
                System.out.println("count :" + count);
            } finally {
                lock.unlock();
                fairLock.unlock();
            }
        }

        return this;
    }

    public RentrantLockD performReadWriteLock() {

        Lock readLock = readWriteLock.readLock();
        Lock writeLock = readWriteLock.writeLock();

        readLock.lock();

        readLock.unlock();

        writeLock.lock();

        writeLock.unlock();

        return this;

    }

    public RentrantLockD readWithOptimisticLock() {

        long stamp = stampedLock.tryOptimisticRead();

        System.out.println("stamp :" + stamp);

        if (!stampedLock.validate(stamp)) {
            stamp = stampedLock.readLock();
            try {
                count++;
                System.out.println("count :" + count);
            } finally {
                stampedLock.unlock(stamp);
            }
        }
        return this;
    }

    private RentrantLockD reentrantLockWithCondition(){

        Condition stackEmptyCondition = lock.newCondition();
        Condition stackFullCondition = lock.newCondition();
        try {
            lock.lock();
            stackFullCondition.await();
            stackEmptyCondition.signalAll();
            stackEmptyCondition.await();
            stackFullCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return this;
    }

    public static void main(String[] args) {

        new RentrantLockD().perform().performTryLock().performReadWriteLock().readWithOptimisticLock().reentrantLockWithCondition();

    }
}
