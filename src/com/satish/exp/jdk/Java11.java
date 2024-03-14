package com.satish.exp.jdk;

import java.util.Arrays;
import java.util.function.Predicate;

public class Java11 {
    private static String[] strArr = {"my","name","is","satish","singh"};
    public static void main(String[] args) {
        //stringFunctions();
        //coll2Array();
        //notPredicate();
        lambdaLocalVar();
    }
    static void methodReference(String str){
        System.out.println(str);
    }
    private static void stringFunctions() {
        String multiLinString = "my name is \n satish singh rajput \n i am from hyderabad \n and i work at cdk global";
        multiLinString.lines().forEach(Java11::methodReference);
    }
    private static void coll2Array(){
        String[] array = Arrays.asList("my","name","is","satish","singh").toArray(String[]::new);
        for(String arr: array){
            System.out.println(arr);
        }
    }
    static void notPredicate(){
        Arrays.asList("my","name","is","satish","singh").stream()
                .filter(Predicate.not( data -> data.equals("satish"))).forEach(Java11::methodReference);
    }
    static void lambdaLocalVar(){
        Arrays.asList(strArr).stream().map( ( var x) -> x.toUpperCase()).forEach(Java11::methodReference);
    }

    /*A No-Op Garbage Collector
    A new garbage collector called Epsilon is available for use in Java 11 as an experimental feature.
    It’s called a No-Op (no operations) because it allocates memory but does not actually collect any garbage. Thus, Epsilon is applicable for simulating out of memory errors.
    Obviously Epsilon won’t be suitable for a typical production Java application; however, there are a few specific use-cases where it could be useful:
    Performance testing
    Memory pressure testing
    VM interface testing and Extremely short-lived jobs
    In order to enable it, use the -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC flag.*/

}
