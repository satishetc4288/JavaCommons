package com.satish.exp.java8features;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        Q q = new Q();
        Thread t = new Thread(new Producer(q));
        Thread t2 = new Thread(new Consumar(q));
        t.start();
        t2.start();
        t.join();
        t2.join();
    }
}
class Q {
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

    private int value;
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
