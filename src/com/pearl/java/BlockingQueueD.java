package com.pearl.java;

import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueD {

    static BlockingQueue<Employee> employeeBlockingQueue = new ArrayBlockingQueue<Employee>(10);

    public static void main(String[] args) throws Exception {

        new BlockingQueueD().publishEmployee();

        System.out.println(employeeBlockingQueue.element());

        new BlockingQueueD().subscribEmployee();
        new BlockingQueueD().subscribEmployee();
        new BlockingQueueD().subscribEmployee();
    }

    @Async
    private void subscribEmployee() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
                System.out.println("Task handled by thread:"+Thread.currentThread().getName());
                Employee employee = employeeBlockingQueue.poll();
                System.out.println("Retrived Employee from queue"+employee);
//            }
//        }).start();

    }


    public void publishEmployee() throws Exception{
        System.out.println("Task handled by thread:"+Thread.currentThread().getName());
        employeeBlockingQueue.add(new Employee(100,"Mysteos","Assasins"));
        System.out.println("Successfully posted employee in queue"+employeeBlockingQueue);
    }



}
