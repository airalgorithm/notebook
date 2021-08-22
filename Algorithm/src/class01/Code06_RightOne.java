package class01;

public class Code06_RightOne {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(n & (~n + 1));
        bit1Count(15);
    }

    private static void bit1Count(int n) {
        int count = 0;
        while (n != 0) {
            int rightOne = n & (~n + 1);
            count++;
            n ^= rightOne;
        }
        System.out.println(count);
    }


}
