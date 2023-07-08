package com.example.recursive.sumnumbers;

public class SumOfNumbers {
    private static int sum(int[] array, int length) {
        if (length == 1) {
            return array[0];
        } else {
            return sum(array, length - 1) + array[length - 1];
        }
    }

    private static int sum2(int[] array, int length) {
        if (length == 0) {
            return 0;
        } else {
            return array[length-1] + sum2(array, length - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6,33};
        System.out.println("The sum of the numbers of an array: " + sum(array, array.length));
        System.out.println("The sum of the numbers of an array: " +sum2(array, array.length));
    }
}
