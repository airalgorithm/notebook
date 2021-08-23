package org.learn.oop.finalize;

public class Finalize_ {
    public static void main(String[] args) {
        Car car = new Car("宝马");
        System.out.println(car.getName());
        car = null;
        System.gc();
    }
}

class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Car 被销毁了");
    }
}
