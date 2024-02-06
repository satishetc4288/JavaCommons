package com.satish.exp.dsa;

import java.util.Arrays;

public class SortingDigitalArray {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,0,0,1,1,0,1,0,1};
        main1(arr);
    }

    public static void main1(int[] arr) {
        int j = arr.length-1;
        for(int i=0; i<j;){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
        for(Integer value: arr){
            System.out.println("elem: " + value);
        }
    }
}
