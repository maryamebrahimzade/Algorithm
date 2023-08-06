package com.example.sort.heapsort;

public class Main {
    public static void main(String[] args) {
        int[] a = {45, 7, 20, 40, 25, 23, -2};
        int n = a.length;
        System.out.print("Before sorting array elements are - \n");
        HeapSort.printArr(a, n);
        HeapSort.heapSort(a, n);
        System.out.print("\nAfter sorting array elements are - \n");
        HeapSort.printArr(a, n);
    }
}
