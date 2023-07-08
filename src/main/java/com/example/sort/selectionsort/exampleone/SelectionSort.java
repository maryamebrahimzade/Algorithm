package com.example.sort.selectionsort.exampleone;

public class SelectionSort {
    public static void Sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j; ////searching for lowest index
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 3, 9, 4, 1, 6, 2, 8, 7};
        System.out.print("Before Selection Sort: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        SelectionSort.Sort(array);
        System.out.print("After Selection Sort: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
