package com.satish.exp.jdk.jdk8;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        Q q = new Q();
        Thread t1 = new Thread(new Producer(q));
        Thread t2 = new Thread(new Consumar(q));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
class Q {
    private int value;
    public synchronized void getValue() throws InterruptedException{
        while(value == 0) {
            wait();
        }
        System.out.println("Get: " + value);
        --value;
        notify();
        Thread.sleep(1000);
    }

    public synchronized void  setValue() throws InterruptedException{
        while(value == 1) {
            wait();
        }
        System.out.println("Set: " + ++value);
        notify();
        Thread.sleep(1000);
    }
}

class Producer implements Runnable{
    public Producer(Q q) {
        this.q = q;
    }

    private Q q;
    public void run(){
        while(true){
                try {
                    q.setValue();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    public Q getQ() {
        return q;
    }

    public void setQ(Q q) {
        this.q = q;
    }
}

class Consumar implements Runnable{

    public Consumar(Q q) {
        this.q = q;
    }
    private Q q;
    public void run(){
        while(true){
            try {
                q.getValue();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Q getQ() {
        return q;
    }

    public void setQ(Q q) {
        this.q = q;
    }
}
