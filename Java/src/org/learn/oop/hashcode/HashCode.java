package org.learn.oop.hashcode;

public class HashCode {
    public static void main(String[] args) {
        AA aa1 = new AA();
        AA aa2 = new AA();
        System.out.println(aa1.hashCode());
        System.out.println(aa2.hashCode());
    }
}

class AA {

}
