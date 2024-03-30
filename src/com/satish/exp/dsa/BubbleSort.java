package com.satish.exp.dsa;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        String input = "a@bcd#EF";
        char[] arr = input.toCharArray();
        //Output : "F@Edc#ba"
        int i = 0;
        int j = input.length()-1;
        while(i<j){
            boolean a = String.valueOf(arr[i]).matches("[a-zA-Z]");
            boolean b = String.valueOf(arr[j]).matches("[a-zA-Z]");
            if(!a){
                i++;
            }
            if(!b){
                j--;
            }
            if(a && b ){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        for(char c: arr){
            System.out.println("letter: " + c);
        }

    }
}
