package com.satish.exp.dsa;

public class Sum3ZeroInArr {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        option1(arr);
    }

    public static void option1(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    //System.out.println(arr[i]+arr[j]+arr[k]);
                    if( arr[i]+arr[j]+arr[k] == 0){
                        System.out.println("i: " + arr[i] + ", j: " + arr[j] + ", k: " + arr[k]);
                    }

                }
            }
        }
    }

    public static void option2(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    //System.out.println(arr[i]+arr[j]+arr[k]);
                    if( arr[i]+arr[j]+arr[k] == 0){
                        System.out.println("i: " + arr[i] + ", j: " + arr[j] + ", k: " + arr[k]);
                    }

                }
            }
        }
    }
}
