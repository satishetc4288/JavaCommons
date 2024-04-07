package com.satish.exp.multithreading;

import java.util.concurrent.*;

public class SingleThreadExecutorEx {
    public static void main(String[] args) {
        ExecutorService executor = newSingleThreadExecutor();
        Future<Integer> future = executor.submit( () -> {
           for(int i =0; i<10; i++){
               System.out.println("printing value: " + i);
               Thread.sleep(500);
           }
           return 9;
        });
        executor.shutdown();
        System.out.println("shutdown initiated");
        try {
            System.out.println("returned number is: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }

}
