package com.satish.exp.commons;

public class Fibonnaci {

    public static void main(String[] args) {
        printFibonnaci(20);
    }

    private static void printFibonnaci(int providedSize){

        if(providedSize == 0){
            return;
        }else if(providedSize ==1){
            System.out.println(1);
            return;
        }else if(providedSize == 2){
            System.out.println(1 + "\n" + 1);
            return;
        }

        providedSize--;
        providedSize--;

        System.out.println(1 + "\n" + 1);

        int old = 1;
        int latest = 1;
        int value = 2;

        for(int i=0; providedSize > 0; providedSize--){
            System.out.println(value);
            old  = latest;
            latest = value;
            value = latest+old;
        }
    }
}
