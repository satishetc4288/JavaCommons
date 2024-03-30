package com.satish.exp.dsa;

public class CheckPrime {

    private static boolean isPrimeNumber(int number){

        if(number == 2){
            return true;
        }else if(number < 0 || number == 1 || number%2 == 0){
            return false;
        }

        for (int i =2; i<number; i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i<100; i++){
            if(isPrimeNumber(i))
                System.out.println(i + " is a prime number");
        }
    }
}
