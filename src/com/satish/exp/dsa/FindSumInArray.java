package com.satish.exp.dsa;

import java.util.Arrays;
import java.util.Collections;

public class FindSumInArray {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int search = -2;
        main2(arr,search);
    }
    public static void main1(int[] arr, int search) {  // unsorted way
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j] == search){
                    System.out.println("search: " + search + ", is found for elem1: " + arr[i] + ", elem2: " + arr[j]);
                }
            }
        }
    }

    public static void main2(int[] arr, int search) {
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int sum = arr[l]+arr[r];
            if(sum == search){
                System.out.println("search: " + search + ", is found for elem1: " + arr[l] + ", elem2: " + arr[r]);
                break;
            } else if (sum < search) {
                l++;
            }else {
                r--;
            }
        }
    }

    public static void main3(int[] arr, int search) {

    }
}
