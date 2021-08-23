package org.learn.oop.equals;

public class Equals {
    public static void main(String[] args) {
        String hello1 = new String("Hello");
        String hello2 = new String("Hello");
        System.out.println(hello1 == hello2);
        System.out.println(hello1.equals(hello2));

        Integer num1 = new Integer(1);
        Integer num2 = new Integer(1);
        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));

    }
}
