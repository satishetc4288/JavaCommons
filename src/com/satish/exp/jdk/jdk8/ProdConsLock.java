package com.satish.exp.jdk.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProdConsLock {
    public static void main(String[] args) throws InterruptedException {
        Queue queue = new Queue();
        Thread t1 = new Thread(queue::produce);
        Thread t2 = new Thread(queue::consume);
        t1.start();t2.start();
        t1.join();t2.join();
    }

}

class Queue {
    private List<String> queue = new ArrayList<>();
    private Lock lock = new ReentrantLock();

    public void produce() {
        while (true) {
            if (!queue.isEmpty()) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("queue is full pls continue");
                continue;
            }
            lock.lock();
            for (int i = 0; i < 10; i++) {
                queue.add(i + "");
                System.out.println("producing value: " + queue.get(i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            lock.unlock();
        }
    }
    public void consume(){
        while(true){
            if(queue.isEmpty()){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("queue is empty pls continue");
                continue;
            }
            lock.lock();
            for (int i=0; i<10; i++){
                System.out.println("consuming value: " + queue.get(i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.removeAll(queue);
            lock.unlock();
        }

    }

}
