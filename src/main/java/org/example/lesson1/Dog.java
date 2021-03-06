package org.example.lesson1;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{
    private String name;
    private int age;

    public Dog() {

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
    public void run() {
        System.out.println("I run");
    }
}
