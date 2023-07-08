package com.example.recursive.maxnumberinlist;

public class MaximumNumberInList {
    private static int MaxRecursive(Integer[] arr, int length) {
        if (length == 1)
            return arr[0];
        return Math.max(MaxRecursive(arr, length - 1), arr[length - 1]);
    }

    public static void main(String[] args) {
        Integer[] array = {34, 78, 10, 90,146,7};
        System.out.println("Maximum number in a list:" + MaxRecursive(array, array.length));
    }
}
