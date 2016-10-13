package com.pavlenko.algorithm;

public class QuickSort {

    public static int[] quickSort(int[] inputArray) {
        return quickSort(inputArray, 0, inputArray.length - 1);
    }

    public static int[] quickSort(int[] inputArray, int start, int end) {
        if (end - start < 1) {
            return inputArray;
        }
        int pivot = inputArray[start + (end - start) / 2];
        int i = start;
        int j = end;
        while (i <= j) {
            if (inputArray[i] < pivot) {
                i++;
                continue;
            }
            if (inputArray[j] > pivot) {
                j--;
                continue;
            }
            swap(inputArray, i, j);
            i++;
            j--;
        }
        quickSort(inputArray, start, j);
        quickSort(inputArray, i, end);
        return inputArray;
    }

    private static void swap(int[] inputArray, int i, int j) {
        int k = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = k;
    }
}
