package com.satish.exp.commons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        if (str == null || str.isEmpty())
            System.exit(0);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1; i>-1; i--){
            stringBuilder.append(str.charAt(i));
        }

        System.out.println(stringBuilder.toString());
    }
}
