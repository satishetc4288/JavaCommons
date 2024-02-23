package com.satish.exp.dsa;

public class Trading {
    public static void main(String[] args) {
        int[] arr = {2,7, 1, 4, 2, 3, 2};
        System.out.println("Max profit is: " + main2(arr));
    }

    public static int main1(int[] prices) {
        int bIndex = 0, max_profit = 0, bIndexTrue=0;
        int sIndex = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[bIndex] > prices[i]){
                bIndex = i;
            } else if (prices[i] - prices[bIndex] > max_profit){
                max_profit = prices[i] - prices[bIndex];
                sIndex = i;
                bIndexTrue = bIndex;
            }
        }
        System.out.println("buy: " + prices[bIndexTrue] + ", sell: " + prices[sIndex]);
        return max_profit;
    }

    public static int main2(int[] prices) {
        int bIndex = 0, max_profit = 0, bIndexTrue=0;
        int sIndex = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[bIndex] > prices[i]){
                bIndex = i;
            } else if (prices[i] - prices[bIndex] > max_profit){
                max_profit = prices[i] - prices[bIndex];
                sIndex = i;
                bIndexTrue = bIndex;
            }
        }
        System.out.println("buy: " + prices[bIndexTrue] + ", sell: " + prices[sIndex]);
        return max_profit;
    }
}
