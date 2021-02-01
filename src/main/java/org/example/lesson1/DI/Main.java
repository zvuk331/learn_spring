package org.example.lesson1.DI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("person", Person.class);
        Pet pet = person.getPet();
        pet.run();

//        context.close();
    }
}
