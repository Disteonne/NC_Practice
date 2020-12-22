package com.nc.l5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {7, 3, 4, 9, 2, 6, 1};
        //Arrays.sort(a);
        System.out.println(binarySearch(a,2));
    }

    public static int binarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length-1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (element < array[middle]) {
                right = middle - 1;
            } else {
                if (element > array[middle])
                    left = middle + 1;
                else
                    return middle;
            }
        }
        return -1;
    }
}
