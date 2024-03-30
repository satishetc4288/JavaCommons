package com.satish.exp.dsa;

import java.util.Scanner;

public class SpringPermutations {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        printStringPermutaitons(scanner.next());
    }

    private static void printStringPermutaitons(String string){
        System.out.println(string.substring(0,2));
    }
}
