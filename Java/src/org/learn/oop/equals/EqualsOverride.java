package org.learn.oop.equals;

public class EqualsOverride {
    public static void main(String[] args) {
        Person person1 = new Person("张三", 18, '男');
        Person person2 = new Person("张三", 18, '男');
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Person) {
            Person p = (Person)o;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}