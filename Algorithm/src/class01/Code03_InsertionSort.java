package class01;

import static class01.Utils.printArr;
import static class01.Utils.swap;

public class Code03_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 5, 6, 7, 4, 3, 2};
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (arr[j] < arr[j-1]) {
                swap(arr, j, j-1);
                j--;
            }
        }
    }
}
