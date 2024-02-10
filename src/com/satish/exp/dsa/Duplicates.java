package com.satish.exp.dsa;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public static void findDuplicates(int[] arr)
    {
        int len = arr.length;
        for(int i=0; i<len; i++){
           int data = arr[i] % len;
           //System.out.println("data: " + data);
           arr[data] += len;
        }

        for (int j =0; j<len; j++){
            if(arr[j]/len >=2){
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 4, 2, 3, 1, 4, 6, 5 };
        findDuplicates(arr);
    }
}
