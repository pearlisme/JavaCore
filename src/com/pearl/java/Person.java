package com.pearl.java;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        Objects.requireNonNull(name);

        this.name = name;
        this.age = age;
    }

    public Person() {

        this.name ="Mysteos";
        this.age = 30;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
