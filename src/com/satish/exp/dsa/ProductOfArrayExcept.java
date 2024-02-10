package com.satish.exp.dsa;

public class ProductOfArrayExcept {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] copy = {1,1,1,1,1};
        int temp = 1;
        for(int i=0; i<arr.length; i++){
            copy[i] = temp;
            temp *= arr[i];
        }
        temp=1;
        for(int i=arr.length-1; i>=0; i--){
            copy[i] = temp;
            temp *= arr[i];
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(copy[i] + " ");

    }
}
