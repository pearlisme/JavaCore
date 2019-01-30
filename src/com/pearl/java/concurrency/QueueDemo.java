package com.pearl.java.concurrency;

import java.util.concurrent.*;

public class QueueDemo {


    public static void main(String[] args) {

//        demoBlockingQueue();


        try {
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

            blockingDeque.offer(91);
            blockingDeque.offer(5,2,TimeUnit.MINUTES);
            blockingDeque.offer(4,100,TimeUnit.MICROSECONDS);
            blockingDeque.offer(3,4,TimeUnit.SECONDS);

            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
            System.out.println(blockingDeque.poll(200, TimeUnit.NANOSECONDS));
            System.out.println(blockingDeque.poll(1, TimeUnit.SECONDS));


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static void demoBlockingQueue() {
        try {
            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

            blockingQueue.offer(39);
            blockingQueue.offer(3,4, TimeUnit.SECONDS);

            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10,TimeUnit.SECONDS));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
