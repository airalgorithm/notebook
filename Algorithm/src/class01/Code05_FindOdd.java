package class01;

public class Code05_FindOdd {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        int[] arr2 = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6};
        findTwoOdd(arr2);
    }

    private static void findOdd(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        System.out.println(eor);
    }

    private static void findTwoOdd(int[] arr) {
        int eor1 = 0;
        int eor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            eor1 ^= arr[i];
        }
        int rightOne = eor1 & (~eor1 + 1);
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rightOne) != 0) {
                eor2 ^= arr[i];
            }
        }
        System.out.println(eor2 + " " + (eor1 ^ eor2));
    }
}
