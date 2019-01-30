package com.pearl.java.concurrency;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println("Inside RunnableThread with Id :"+ i);
        }
    }
}
