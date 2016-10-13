package com.pavlenko.algorithm;

import java.util.Arrays;

/**
 * 
 * @author Sergii Pavlenko
 * @since Nov 29, 2015
 *
 */
public class MergeSort {

    public int[] sort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
        int[] result = merge(sort(left), sort(right));
        return result;
    }

    private int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];
        while (k != left.length + right.length) {
            if (i != left.length && (j == right.length || left[i] < right[j])) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        return result;
    }

}
