package com.satish.exp.java8features;

/*A interface which has just one abstract method is known as functional intefarce*/

public class Lambdas {

    public static void main(String[] args) {

        Test test = new Test() {
            @Override
            public void say() {
                System.out.println("Not using lambda here!");
            }
        };
        test.say();

        Test test1 = () -> {
            System.out.println("Using lambda here folks!");
        };
        test1.say();
    }

    interface Test {
        void say();
    }
}
