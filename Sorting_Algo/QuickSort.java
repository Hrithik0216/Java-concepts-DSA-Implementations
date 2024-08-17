package Sorting_Algo;
import java.util.*;

public class QuickSort {
    public static void quickSort(int s, int e, int[] arr) {
        if (s >= e) {
            return;
        }
        int low = s;
        int high = e;
        int pivot = arr[low + (high - low) / 2];

        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        quickSort(s, high, arr);
        quickSort(low, e, arr);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 8, 9, 4, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        int end = arr.length - 1;
        int start = 0;
        quickSort(start, end, arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}