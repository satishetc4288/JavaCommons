package com.satish.exp.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Semaphores {
    public static void main(String[] args) throws InterruptedException {
        Connection connection = new Connection();
        ExecutorService es = Executors.newCachedThreadPool();
        IntStream.range(0,100).forEach( elem -> es.execute(connection::connect));
        es.shutdown();
        es.awaitTermination(1, TimeUnit.DAYS);
    }

    public static class Connection {
        private Semaphore sp = new Semaphore(10,true);
        private void connect(){
            try{
                sp.acquire();
                System.out.println("start " + Thread.currentThread().getName() + " available permits now: " + sp.availablePermits());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }catch (InterruptedException ignored){

            }finally {
                sp.release();
                System.out.println("end " + Thread.currentThread().getName() + " available permits now: " + sp.availablePermits());
            }
        }
    }
}
