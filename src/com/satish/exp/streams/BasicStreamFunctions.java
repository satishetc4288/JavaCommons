package com.satish.exp.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicStreamFunctions {

    //Runnable test = () -> { };
    public static void main(String[] args) {

        Runnable groupingBy = () -> { Stream.of("jhauhqbdiwdhwsasjjhasjh".split("")).collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting()))
                    .entrySet().forEach(System.out::println);};
        //groupingBy.run();

        Runnable reverseOrder = () -> {Stream.of(1,2,3,4,5,6,8,2,4,29,8).sorted(Comparator.reverseOrder()).forEach(System.out::println);};
        //reverseOrder.run();

        Runnable max = () -> { Stream.of(1,2,3,4,5,3,2,1,7,6,9,8).sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);};
        Runnable min = () -> { Stream.of(1,2,3,4,5,3,2,1,7,6,9,8).sorted().limit(3).forEach(System.out::println);};
        //max.run(); min.run();

        Runnable palindrone = () -> {
            String str = "madam"; boolean bol = IntStream.range(0, str.length()/2).allMatch( i -> str.charAt(i) == str.charAt(str.length()-1-i) );
            System.out.println(bol);
        }; //palindrone.run();

        Runnable sumOfAllDigit = () -> {
            Integer sum = Stream.of(String.valueOf(12345).split("")).collect(Collectors.summingInt(Integer::parseInt));
            System.out.println(sum);
        }; //sumOfAllDigit.run();

        Runnable commonElem = () -> {
          List<Integer> list = Arrays.asList(1,2,3,4,5,6), list2 = Arrays.asList(2,4,6);
          list.stream().filter(list2::contains).forEach(System.out::println);
        }; //commonElem.run();

        Runnable stringWord = () -> {
            String newSent = Arrays.stream("satish singh rajput".split(" ")).map( word -> new StringBuilder(word).reverse())
                    .collect(Collectors.joining(" "));
            System.out.println(newSent);
        }; //stringWord.run();

        Runnable evenOdd = () -> {
           Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.partitioningBy( elem -> elem%2 == 0)).entrySet().forEach(System.out::println);
        }; //evenOdd.run();

        //Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        Runnable prePostMod = () -> {
            String data = Stream.of("satish", "singh", "rajput").map(str -> "[" + str + "]").collect(Collectors.joining(","));
            System.out.println(data);
        }; //prePostMod.run();

        Runnable MaxMin = () -> {
            Optional<Integer> maxData = Stream.of(1,2,3,4,5,6,7,8,90).max(Comparator.naturalOrder());
            System.out.println(maxData.get());
            Optional<Integer> minData = Stream.of(1,2,3,4,5,6,7,8,90).min(Comparator.naturalOrder());
            System.out.println(minData.get());
        }; //MaxMin.run();

        //How do you merge two unsorted arrays into single sorted array without duplicates?
        Runnable sortMix = () -> {
            Arrays.asList(1,3,5,2,4,7).addAll(Arrays.asList(6,3,1,8,2,9))
        }; sortMix.run();
    }

}
