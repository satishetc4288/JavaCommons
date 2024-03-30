package com.satish.exp.dsa;

public class MinimalSum {
    public static void main(String[] args) {
        int aum[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(minimalSum(aum));
    }

    private static int minimalSum(int[] a){
        int minimalVal = Integer.MAX_VALUE;
        int index = 0;
        for(int i=0; i<a.length; i++){
            int sum = 0;
            for(int j=0; j<a.length; j++){
                sum += Math.abs(a[i]-a[j]);
            }
            if(minimalVal > sum){
                minimalVal = sum;
                index = i;
            }

        }
        return index;
    }
}
