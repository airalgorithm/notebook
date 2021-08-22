package class01;

public class Code04_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 22, 3, 2, 8, 9};
        System.out.println(binarySearchLocalMin(arr));
    }

    private static int binarySearchLocalMin(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        if (arr.length == 1 || arr[0] < arr[1]) return 0;
        if (arr[arr.length-1] < arr[arr.length - 2]) return arr.length-1;

        int L = 1;
        int R = arr.length - 2;
        while (L <= R) {
            int mid = L + ((R - L) >> 1);
            if ((arr[mid] < arr[mid-1]) && (arr[mid] < arr[mid+1])) {
                return mid;
            } else if (arr[mid] < arr[mid+1]) {
                R = mid-1;
            } else {
                L = mid+1;
            }
        }
        return -1;
    }

    public static void binarySearch(int[] arr, int target) {
        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int mid = (L + R) >> 1;
            if (arr[mid] == target) {
                System.out.println("找到了！ 目标： " + target + ", 在索引: " + mid);
                break;
            } else if (arr[mid] > target) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
    }

    public static void binarySearchLeft(int[] arr, int target) {
        int L = 0;
        int R = arr.length - 1;
        int index = -1;
        while (L <= R) {
//            mid = (L + R) >> 1;
            int mid = L + ((R - L) >> 1);
            if (arr[mid] >= target) {
                index = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        System.out.println(index);
    }
}
