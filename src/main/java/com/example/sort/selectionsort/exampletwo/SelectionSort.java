package com.example.sort.selectionsort.exampletwo;

import java.util.Scanner;

public class SelectionSort {
    public static void Sort(int[] array, int size) {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) { //arr[j] <arr[index]
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int size;
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        size = scan.nextInt();
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        SelectionSort.Sort(array, size);
        System.out.print("Now the Array after Sorting is :\n");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
