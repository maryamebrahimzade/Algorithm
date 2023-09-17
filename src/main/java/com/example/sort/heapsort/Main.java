package com.example.sort.heapsort;

public class Main {
    public static void main(String[] args) {
        int[] a = {81,89,9,11,14,76,54,22};
        int n = a.length;
        System.out.print("Before sorting array elements are - \n");
        HeapSort.printArr(a, n);
        HeapSort.heapSort(a, n);
        System.out.print("\nAfter sorting array elements are - \n");
        HeapSort.printArr(a, n);
    }
}
