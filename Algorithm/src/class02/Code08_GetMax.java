package class02;

public class Code08_GetMax {
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 5, 6, 7, 4, 3, 2};
        System.out.println(getMax(arr));
    }

    public static int getMax(int[] arr) {
        return process(arr, 0, arr.length - 1);
    }

    private static int process(int[] arr, int L, int R) {
        if (L == R) {
            return arr[L];
        }
        int mid = L + ((R - L) >> 1);
        int leftMax = process(arr, L, mid);
        int rightMax = process(arr, mid+1, R);
        return Math.max(leftMax, rightMax);
    }
}
