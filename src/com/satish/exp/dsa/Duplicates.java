package com.satish.exp.dsa;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public static List<Integer> findDuplicates(int[] arr)
    {
        List<Integer> duplicates = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] / n >= 2) {
                duplicates.add(i);
            }
        }
        return duplicates;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5, 6, 6 };

        System.out.println("The repeating elements are: ");
        List<Integer> ans = findDuplicates(arr);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
