package class01;

import static class01.Utils.printArr;
import static class01.Utils.swap;

public class Code02_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 5, 6, 7, 4, 3, 2};
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
}
