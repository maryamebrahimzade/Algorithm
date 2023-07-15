package com.example.sort.bubblesort;

public class BubbleSort {
    public static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp =array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
class Main{
    public static void main(String[] args) {
        int[] array={3,60,35,2,45,320,5};
        System.out.print("Array Before Bubble Sort:");
        BubbleSort.printArray(array);
        System.out.println();
        BubbleSort.sort(array);
        System.out.print("Array After Bubble Sort:");
        BubbleSort.printArray(array);
    }
}
