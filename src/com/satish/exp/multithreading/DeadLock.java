package com.satish.exp.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {
    static class Locker {
        public void lockMe(Lock lock1, Lock lock2){
            lock1.lock();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock2.lock();
            lock1.unlock();
            lock2.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Locker locker = new Locker();
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();
        Thread t1 = new Thread(() ->{
            locker.lockMe(lock1,lock2);
        });
        Thread t2 = new Thread(() ->{
            locker.lockMe(lock2,lock1);
        });
        t1.start();
        t2.start();
        t1.join();t2.join();
    }
}
