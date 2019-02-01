package com.satish.exp.thread;

import java.time.Instant;
import java.util.concurrent.CountDownLatch;

class Waiter implements  Runnable{

    CountDownLatch countDownLatch;

    Waiter(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        System.out.println("Waiter is started: " + Instant.now());
        try{
            countDownLatch.await();
        }catch (InterruptedException e){
            e.getStackTrace();
        }
        System.out.println("Waiter is done: " + Instant.now());

    }
}

class Decrementor implements  Runnable{

    CountDownLatch countDownLatch;

    Decrementor(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        try{
            Thread.sleep(1000);
            countDownLatch.countDown();

            Thread.sleep(1000);
            countDownLatch.countDown();

            Thread.sleep(1000);
            countDownLatch.countDown();


            Thread.sleep(1000);
            countDownLatch.countDown();


            Thread.sleep(1000);
            countDownLatch.countDown();

        }catch (InterruptedException e){
            e.getStackTrace();
        }

    }
}

public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        new Thread(new Waiter(countDownLatch)).start();
        new Thread(new Waiter(countDownLatch)).start();
        new Thread(new Decrementor(countDownLatch)).start();
    }
}
