package org.learn.exception;

public class Exception1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String str = null;
        System.out.println(str.length());

        int[] arr = {1, 2, 3};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }

        try {
            A a = new B();
            B b = (B)a;
            C c = (C) b;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }
}

class A {}
class B extends A {}
class C extends A {}
