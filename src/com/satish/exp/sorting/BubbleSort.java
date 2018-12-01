package com.satish.exp.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        long[] arr = {1,3,2,3,4,2,6,5,7,6,5,6,3};
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("----##__");
        bubbleSort(arr);
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static void bubbleSort(long[] arr){

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<i; j++){
                if( arr[i] < arr[j] ){
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
