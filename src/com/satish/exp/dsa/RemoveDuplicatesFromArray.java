package com.satish.exp.dsa;


/*can not use java collections*/

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "4", "3", "7", "10"};

        for (int i=1; i<arr.length-1; i++){
            for (int j=i-1; j>=0; j--){
                if (arr[j] != null && arr[i] == arr[j]){
                    arr[i] = null;
                }
            }
        }

        for (String string: arr){
            System.out.println(string);
        }

    }
}
