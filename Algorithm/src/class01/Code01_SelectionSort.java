package class01;


import static class01.Utils.*;

public class Code01_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 5, 6, 7, 4, 3, 2};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }

    public static void selectionSort(int[] arr){
        if (arr == null || arr.length < 2) return;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

}

