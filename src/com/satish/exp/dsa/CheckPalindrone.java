package com.satish.exp.dsa;

public class CheckPalindrone {

    private static boolean ifPalindrone(String str){
        char[] arr = str.toCharArray();
        int j = arr.length-1;
        for(int i=0; i < arr.length/2; i++, j--){
           if(arr[i] != arr[j])
               return false;
        }
        return  true;
    }

    public static void main(String[] args) {
        System.out.println( ifPalindrone("bob"));
    }
}
