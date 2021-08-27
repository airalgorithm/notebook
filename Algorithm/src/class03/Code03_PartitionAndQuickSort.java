package class03;

import java.util.Arrays;

public class Code03_PartitionAndQuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 5, 6, 7, 4, 3, 2};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        int less = -1;
        int index = 0;
        int more = nums.length - 1;
        while (index <= more) {
            if (nums[index] == 1) {
                index++;
            } else if (nums[index] < 1) {
                nums[index++] = nums[++less];
                nums[less] = 0;
            } else {
                nums[index] = nums[more];
                nums[more--] = 2;
            }
        }
    }

    public static int[] netherlandsFlag(int[] arr, int L, int R) {
        if (L > R) return new int[] {-1, -1};
        if (L == R) return new int[] {L, R};

        int less = L - 1;
        int more = R;
        int index = L;
        while (index < more) {
            if (arr[index] == arr[R]) {
                index++;
            } else if (arr[index] < arr[R]) {
                swap(arr, index++, ++less);
            } else {
                swap(arr, index, --more);
            }
        }
        swap(arr, more, R);
        return new int[] {less+1, more};
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
//        process1(arr, 0, arr.length-1);
        process2(arr, 0, arr.length-1);
    }

//    public static void process1(int[] arr, int L, int R) {
//        if (L >= R) return;
//        int M = partition(arr, L, R);
//        process1(arr, L, M - 1);
//        process1(arr, M + 1, R);
//    }

    public static void process2(int[] arr, int L, int R) {
        if (L >= R) return;
        swap(arr, L + (int)(Math.random() * (R - L + 1)), R);
        int[] equalArea = netherlandsFlag(arr, L, R);
        process2(arr, L, equalArea[0]-1);
        process2(arr, equalArea[1]+1, R);
    }
}
