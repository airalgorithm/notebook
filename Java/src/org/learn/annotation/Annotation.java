package org.learn.annotation;

public class Annotation {
    public static void main(String[] args) {
        Child parent = new Child();
        parent.fly();
    }
}

@SuppressWarnings("all")
class Parent {
    @Deprecated
    public void fly() {
        System.out.println("Parent fly...");
    }
}

@SuppressWarnings("all")
class Child extends Parent {
    @Override
    public void fly() {
        System.out.println("Child fly...");
    }
}

