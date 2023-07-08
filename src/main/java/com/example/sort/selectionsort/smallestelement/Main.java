package com.example.sort.selectionsort.smallestelement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 3, 6, 2, 10};
        Integer[] sortedArray=SortArray.sort(array);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("The smallest element of the array: " + sortedArray[0]);
    }
}
