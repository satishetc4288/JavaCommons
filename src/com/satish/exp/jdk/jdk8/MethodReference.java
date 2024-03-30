package com.satish.exp.jdk.jdk8;

import java.util.function.BiFunction;

public class MethodReference {

    public MethodReference(){
        System.out.println("constructor referencing here");
    }

    public static void main(String[] args) {

        /*static method references*/
        StaticReference sr = MethodReference::saySomehting;
        sr.say();

        Thread thread = new Thread(MethodReference::saySomehting);
        thread.start();

        BiFunction<Integer, Integer, Integer> adder = MethodReference::add;
        System.out.println(adder.apply(1,2));

        /*instance method reference*/
        StaticReference staticReference = MethodReference::saySomehting;
        staticReference.say();

        /*constructor references*/
        StaticReference staticReference1 = MethodReference::new;
        staticReference1.say();

    }

    public static void saySomehting(){
        System.out.println("using static reference here!");
    }

    public static int add(int a, int b){
        return a+b;
    }

    interface StaticReference{
        void say();
    }
}
