package com.satish.exp.java8features;

import java.util.concurrent.Callable;
import java.util.function.*;

public class ThreadExample {
    public static void main1() {
        Predicate<String> predicate = (name) -> name.equals("satish");
        Runnable runnable = () -> System.out.println("My name is satish");
        Callable<String> callable = () -> "satish";
        Supplier<Integer> supplier = () -> 35;
        Consumer<Integer> consumer = (age) -> System.out.println("My age is : " + age);
        Function<String,String> function = (name) -> "my name is: " + name;
        BiFunction<String, Integer, String> biFunction = (name,age) -> "my name is :" + name + ", and age is: " + age;
        new Thread(() -> System.out.println("my name is satish")).start();
    }

    public static void main(String[] args) {

    }
}
