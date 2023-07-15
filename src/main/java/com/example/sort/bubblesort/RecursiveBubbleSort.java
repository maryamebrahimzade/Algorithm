package com.example.sort.bubblesort;

public class RecursiveBubbleSort {
    public static void recursiveSort(int[] array,int length) {
        int count = 0;
        if (array.length == 1) { // Base case
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) { //swap
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count+=1;
            }
        }
        if (count == 0) {
            return;
        }
        recursiveSort(array, array.length-1); //Largest element is fixed
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
class RecursiveMain{
    public static void main(String[] args) {
        int[] array={3,60,35,2,45,320,5};
        System.out.print("Array Before Bubble Sort:");
        RecursiveBubbleSort.printArray(array);
        System.out.println();
        RecursiveBubbleSort.recursiveSort(array, array.length);
        System.out.print("Array After Bubble Sort:");
        RecursiveBubbleSort.printArray(array);
    }
}
