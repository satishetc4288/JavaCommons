package com.satish.exp.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        Integer reversedNumber = reverseNumber(number);
        System.out.println("reversed numebr is : " + reversedNumber);
    }

    private static Integer reverseNumber(Integer number) throws ArithmeticException{

        if (number == null || number.equals(0)){
            throw new RuntimeException("Number is either nulll or zero");
        }

        if (number/10 == 0)
            return number;

        Integer reverseNumber = 0;

        do{
            int remains = number%10;
            number = number/10;
            reverseNumber = reverseNumber*10+remains;

        }while (number >0);

        return reverseNumber;
    }
}