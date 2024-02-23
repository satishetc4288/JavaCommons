package com.satish.exp.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class AdvancedStreams {
    public static void main(String[] args) {
        Integer[] intArray = {12,4,12,17,34,89,27,39,40};

        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        Arrays.asList(intArray).stream().filter( num -> (num +"").charAt(0) =='1').forEach(System.out::println);

        //How to find duplicate elements in a given integers list in java using Stream functions?
        Arrays.asList(intArray).stream()
                .collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() >1).forEach(System.out::println);

        //Given a list of integers, find the maximum value element present in it using Stream functions?
        Arrays.asList(intArray).stream().max( (a,b) -> a.compareTo(b)).ifPresent(System.out::println);

        //Given a String, find the first non-repeated character in it using Stream functions?
        Arrays.asList("satish singh rajput".split("")).stream()
                .collect(Collectors.groupingBy( x->x, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()==1).findFirst().ifPresent(System.out::println);


    }
}
