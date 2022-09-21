package com.pearl.java;

import com.pearl.java.common.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

interface OnGeekEventListener {

    // this can be any type of method
    void onGeekEvent();
}

class NonBlocking {

    private OnGeekEventListener mListener; // listener field

    BlockingDeque<Employee> employeeBlockingDeque = new LinkedBlockingDeque<>();

    // setting the listener
    public void registerOnGeekEventListener(OnGeekEventListener mListener)
    {
        this.mListener = mListener;
    }

    // My Asynchronous task
    public void doGeekStuff()
    {

        // An Async task always executes in new thread
        new Thread(new Runnable() {
            public void run()
            {
                Runtime runtime = Runtime.getRuntime();

                String []args = new String[]{};

//                try {
////                    Process exec = runtime.exec(new String[]{"cd /", "mkdir hello", "chmod 777 hello"});
//                    Process exec = runtime.exec("chmod 777 yello");
//                    int exitValue = exec.exitValue();
//
//
//
//                    if (exitValue != 0) {
//                        System.out.println("Success");
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }finally {
//
//                }

                // perform any operation
                System.out.println("Performing operation in Asynchronous Task");

                // check if listener is registered.
                if (mListener != null) {

                    // invoke the callback method of class A
                    mListener.onGeekEvent();
                }

                try {
                    System.out.println("b sleep");

                    Thread.sleep(1000);

                    System.out.println("a sleep");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    // Driver Program
    public static void main(String[] args)
    {

        NonBlocking obj = new NonBlocking();
        OnGeekEventListener mListener = new A();
        obj.registerOnGeekEventListener(mListener);
        obj.doGeekStuff();
    }
}

class A implements OnGeekEventListener {

    @Override
    public void onGeekEvent()
    {
        System.out.println("Performing callback after Asynchronous Task");
        // perform some routine operation
    }
    // some class A methods
}
