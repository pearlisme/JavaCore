package com.pearl.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentMain {

    private static int counter = 0;

    public static void main(String[] args) {


        ExecutorService service = null;
        RunnableThread  rt = null;
        try {
            service = Executors.newWorkStealingPool();

            System.out.println("System begins");

//            service.execute(() -> System.out.println("Printing zoo inventories"));

//            final List<Runnable> runnables = service.shutdownNow();

//            rt = new RunnableThread();
//            Future<?> submit = service.submit(rt);
//            System.out.println(submit);
//            System.out.println(service.getClass());
//            runnables.forEach(System.out::print);
//            service.execute(() -> {for (int i = 0; i < 10; i++) {
//                System.out.println("inventory "+ i);
//            }});
//            service.execute(() -> System.out.println("Printing zoo inventories"));
//            service.execute(() -> System.out.println("End"));


            /*Future<?> submit = service.submit(() -> {
                for (int i = 0; i < 500; i++) {
                    counter++;
                }
            });
            System.out.println(submit.isCancelled());
            submit.get(10, TimeUnit.SECONDS);
            submit.cancel(false);
            System.out.println(submit.isCancelled());
            System.out.println("reached !");*/





        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(service != null) service.shutdown();
        }
    }

}
